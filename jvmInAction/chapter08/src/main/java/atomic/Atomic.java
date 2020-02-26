package atomic;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

public class Atomic {
    private static final int MAX_THREADS = 3;
    private static final int TASK_COUNT = 3;
    private static final int TARGEt_COUNT = 100000000;

    private AtomicLong acount = new AtomicLong(0l);
    private LongAdder lacount = new LongAdder();
    private long count = 0;

    static CountDownLatch cdlsync = new CountDownLatch(TASK_COUNT);
    static CountDownLatch cdlatomic = new CountDownLatch(TASK_COUNT);
    static CountDownLatch cdladdr = new CountDownLatch(TASK_COUNT);

    protected synchronized long inc(){
        return ++count;
    }

    protected synchronized long getCount(){
        return count;
    }

    public void clearCount(){
        count=0;
    }

    public class SyncThread implements Runnable{
        protected String name;
        protected long starttime;
        Atomic out;

        public SyncThread(long starttime, Atomic out) {
            this.starttime = starttime;
            this.out = out;
        }

        public void run() {
            long v = out.getCount();
            while(v<TARGEt_COUNT){
                v = out.inc();
            }
            long endTime = System.currentTimeMillis();
            System.out.println("SyncThread Spend:"+(endTime-starttime)+"ms"+" v="+v);
            cdlsync.countDown();
        }
    }

    public void testSync() throws InterruptedException{
        ExecutorService ex = Executors.newFixedThreadPool(MAX_THREADS);
        long starttime = System.currentTimeMillis();
        SyncThread syncThread = new SyncThread(starttime,this);
        for(int i=0;i<TASK_COUNT;i++){
            ex.submit(syncThread);
        }
        cdlsync.await();
        ex.shutdown();
    }
    public class AtomicThread implements Runnable{
        protected long starttime;

        public AtomicThread(long starttime) {
            this.starttime = starttime;
        }

        public void run() {
            long v = acount.get();
            while(v<TARGEt_COUNT){
                v = acount.incrementAndGet();
            }
            long endTime = System.currentTimeMillis();
            System.out.println("AtomicThread Spend:"+(endTime-starttime)+"ms"+" v="+v);
            cdlatomic.countDown();
        }
    }

    public void testAtomic() throws InterruptedException{
        ExecutorService ex = Executors.newFixedThreadPool(MAX_THREADS);
        long starttime = System.currentTimeMillis();
        AtomicThread atomicThread = new AtomicThread(starttime);
        for(int i=0;i<TASK_COUNT;i++){
            ex.submit(atomicThread);
        }
        cdlatomic.await();
        ex.shutdown();
    }


    public class LongAddrThread implements Runnable{
        protected long starttime;

        public LongAddrThread(long starttime) {
            this.starttime = starttime;
        }

        public void run() {
            long v = lacount.sum();
            while(v<TARGEt_COUNT){
                lacount.increment();
                v = lacount.sum();
            }
            long endTime = System.currentTimeMillis();
            System.out.println("LongAdder Spend:"+(endTime-starttime)+"ms"+" v="+v);
            cdladdr.countDown();
        }
    }

    public void testAtomicLong() throws InterruptedException{
        ExecutorService ex = Executors.newFixedThreadPool(MAX_THREADS);
        long starttime = System.currentTimeMillis();
        LongAddrThread longAddrThread = new LongAddrThread(starttime);
        for(int i=0;i<TASK_COUNT;i++){
            ex.submit(longAddrThread);
        }
        cdladdr.await();
        ex.shutdown();
    }

    /**
     * 基于Synchronized的同步最慢
     * Atomic最快，LongAdder其次
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Atomic a = new Atomic();
        a.testAtomicLong();
        a.testSync();
        a.testAtomic();
    }
}
