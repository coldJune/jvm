package oom;

public class MultiThreadOOM {
    public static class SleepThread implements Runnable{
        public void run() {
            try {
                Thread.sleep(10000000);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }

    /**
     * 每一个线程的开启都要占用系统内存，当线程数量太多时，也可能导致OOM
     * 线程空间也是堆外分配，如果想让系统支持更多的线程，那么应该使用一个较小的堆空间，或者通过-Xss减少线程的栈空间
     * @param args
     */
    public static void main(String[] args) {
        for(int i=0;i<1500;i++){
            new Thread(new SleepThread(),"Thread"+i).start();
            System.out.println("Thread"+i+" created");
        }
    }
}
