package localvar;

public class LocalVar {
    public static void localVar1(){
        int a = 0;
        System.out.println(a);
        int b = 0;
        System.out.println(b);
    }

    public static void localVar2(){
        {
            int a = 0;
            System.out.println(a);
        }
        int b=0;
        System.out.println(b);
    }

    /**
     * localVar1因为局部变量都作用到函数末尾，所以b无法复用a的槽位
     * localVar2因为局部变量a只作用代码块，所以b可以复用a的槽位
     * @param args
     */
    public static void main(String[] args) {
        localVar1();
        localVar2();
    }
}
