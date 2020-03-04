package jit;

public class IntCompMain {
    public static double calcPI(){
        double re = 0;
        for(int i=1;i<10000;i++){
            re+=((i&1)==0?-1:1)*1.0/(2*i-1);
        }
        return re*4;
    }

    /**
     * -Xint 开启解释执行模式，全部代码解释执行，耗时3060ms
     * -Xcomp 开启编译执行模式，所有代码编译执行，耗时199ms
     *
     * 一般而言编译执行效率远高于解释执行
     * @param args
     */
    public static void main(String[] args) {
        long b = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            calcPI();
        }
        System.out.println("spend "+(System.currentTimeMillis()-b)+" ms");
    }
}
