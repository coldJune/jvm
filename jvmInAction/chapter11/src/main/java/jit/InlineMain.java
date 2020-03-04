package jit;

public class InlineMain {
    static int i=0;
    public static void inc(){
        i++;
    }

    /**
     * 方法内联能够减少方法调用的次数，默认会进行方法内联
     * -Xcomp -server -XX:+Inline
     * -XX:+Inline 开启内联耗时3
     * -XX:-Inline 关闭内联耗时26
     *
     * 内联会增大系统执行代码的体积，因此对大的方法体应谨慎使用内联
     * 虚拟机提供参数-XX:FreqInlineSize控制热点方法进行内联的体积上限，方法体积大于给定值的都不会内联优化
     * @param args
     */
    public static void main(String[] args) {
        long b = System.currentTimeMillis();
        for(int j=0;j<10000000;j++){
            inc();
        }
        System.out.println(System.currentTimeMillis()-b);
    }
}
