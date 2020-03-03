package dyn;

import java.lang.invoke.*;

public class DynBootStrap {
    /**
     * 为了使用invokdynamic必须先建立一个引导方法
     * @param lookup
     * @param name 调用函数的名称
     * @param type
     * @param value 方法的第一个参数，对于实例方法，第一个参数就是this
     * @return
     * @throws Exception
     */
    public static CallSite bootstrap(MethodHandles.Lookup lookup, String name, MethodType type, Object value) throws Exception{
        System.out.println("bootstrap called, name="+name);
        MethodHandle mh = lookup.findVirtual(value.getClass(), name
                ,MethodType.methodType(int.class)).bindTo(value);
        return new ConstantCallSite(mh);
    }
}
