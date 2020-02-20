public class DisableExplicitGC {
    /**
     * -XX:+PrintGCDetails -XX:+DisableExplicitGC
     * -XX:+DisableExplicitGC 用于关闭System.gc()的调用
     * @param args
     */
    public static void main(String[] args) {
        while (true){
            System.gc();
            Thread.yield();
        }
    }
}
