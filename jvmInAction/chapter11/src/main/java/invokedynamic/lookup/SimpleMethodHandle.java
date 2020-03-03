package invokedynamic.lookup;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

import static java.lang.invoke.MethodHandles.lookup;

public class SimpleMethodHandle {
    static class MyPrint{
        protected void println(String s){
            System.out.println(s);
        }
    }

    /**
     * 申明一个MyPrint类，拥有一个和System.out的println()方法签名相同的方法
     * 因此这两个不同的类拥有相同的描述和MethodType
     *
     * 现随机产生一个对象，它可能是PrintStream类也可能是MyPrint
     *
     * getPrintMethodHanlder方法使用 MethodType.methodType方法构造了一个表示函数签名的MethodType实例
     * 使用MethodHandles.lookup.lookup得到一个Lookup实例，调用findVirtual方法，根据MethodType、函数名称和实际的对象类型进行查找
     * 得到MethodHandle实例，将调用对象receiver作为方法调用的执行者，最后返回MethodHandle实例
     *
     * 根据返回的MethodHandle实例，调用println()方法，传入参数
     *
     * 无论当前obj是什么类型的对象，只要其拥有给定签名和名称的函数，就可以顺利调用到方法
     * @param args
     * @throws Throwable
     */
    public static void main(String[] args) throws Throwable{
        Object obj = (System.currentTimeMillis()&1l)==0l?System.out:new MyPrint();
        System.out.println(obj.getClass().toString());
        getPrintMethodHanlder(obj).invokeExact("jun");
    }

    private static MethodHandle getPrintMethodHanlder(Object receiver) throws Throwable{
        MethodType mt = MethodType.methodType(void.class,String.class);
        return lookup().findVirtual(receiver.getClass(),"println",mt).bindTo(receiver);
    }
}
