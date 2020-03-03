package invokedynamic.lookup;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class SimplePrivateMethodHandle {
    /**
     * findSpecial用于查找一个特殊的方法，这里查找对象的私有方法
     * bindTo用于将方法绑定到目标实例上
     * @param args
     * @throws Throwable
     */
    public static void main(String[] args) throws Throwable{
        SimplePrivateMethodHandle simplePrivateMethodHandle = new SimplePrivateMethodHandle();
        simplePrivateMethodHandle.callToString();
    }
    private void printLine(){
        System.out.println("call private method");
    }

    public void callToString() throws Throwable{
        MethodHandle mh = MethodHandles.lookup().findSpecial(this.getClass(),"printLine", MethodType.methodType(void.class),this.getClass()).bindTo(this);
        mh.invokeExact();
    }
}
