package aop.timestat;


import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

import java.io.File;
import java.io.FileOutputStream;

public class TimStatGenerator {
    public static void main(String[] args) throws Exception {
        String className = Account.class.getName();
        ClassReader cr = new ClassReader(className);
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS|ClassWriter.COMPUTE_FRAMES);
        TimeStatClassAdapter classAdpater = new TimeStatClassAdapter(cw);
        cr.accept(classAdpater, ClassReader.SKIP_DEBUG);
        byte[] data = cw.toByteArray();
        File file = new File("chapter11/target/classes/"+className.replaceAll("\\.","/")+".class");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(data);
        fileOutputStream.close();
    }
}
