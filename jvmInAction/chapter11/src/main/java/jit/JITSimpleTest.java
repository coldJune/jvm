package jit;

public class JITSimpleTest {
    public static void met(){
        int a=0,b=0;
        b=a+b;
    }

    /**
     * -XX:CompileThreshold=500 -XX:+PrintCompilation
     * -XX:CompileThreshold设置热点代码的阈值，这里设置为500，即一段代码被调用500次便会被判定为热点代码，触发编译
     * -XX:+PrintCompilation打印即时编译的日志
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        for (int i=0;i<500;i++){
            met();
        }
        Thread.sleep(500);
    }
}
