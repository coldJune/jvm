package invokedynamic.callsite;

import java.lang.invoke.*;

public class SimpleCallSite {

    public static void constantCallSiteSample0() throws Throwable{
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodType type = MethodType.methodType(String.class, int.class, int.class);
        MethodHandle invoke = lookup.findVirtual(String.class,"substring", type);

        String result = (String)invoke.invoke("1234567",2,4);
        System.out.println("constantCallSiteSample return:"+result);
    }


    /**
     * 常量调用点，一旦被绑定到目标函数的句柄上，将无法更改
     * @throws Throwable
     */
    public static void constantCallSiteSample() throws Throwable{
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodType type = MethodType.methodType(String.class, int.class, int.class);
        MethodHandle mh = lookup.findVirtual(String.class,"substring", type);
        ConstantCallSite constantCallSite = new ConstantCallSite(mh);
        MethodHandle invoker = constantCallSite.dynamicInvoker();
        String result = (String)invoker.invoke("1234567",2,4);
        System.out.println("constantCallSiteSample return:"+result);
    }

    /**
     * 可变调用点，可以多次绑定到不同的目标函数上，每次只通过同一个调用点就可以调用不同的函数
     * @throws Throwable
     */
    public static void mutableCallSizeSample() throws Throwable{
        MethodType type = MethodType.methodType(double.class,double.class);
        MutableCallSite callSite = new MutableCallSite(type);
        MethodHandle invoker = callSite.dynamicInvoker();
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle mhSin = lookup.findStatic(Math.class,"sin",type);
        MethodHandle mhCos = lookup.findStatic(Math.class,"cos",type);
        callSite.setTarget(mhSin);
        double result = (double)invoker.invoke(Math.PI/2);
        System.out.println("sin(90)="+result);
        callSite.setTarget(mhCos);
        result = (double)invoker.invoke(Math.PI/2);
        System.out.println("cos(90)="+result);
    }

    public static void main(String[] args)  throws Throwable{
        constantCallSiteSample0();
        constantCallSiteSample();
        mutableCallSizeSample();
    }
}
