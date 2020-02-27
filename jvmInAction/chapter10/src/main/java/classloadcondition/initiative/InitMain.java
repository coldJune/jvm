package classloadcondition.initiative;

public class InitMain {
    /**
     * 主动引用：
     * 创建一个类的实例时，使用new、反射、克隆、反序列化
     * 当调用类的静态方法时，即使用字节码invokestatic指令
     * 当使用类或接口的静态字段时(final除外)，比如使用getstatic或者putstatic指令
     * 当使用java.lang.reflect包中的方法反射类的方法时
     * 当初始化子类时，要求先初始化父类
     * 作为启动虚拟机，含有main()方法的那个类
     *
     * 这里使用new创建子类实例，属于主动引用，系统首先初始化Parent再初始化Child
     * @param args
     */
    public static void main(String[] args) {
        Child c = new Child();
    }
}
