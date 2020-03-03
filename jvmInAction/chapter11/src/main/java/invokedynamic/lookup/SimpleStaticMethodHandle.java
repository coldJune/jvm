package invokedynamic.lookup;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class SimpleStaticMethodHandle {
    /**
     * findStatic用于查找静态方法，他不需要绑定对象，因为静态方法没有this引用
     * @param args
     * @throws Throwable
     */
    public static void main(String[] args) throws Throwable{
        SimpleStaticMethodHandle obj = new SimpleStaticMethodHandle();
        System.out.println(obj.callSin());
    }

    public double callSin() throws Throwable{
        MethodHandle mh = MethodHandles.lookup().findStatic(Math.class, "sin", MethodType.methodType(double.class, double.class));
        return (double)mh.invokeExact(Math.PI/2);
    }
}
