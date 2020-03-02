package agent;

import aop.timestat.Account;
import aop.timestat.TimeStatClassAdapter;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;
import java.security.ProtectionDomain;

/**
 *
 * cd /Users/dengxiaojun/Documents/GitHub/jvm/jvmInAction/chapter11/target/classes/agent
 * jar cvfm agent.jar MANIFEST.MF PreMainAddTimeStatAgent.class PreMainAddTimeStatAgent\$1.class
 *
 * 之前的织入方式不够灵活，要求在类进行javac编译之后在进行基于文件的织入
 * 使用agent可以动态修改字节码使之生效
 */
public class PreMainAddTimeStatAgent {
    public static void premain(String agentArgs, Instrumentation inst){
        System.out.println("agentArgs:"+agentArgs);
        inst.addTransformer(new ClassFileTransformer() {
            @Override
            public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
                if(className.equals("aop/timestat/Account")){
                    System.out.println("meet Account");
                    ClassReader cr = new ClassReader(classfileBuffer);
                    ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS|ClassWriter.COMPUTE_FRAMES);
                    TimeStatClassAdapter classAdapter = new TimeStatClassAdapter(cw);
                    cr.accept(classAdapter,ClassReader.SKIP_DEBUG);
                    return cw.toByteArray();
                }else {
                    System.out.println(className);
                    return classfileBuffer;
                }
            }
        });
    }

    /**
     * agentmain使得Agent支持在类加载后进行动态地修改
     * @param agentArgs
     * @param inst
     * @throws ClassNotFoundException
     * @throws UnmodifiableClassException
     */
    public static void agentmain(String agentArgs, Instrumentation inst) throws ClassNotFoundException, UnmodifiableClassException{
        System.out.println("Agent Main called");
        System.out.println("agent args:"+agentArgs);
        premain(agentArgs,inst);
        inst.retransformClasses(Account.class);
    }
}
