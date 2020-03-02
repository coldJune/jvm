package aop.securitycheck;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class AddSecurityCheckMethodAdapter extends MethodVisitor {
    public AddSecurityCheckMethodAdapter(MethodVisitor mv) {
        super(Opcodes.ASM5,mv);
    }

    @Override
    public void visitCode() {
        Label continueLable = new Label();
        visitMethodInsn(Opcodes.INVOKESTATIC, SecurityChecker.class.getName().replaceAll("\\.","/"),"checkSecurity","()Z",false);
        visitJumpInsn(Opcodes.IFNE, continueLable);
        visitInsn(Opcodes.RETURN);
        visitLabel(continueLable);
        super.visitCode();

    }
}
