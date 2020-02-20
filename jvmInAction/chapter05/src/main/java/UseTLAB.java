public class UseTLAB {
    public static void alloc(){
        byte[] b = new byte[2];
        b[0]=1;
    }

    /**
     * TLAB是线程本地缓存，是为了加速对象分配而生的
     * 堆是共有的，同一时间多个线程在堆上申请空间导致每一次对象分配需要进行同步，从而在竞争激烈的场合分配效率会下降
     * TLAB使线程专属的区间来避免线程冲突，它本省占用了eden的空间
     * 对所有函数进行JIT并且禁止后台编译老保持对比测试中环境一致，同时关闭了逃逸分析来防止栈上分配的影响
     *
     * -XX:+UseTLAB -Xcomp -XX:-BackgroundCompilation -XX:-DoEscapeAnalysis
     * 最后在启用TLAB的情况下分配内存耗时为265ms，而关闭则增加了两个量级的时间达到11810ms
     * -XX:-UseTLAB
     * 11810
     * 可以看出是否启用TLAB对对象分配影响很大
     *
     * -XX:+UseTLAB -XX:-DoEscapeAnalysis -XX:+PrintTLAB -XX:+PrintGC -XX:TLABSize=102400 -XX:-ResizeTLAB -XX:TLABRefillWasteFraction=100
     *
     * -XX:TLABRefillWasteFraction=<value>用于设置TLAB中允许产生浪费的比例，这里设置成允许浪费1/100,即1kb
     * 由于TLAB和refill_waste在运行时会自己调整，使系统达到最优，这里使用-XX:-ResizeTLAB禁用并用-XX:TLABSize指定一个TLAB的大小为100kb
     *
     *
     * 对象分配的流程
     * 先尝试栈上分配(如果开启或允许)，再尝试TLAB分配，在尝试堆上分配，满足进入老年代的条件则在老年代分配，否在在eden分配
     * @param args
     */
    public static void main(String[] args) {
        long b = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            alloc();
        }
        long e = System.currentTimeMillis();
        System.out.println(e-b);
    }
}
