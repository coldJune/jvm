package aop.timestat;

import jdk.internal.org.objectweb.asm.Opcodes;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

public class TimeStatClassAdapter  extends ClassVisitor {
    public TimeStatClassAdapter(ClassVisitor classVisitor) {
        super(Opcodes.ASM5, classVisitor);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        MethodVisitor mv = cv.visitMethod(access,name,descriptor,signature,exceptions);
        MethodVisitor wrappedMv = mv;
        if(mv != null){
            //判断是否是operation方法
            if(name.equals("operation")){
                //使用自定义MethodVisitor，实际改写方法内容
                wrappedMv = new TimeStatMethodAdapter(mv);
            }
        }
        return wrappedMv;
    }
}
