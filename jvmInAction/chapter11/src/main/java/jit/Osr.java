package jit;

public class Osr {
    public static double osrMethod(){
        double N = 1000000;
        int sum=0;
        for(int i=1;i<N;i++){
            if(Math.pow(Math.random(),2)+Math.pow(Math.random(),2)<1){
                sum++;
            }
        }
        return 4*sum/N;
    }

    /**
     * 有些代码只会执行一次，但是内部存在循环会反复执行，是有编译价值的
     * 而不等待函数运行结束，在循环体内将代码替换的编译版本的技术叫OSR栈上替换
     * 在方法入口不检查，而在每一次循环开始时检查是否有编译版本可供使用
     *
     * -XX:+PrintCompilation -XX:OnStackReplacePercentage=100000 -XX:CompileThreshold=1500
     *     148   35 %     3       jit.Osr::osrMethod @ 8 (55 bytes)
     *  可以看到osrMethod是一个栈上替换
     *
     *  -XX:+PrintCompilation -XX:OnStackReplacePercentage=10000 -XX:CompileThreshold=1500
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(osrMethod());
    }
}
