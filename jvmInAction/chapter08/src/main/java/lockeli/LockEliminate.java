package lockeli;

public class LockEliminate {
    private static final int CIRCLE = 2000000;

    /**
     * -XX:+DoEscapeAnalysis -XX:-EliminateLocks -Xcomp -XX:-BackgroundCompilation -XX:BiasedLockingStartupDelay=0
     * 使用-XX:-EliminateLocks关闭锁消除之后执行887ms
     *
     * -XX:+DoEscapeAnalysis -XX:+EliminateLocks -Xcomp -XX:-BackgroundCompilation -XX:BiasedLockingStartupDelay=0
     * 开启锁消除之后，由于StringBuffer对象不会逃逸到方法外，不会产生锁竞争，所以时间缩减到782ms
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for(int i=0;i<CIRCLE;i++){
            createStringBuffer("JVM","Diagnosis");
        }
        long bufferCost = System.currentTimeMillis()-start;
        System.out.println("createStringBuffer:"+bufferCost+" ms");
    }

    private static String createStringBuffer(String s1, String s2){
        StringBuffer sb = new StringBuffer();
        sb.append(s1);
        sb.append(s2);
        return sb.toString();
    }
}
