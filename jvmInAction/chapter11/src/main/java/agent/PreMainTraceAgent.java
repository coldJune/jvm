package agent;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;
import java.security.ProtectionDomain;

/**
 *  jar cvfm agent.jar MANIFEST.MF PreMainTraceAgent.class PreMainTraceAgent\$1.class
 * 将文件打包为jar包
 * premain方法会在main方法之前调用，设置MANIFEST.MF文件
 * addTransformer加入一个类转换器用于打印获取的类名
 */
public class PreMainTraceAgent {
    public static void premain(String agentArgs, Instrumentation inst) throws
            ClassNotFoundException, UnmodifiableClassException {
        System.out.println("AgentArgs:"+ agentArgs);
        inst.addTransformer(new ClassFileTransformer() {
            @Override
            public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
                System.out.println("load class:"+className);
                return classfileBuffer;
            }
        });
    }
}
