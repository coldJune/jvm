package heap;

public class NewSizeDemo {
    /** jdk8
     *-Xmx20m -Xms20M -Xmn2m -XX:SurvivorRatio=2 -XX:+PrintGCDetails
     * eden与from的比值2:1，故eden的为1024KB，总可用新生代空间为1024KB+512KB=1536KB,
     * 新生代总大小为1024KB+512KB+512Kb=2048KB=2MB
     * 因为eden无法容纳任何一个2M数组，故触发了一次新生代GC，对eden区进行了部分回收
     * 同时因为这个偏小的新生代无法为2MB数组预留空间，故所有的数组都分配在老年代，老年代最后占用
     *  ParOldGen       total 18432K, used 10240K [0x00000007bec00000, 0x00000007bfe00000, 0x00000007bfe00000)
     *
     * -Xmx20m -Xms20M -Xmn10m -XX:SurvivorRatio=2 -XX:+PrintGCDetails  -XX:+PrintGC -XX:+UseSerialGC
     * 将新生代的大小扩容到10m，此时eden的大小为5120K，完全可以容纳2M的数组，且每次分配新的数组都会对上一次的废弃内存进行回收
     * 所以所有的内存分配都是在新生代进行，通过GC保证了新生代有足够的空间
     *
     *-Xmx20m -Xms20M -Xmn15m -XX:SurvivorRatio=8 -XX:+PrintGCDetails  -XX:+PrintGC -XX:+UseSerialGC
     * 再次扩大新生代的大小到15m同时这是新生代eden/from的比例为8，最后eden的大小为12288K，完全能够容纳10M的数组
     * 因此数组全部分配在eden且不触发任何GC行为
     *
     * -Xmx20m -Xms20M -XX:NewRatio=2 -XX:+PrintGCDetails  -XX:+PrintGC -XX:+UseSerialGC
     * -XX:NewRation=老年代/新生代
     * 因为老年代和新生代的比为2:1，堆的总大小为20MB,故新生代的大小为20MB/3=6144K≈6M，老年代≈13MB
     * 由于在新生代GC时from空间不足以容纳2MB的数组，所以需要老年代进行空间担保，导致两个2MB的数组进入老年代
     * @param args
     */
    public static void main(String[] args) {
        byte[] b = null;
        for(int i=0;i<5;i++){
            b = new byte[2*1024*1024];
        }
    }
}
