package invokedynamic;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class ReflectionMain {
    public static final int COUNT = 100000;
    int i=0;

    public void method(){
        i++;
    }

    public static void callByHandler() throws Throwable{
        ReflectionMain instance = new ReflectionMain();
        MethodType methodType = MethodType.methodType(void.class);
        MethodHandle mh = MethodHandles.lookup().findVirtual(instance.getClass(),"method",methodType).bindTo(instance);
        long b = System.currentTimeMillis();
        for(int i=0;i<COUNT;i++){
            mh.invokeExact();
        }
        System.out.println("callByHandler spend:"+(System.currentTimeMillis()-b));
    }

    /**
     *
     * 反射是在java语言层面进行方法调用模拟，而方法句柄是在Java字节码层面进行函数调用，
     * 所以方法句柄的运行效率高于反射
     * -Xint
     * 纯解释性函数调用，反射的性能低于方法句柄
     * -Xcomp -XX:-BackgroundCompilation
     * callByReflection spend:31
     * callByHandler spend:37
     *
     * 使用编译模式分别运行，可以发现编译对反射的性能提升巨大
     * @throws Throwable
     */
    public static void callByReflection() throws Throwable{
        ReflectionMain instance = new ReflectionMain();
        Method m = instance.getClass().getMethod("method");
        long b = System.currentTimeMillis();
        for(int i=0;i<COUNT;i++){
            m.invoke(instance);
        }
        System.out.println("callByReflection spend:"+(System.currentTimeMillis()-b));
    }

    public static void main(String[] args) throws Throwable{
        callByReflection();
        callByReflection();
//        callByHandler();
//        callByHandler();

    }
}
