public class ScavengeBeforeFullGC {
    /**
     *
     * -XX:+PrintGCDetails -XX:+UseSerialGC
     * 使用Serial收集器直接触发的Full GC
     * -XX:+PrintGCDetails -XX:+UseParallelOldGC
     * 使用并行回收器时会先进行一次新生代的收集，然后再进行full GC，实际时进行了两次
     * 避免将回收工作同时交给一次FULL GC，从而缩短一次停顿时间
     *
     * -XX:+PrintGCDetails -XX:+UseParallelOldGC -XX:-ScavengeBeforeFullGC
     * -XX:-ScavengeBeforeFullGC使用该参数可以去除在并行回收器中full gc之前那次新生代GC
     * @param args
     */
    public static void main(String[] args) {
        System.gc();
    }
}
