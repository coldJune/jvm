package invokedynamic.lookup;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class SimpleSuperMethodHandle {
    /**
     * findSpecial可以调用父类的方法
     * 这里虽然重载了toString方法，但最后打印的是invokedynamic.lookup.SimpleSuperMethodHandle@85ede7b
     * @param args
     * @throws Throwable
     */
    public static void main(String[] args) throws Throwable {
        SimpleSuperMethodHandle obj = new SimpleSuperMethodHandle();
        System.out.println(obj.callToString());
    }

    @Override
    public String toString() {
        return "I am SimpleSuperMethodHandle";
    }

    public String callToString() throws Throwable{
        MethodHandle mh = MethodHandles.lookup().findSpecial(Object.class,"toString",
                MethodType.methodType(String.class),this.getClass()).bindTo(this);
        return (String) mh.invokeExact();
    }
}
