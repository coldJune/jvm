package staticdead;

public class ChildStatic extends SimpleStatic {
    static {
        number = 2;
    }

    /**
     * 在加载一个类之前，虚拟机会试图加载该类的父类
     * 因此父类的<clinit>总是在子类<clinit>之前被调用
     * 子类的static块优先级高于父类
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(number);
    }
}
