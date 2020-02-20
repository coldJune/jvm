import java.util.HashMap;
import java.util.Map;

public class MaxTenuringThreshold {
    public static final int _1M = 1024*1024;
    public static final int _1K = 1024;

    /**
     * -Xmx1024M -Xms1024M -XX:+UseSerialGC -XX:+PrintGCDetails -XX:MaxTenuringThreshold=15 -XX:+PrintHeapAtGC
     * 设置java堆大小为1024M，同时使用单线程收集器
     *
     * -XX:MaxTenuringThreshold=15设置新生代最多经历多少次GC
     * 对象在创建之初都是在新生代eden区域
     * 在第一次GC之后from区占用34944K*16%≈5M，刚好为map对象的大小
     * 之后的每一次GC都使得map的年龄+1,在第16次的时候被提升到老年代
     *
     * -Xmx1024M -Xms1024M -XX:+PrintGCDetails -XX:MaxTenuringThreshold=15 -XX:+PrintHeapAtGC
     * 如果使用的是非Parallel收集器(JDK8默认)，那么情况无法用这种方式复现，大概在第六次时from空间大小从43520K左右变为6144K,导致空间被占满97，
     * 第7次gc的时候对象就会被提升到老年代
     *
     * -Xmx1024M -Xms1024M  -XX:-UseAdaptiveSizePolicy -XX:+PrintGCDetails -XX:MaxTenuringThreshold=15 -XX:+PrintHeapAtGC
     * 这时候只需要使用-XX:-UseAdaptiveSizePolicy关闭Parallel收集器的动态调整策略即可复现之前的问题
     *
     * -Xmx1024M -Xms1024M  -XX:+UseSerialGC -XX:+PrintGCDetails  -XX:+PrintHeapAtGC -XX:TargetSurvivorRatio=2
     * -XX:TargetSurvivorRatio=<value>设置survivor区使用的阈值，然后取和MaxTenuringThreshold中较小的作为晋升条件
     * 可以看到在第二次GC时map就已经晋升到了老年代，这是因为TargetSurvivorRatio=2远小于16，所以就算其没达到设置晋升年龄也会晋升
     *
     * 实验时发现在使用Parallel收集器时设置TargetSurvivorRatio无效
     *
     * @param args
     */
    public static void main(String[] args) {
        Map<Integer,byte[]> map = new HashMap<Integer, byte[]>();
        for(int i=0;i<5*_1K;i++){
            byte[] b = new byte[_1K];
            map.put(i,b);
        }

        for(int k=0;k<17;k++){
            for(int i=0;i<270;i++){
                byte[] q = new byte[_1M];
            }
        }
    }
}
