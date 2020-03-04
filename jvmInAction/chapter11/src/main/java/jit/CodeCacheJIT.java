package jit;

import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;

import java.lang.reflect.Method;

public class CodeCacheJIT implements Opcodes {
    public static void createAndCall(String helloStr, String className) throws Exception{
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS|ClassWriter.COMPUTE_FRAMES);
        cw.visit(V1_7,ACC_PUBLIC,className,null,"java/lang/Object",null);
        MethodVisitor mw = cw.visitMethod(ACC_PUBLIC, "<init>","()V",null,null);
        mw.visitVarInsn(ALOAD,0);
        mw.visitMethodInsn(INVOKESPECIAL,"java/lang/Object","<init>","()V",false);
        mw.visitInsn(RETURN);
        mw.visitMaxs(0,0);
        mw.visitEnd();

        mw = cw.visitMethod(ACC_PUBLIC+ACC_STATIC,"main","([Ljava/lang/String;)V",null,null);
        mw.visitFieldInsn(GETSTATIC,"java/lang/System","out","Ljava/io/PrintStream;");
        mw.visitLdcInsn(helloStr);
        mw.visitMethodInsn(INVOKEVIRTUAL,"java/io/PrintStream","println","(Ljava/lang/String;)V",false);
        mw.visitInsn(RETURN);
        mw.visitMaxs(0,0);
        mw.visitEnd();
        byte[] code = cw.toByteArray();
        JITClassLoader loader = new JITClassLoader();
        Method m;
        m = ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, int.class, int.class);
        m.setAccessible(true);
        Class exampleClass = (Class)m.invoke(loader,className,code,0,code.length);
        exampleClass.getMethods()[0].invoke(null,new Object[]{null});
    }

    /**
     * 字节码被编译为机器码之后，得到的结果需要在内存中保存，以便下次函数调用时可以直接使用
     * 一旦代码缓冲区用完，虚拟机会停止JIT编译并保持系统继续运行，JIT停止运行后后序代码全部解释执行
     * 代码缓存空间的清理也是由系统GC完成的
     * -XX:ReservedCodeCacheSize设置缓冲区大小
     *
     * -XX:+PrintCompilation -Xcomp -XX:ReservedCodeCacheSize=5M
     * 使用以上参数运行后可以看到在编译到15次之后就结束了JIT编译，改造代码执行显示GC后由于代码缓冲区由于被清理，会一直进行编译
     * 可以通过JConsole查看代码缓冲区的大小变化
     *
     * JIT编译一旦停止，整个声明周期中将不在启动
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        for (int i=0;i<Integer.MAX_VALUE;i++){
            createAndCall("hello world"+i,"Ex"+i);
            if(i>=15){
                System.gc();
            }
        }
    }
}
