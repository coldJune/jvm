package heap;

public class HeapAlloc {
    /**
     * -Xmx20m -Xms5m -XX:+PrintCommandLineFlags -XX:+PrintGCDetails -XX:+UseSerialGC
     * 当前最大的堆的大小由日志可以看出-XX:MaxHeapSize=20971520刚好等于20*1024*1024=20971520即-Xmx20m指定
     * 但最大可用内存为
     * maxMemory=20316160bytes
     * free mem =4548432bytes
     * total mem=6094848bytes
     * maxMemory比设定值略少，这是因为实际最大可用内存应为-Xmx减去from(对齐后)区域的大小
     *
     * 在程序运行之初可以看到空闲内存约为4.5M，总内存约为5M
     * 进行了1M内存分配后空闲内存约为3.5M，总内存不变
     * 再申请4M内存发现剩余内存已经不够了，所以触发了GC操作并对内存进行了扩容
     * 扩容后的总内存约为10M，空闲内存约为3.5M
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("maxMemory=");
        System.out.println(Runtime.getRuntime().maxMemory()+"bytes");
        System.out.print("free mem =");
        System.out.println(Runtime.getRuntime().freeMemory()+"bytes");
        System.out.print("total mem=");
        System.out.println(Runtime.getRuntime().totalMemory()+"bytes");

        byte[] b = new byte[1*1024*1024];
        System.out.println("分配了1m空间给数组");
        System.out.print("maxMemory=");
        System.out.println(Runtime.getRuntime().maxMemory()+"bytes");
        System.out.print("free mem =");
        System.out.println(Runtime.getRuntime().freeMemory()+"bytes");
        System.out.print("total mem=");
        System.out.println(Runtime.getRuntime().totalMemory()+"bytes");

         b = new byte[4*1024*1024];
        System.out.println("分配了4m空间给数组");
        System.out.print("maxMemory=");
        System.out.println(Runtime.getRuntime().maxMemory()+"bytes");
        System.out.print("free mem =");
        System.out.println(Runtime.getRuntime().freeMemory()+"bytes");
        System.out.print("total mem=");
        System.out.println(Runtime.getRuntime().totalMemory()+"bytes");
    }
}
