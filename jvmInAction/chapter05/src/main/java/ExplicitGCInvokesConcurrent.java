public class ExplicitGCInvokesConcurrent {

    /**
     * -XX:+PrintGCDetails -XX:+UseConcMarkSweepGC -XX:+ExplicitGCInvokesConcurrent
     * 就算使用的时CMS或G1收集器，System.gc()触发的也是full gc
     * 要使用并发特性需要设置参数 -XX:+ExplicitGCInvokesConcurrent
     *
     * @param args
     */
    public static void main(String[] args) {
        while (true){
            System.gc();
            Thread.yield();
        }
    }
}
