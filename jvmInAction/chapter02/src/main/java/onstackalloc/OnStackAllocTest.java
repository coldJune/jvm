package onstackalloc;

public class OnStackAllocTest {
    public static class User{
        public int id = 0;
        public String name="";
    }

    public static void alloc(){
        User u = new User();
        u.id = 1;
        u.name = "jun";
    }

    /**
     * main方法中调用了1亿次alloc函数，因为user对象大约要16个字节，则总共需要1.5G的内存
     *
     * -server -Xms10m -Xmx10m -XX:+PrintGC -XX:-DoEscapeAnalysis -XX:-EliminateAllocations
     * -Xms10m和-Xmx10m固定内存大小为10m，同时-XX:-DoEscapeAnalysis关闭逃逸分析，-XX:-EliminateAllocations关闭标量替换
     * 此时所有的对象都在堆上进行分配，导致产生大量GC日志，最后执行完成总耗时3226ms
     *
     *
     *
     * -server -Xms10m -Xmx10m -XX:+PrintGC -XX:-UseTLAB -XX:+DoEscapeAnalysis -XX:+EliminateAllocations
     * 同样的堆内存大小在开启逃逸分析和标量替换后只打印了少量的GC日志(因为是G1收集器，和用户线程并行)，总耗时293ms
     * @param args
     */
    public static void main(String[] args) {
        long b = System.currentTimeMillis();
        for(int i=0;i<100000000;i++){
            alloc();
        }
        long e = System.currentTimeMillis();
        System.out.println(e-b);
    }
}
