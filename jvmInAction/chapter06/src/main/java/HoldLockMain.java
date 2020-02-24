import java.util.Random;

public class HoldLockMain {
    public static Object[] lock = new Object[10];
    public static Random  r= new Random();
    static {
        for(int i=0;i<lock.length;i++){
            lock[i] = new Object();
        }
    }

    public static class HoldLockTask implements Runnable{
        private int i;
        public HoldLockTask(int i){
            this.i = i;
        }

        public void run() {
            try {
                while (true){
                    synchronized (lock[i]){
                        if(i%2==0){
                            lock[i].wait(r.nextInt(10));
                        }else {
                            lock[i].notifyAll();
                        }
                    }
                }
            }catch (Exception e){

            }
        }
    }

    /**
     * 使用vmstat指令查看内存、交互分区、I/O操作、上下文切换、时钟中断和CPU的使用情况
     * 当cs值(上下文切换)和us值(用户CPU时间)很高时，表明系统上下文切换频繁、用户CPU占用率很高
     * 此时可能存在大量线程切换
     * @param args
     */
    public static void main(String[] args) {
        for(int i=0;i<lock.length;i++){
            new Thread(new HoldLockTask(i/2)).start();//每两个线程持有同一个锁
        }
    }
}
