package dyn;


import jdk.internal.org.objectweb.asm.*;
import jdk.internal.org.objectweb.asm.commons.GeneratorAdapter;
import jdk.internal.org.objectweb.asm.commons.Method;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

import static org.objectweb.asm.Opcodes.*;

/**
 * 首先声明引导方法，引导方法将使用invokestatic调用
 * 然后创建DynInvokeSampleMain类，并为其产生默认的构造函数
 * 然后创建DynInvokeSampleMain类，并为其产生默认的构造函数，然后创建run方法
 * 然后使用invokedynamic指令，在字符串"hello"上查找并调用名为hashCode的函数，函数签名为"()I",不接受参数，返回int
 * 然后传入申明的引导方法BSM
 * 然后输出invokedynamic的结果
 * 然后将新生成的Class文件写入DynInvokeSampleMain.class中，完成类DynInvokeSampleMain的定义和加载
 *
 * 最后调用DynInvokeSampleMain.run()方法，打印"hello"的hashcode
 */
public class DynInvokerSample extends ClassLoader{
    private static final Handle BSM = new Handle(H_INVOKESTATIC,
            DynBootStrap.class.getName().replace(".","/"),
            "bootstrap",
            MethodType.methodType(CallSite.class, MethodHandles.Lookup.class,String.class, MethodType.class, Object.class).toMethodDescriptorString());


    public Class createClass() throws IOException{
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        cw.visit(V1_7, ACC_PUBLIC|ACC_SUPER, "DynInvokeSampleMain", null,"java/lang/Object",null);
        Method m = Method.getMethod("void <init>()");
        GeneratorAdapter mg = new GeneratorAdapter(ACC_PUBLIC,m,null,null,cw);
        mg.loadThis();
        mg.invokeConstructor(Type.getType(Object.class),m);
        mg.returnValue();
        mg.endMethod();

        MethodVisitor mv = cw.visitMethod(ACC_PUBLIC|ACC_STATIC,"run","()V",null,null);
        mv.visitCode();

        mv.visitFieldInsn(GETSTATIC, "java/lang/System","out","Ljava/io/PrintStream;");
        mv.visitInvokeDynamicInsn("hashCode","()I",BSM,"hello");
        mv.visitMethodInsn(INVOKEVIRTUAL,"java/io/PrintStream","println","(I)V",false);

        mv.visitInsn(RETURN);
        mv.visitMaxs(0,0);
        mv.visitEnd();
        cw.visitEnd();

        byte[] bytes = cw.toByteArray();
        FileOutputStream fos = new FileOutputStream(new File("DynInvokeSampleMain.class"));
        fos.write(bytes);
        return this.defineClass("DynInvokeSampleMain",bytes,0,bytes.length);

    }

    public static void main(String[] args) throws Exception{
        DynInvokerSample me = new DynInvokerSample();
        Object obj = me.createClass().newInstance();
        obj.getClass().getMethod("run").invoke(null);
        System.out.println("hello".hashCode());

    }
}
