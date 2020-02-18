package trace;


import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

import java.lang.reflect.Method;

import static org.objectweb.asm.Opcodes.*;

/**
 * -verbose:class -XX:+TraceClassUnloading -XX:+TraceClassLoading -XX:+PrintClassHistogram
 * 使用-XX:TraceClassUnloading -XX:+TraceClassLoading可以追踪类加载和卸载的过程
 * [4.292s][info   ][class,load] Example source: __JVM_DefineClass__
 * [4.523s][info   ][class,load] Example source: __JVM_DefineClass__
 * [4.572s][info   ][class,unload] unloading class Example 0x0000000800094040
 * [4.683s][info   ][class,load  ] Example source: __JVM_DefineClass__
 * [4.732s][info   ][class,unload] unloading class Example 0x0000000800093840
 * [4.847s][info   ][class,load  ] Example source: __JVM_DefineClass__
 * [4.889s][info   ][class,unload] unloading class Example 0x0000000800094040
 * [4.981s][info   ][class,load  ] Example source: __JVM_DefineClass__
 * [5.031s][info   ][class,unload] unloading class Example 0x0000000800093840
 * [5.121s][info   ][class,load  ] Example source: __JVM_DefineClass__
 * [5.157s][info   ][class,unload] unloading class Example 0x0000000800094040
 * [5.236s][info   ][class,load  ] Example source: __JVM_DefineClass__
 * [5.306s][info   ][class,unload] unloading class Example 0x0000000800093840
 * [5.401s][info   ][class,load  ] Example source: __JVM_DefineClass__
 * [5.448s][info   ][class,unload] unloading class Example 0x0000000800094040
 * [5.571s][info   ][class,load  ] Example source: __JVM_DefineClass__
 * [5.616s][info   ][class,unload] unloading class Example 0x0000000800093840
 * [5.701s][info   ][class,load  ] Example source: __JVM_DefineClass__
 * [5.749s][info   ][class,unload] unloading class Example 0x0000000800094040
 * 可以看到类进行了10次加载9次卸载
 *
 * -XX:+PrintClassHistogram可以打印当前类信息的柱状图
 *
 */
public class UnloadClass {
    public static void main(String[] args) throws Exception{
        ClassWriter cw =  new ClassWriter(ClassWriter.COMPUTE_MAXS|ClassWriter.COMPUTE_FRAMES);
        cw.visit(V1_2, ACC_PUBLIC, "Example",
                null, "java/lang/Object",null);
        MethodVisitor mw = cw.visitMethod(ACC_PUBLIC,"<init>",
                "()V",null,null);
        mw.visitVarInsn(AALOAD, 0);
        mw.visitMethodInsn(INVOKESPECIAL,"java/lang/Object",
                "<init>","()V",false);
        mw.visitInsn(RETURN);
        mw.visitMaxs(0,0);
        mw.visitEnd();

        mw = cw.visitMethod(ACC_PUBLIC+ACC_STATIC, "main",
                "([Ljava/lang/String;)V", null,null);
        mw.visitFieldInsn(GETSTATIC, "java/lang/System","out",
                "Ljava/io/PrintStream;");
        mw.visitLdcInsn("Hello world");
        mw.visitMethodInsn(INVOKESPECIAL, "java/io/PrintStream",
                "println","(Ljava/lang/String;)V",false);
        mw.visitInsn(RETURN);
        mw.visitMaxs(0,0);
        mw.visitEnd();

        byte[] code = cw.toByteArray();

        for(int i=0;i<10;i++){
            UnloadClassLoader loader =  new UnloadClassLoader();
            Method m = ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, int.class, int.class);
            m.setAccessible(true);
            m.invoke(loader,"Example",code, 0, code.length);
            m.setAccessible(false);
            System.gc();
        }
    }
}
