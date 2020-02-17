package xss;

public class TestStackDeep {
    private static int count = 0;
    public static void recursion(){
        count++;
        recursion();
    }

    public static void recursionWithVa(int a, int b,int c){
        count++;
        recursionWithVa(a,b,c);
    }

    /**
     * 使用-Xss152k设置栈的大小，会调用495次
     * 使用-Xss256k设置栈的大小会调用1705次
     * 说明栈空间越大，能嵌套调用次数越多
     *
     * 添加局部变量使用-Xss152k设置栈的大小会调用388次
     * 添加局部变量使用-Xss256k设置栈的大小会调用1339次
     * 说明在相同的栈容量下，局部变量少的能支持更深的函数调用
     * @param args
     */
    public static void main(String[] args) {
        int a=1,b=2,c=3,d=4,e=5,f=6,g=7;
        try {
//            recursion();
            recursionWithVa(a,b,c);
        }catch (Throwable t){
            System.out.println("deep of calling="+count);
            t.printStackTrace();
        }
    }
}
