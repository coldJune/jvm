package classload;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class StringMessage {
    /**
     * 在获取类的二进制信息后，Java虚拟机将这些数据转为一个java.lang.Class的实例
     * java.lang.Class实例是访问类型元数据的接口，也是实现反射的关键数据
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        Class clzString = Class.forName("java.lang.String");
        Method[] methods = clzString.getDeclaredMethods();
        for(Method method: methods){
            String mod = Modifier.toString(method.getModifiers());
            System.out.print(mod+" "+ method.getName()+"(");
            Class<?>[] ps = method.getParameterTypes();
            if(ps.length == 0) System.out.print(")");
            for(int i=0;i<ps.length;i++){
                char end = i==ps.length-1?')':',';
                System.out.print(ps[i].getSimpleName()+end);
            }
            System.out.println();
        }
    }
}
