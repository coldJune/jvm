package stw;

import java.util.HashMap;

public class StopWorldTest {
    public static class MyThread extends Thread{
        HashMap map = new HashMap();
        @Override
        public void run() {
            try {
                while (true) {
                    if(map.size()*512/1024/1024>=900){
                        map.clear();
                        System.out.println("clear map");
                    }
                    byte[] b1;
                    for(int i=0;i<100;i++){
                        b1 = new byte[512];
                        map.put(System.nanoTime(), b1);
                    }
                    Thread.sleep(1);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static class PrintThread extends Thread{
        public static final long starttime = System.currentTimeMillis();

        @Override
        public void run() {
            try {
                while (true){
                    long t = System.currentTimeMillis()-starttime;
                    System.out.println(t/1000+"."+t%1000);
                    Thread.sleep(100);
                }
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }

    /**
     * -Xmx1g -Xms1g -Xmn512k -XX:+UseSerialGC -Xloggc:gc.log -XX:+PrintGCDetails(≤jdk1.8)
     *
     * 开启两个线程，PrintThread负责每0.1秒在控制台上进行一次时间戳输出
     * MyThread则不停地消耗内存资源，引发GC
     *
     * 这里设置堆空间为1g，废弃了新生代(-Xmn52k)，同时输出gc日志
     * 可以看到控制台打印的时间间隔突然增大能很好得和gc日志的full gc对应起来
     *
     * 这里新生代GC比较频繁，但是每一次耗时短，而老年代GC发生次数较少，但每一次消耗的时间较长(堆大的情况下)
     *
     * -Xmx1g -Xms1g -Xmn900m -XX:+UseSerialGC -Xloggc:gc.log -XX:+PrintGCDetails
     *
     * 设置较大的新生代，可以看到新生代gc次数明显减少，但是每次耗时增加
     * @param args
     */
    public static void main(String[] args) {
        MyThread t = new MyThread();
        PrintThread p = new PrintThread();
        t.start();
        p.start();
    }
}
