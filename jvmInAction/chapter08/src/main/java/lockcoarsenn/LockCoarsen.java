package lockcoarsenn;


public class LockCoarsen {
    public static Object lock = new Object();
    public static final int CIRCLE = 1000000;

    /**
     * 适当的进行锁粗化可以减少申请锁带来的性能开销
     * @param args
     */
    public static void main(String[] args) {
        long beginTime = System.currentTimeMillis();
        for(int i=0;i<CIRCLE;i++){
            synchronized (lock){

            }
        }
        System.out.println("sync in loop:"+(System.currentTimeMillis()-beginTime));

        beginTime = System.currentTimeMillis();
        synchronized (lock){
            for(int i=0;i< CIRCLE;i++){

            }
        }
        System.out.println("sync out loop:"+(System.currentTimeMillis()-beginTime));
    }
}
