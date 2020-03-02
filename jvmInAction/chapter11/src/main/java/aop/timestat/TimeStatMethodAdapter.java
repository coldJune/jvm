package aop.timestat;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class TimeStatMethodAdapter extends MethodVisitor {
    public TimeStatMethodAdapter(MethodVisitor mv) {
        super(Opcodes.ASM5,mv);
    }

    /**
     * visitCode在方法的Code属性被访问时调用，在这里插入start表示方法的开始
     */
    @Override
    public void visitCode() {
        visitMethodInsn(Opcodes.INVOKESTATIC,TimeStat.class.getName().replaceAll("\\.","/"), "start","()V",false);
    }

    @Override
    public void visitInsn(int opcode) {
        //当访问到return指令时调用end
        if((opcode>=Opcodes.IRETURN && opcode<=Opcodes.RETURN)){
            visitMethodInsn(Opcodes.INVOKESTATIC,TimeStat.class.getName().replaceAll("\\.","/"),"end","()V",false);
        }
        mv.visitInsn(opcode);
    }
}
