package classloadcondition.unactive;

public class UseParent {
    /**
     * 使用子类去调用父类的静态变量，虽然直接访问了子类对象，但是只会初始化父类而不会初始化子类，但是子类会被加载
     * 当引用一个字段时只有直接定义该字段的类才会被初始化
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Child.v);
    }
}
