import java.util.concurrent.locks.ReentrantLock;

public class DeadLock extends Thread{
    protected Object myDirect;
    static ReentrantLock south = new ReentrantLock();
    static ReentrantLock north = new ReentrantLock();

    public DeadLock(Object obj){
        this.myDirect = obj;
        if(myDirect == south){
            this.setName("south");
        }
        if(myDirect == north){
            this.setName("north");
        }
    }

    @Override
    public void run() {
        if(myDirect == south){
            try {
                north.lockInterruptibly();
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                south.lockInterruptibly();
                System.out.println("car to south has passed");
            }catch (InterruptedException e){
                System.out.println("car to south is killed");
            }finally {
                if(north.isHeldByCurrentThread()){
                    north.unlock();
                }
                if(south.isHeldByCurrentThread()){
                    south.unlock();
                }
            }
        }

        if(myDirect == north){
            try {
                south.lockInterruptibly();
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                north.lockInterruptibly();
                System.out.println("car to north has passed");
            }catch (InterruptedException e){
                System.out.println("car to north is killed");
            }finally {
                if(north.isHeldByCurrentThread()){
                    north.unlock();
                }
                if(south.isHeldByCurrentThread()){
                    south.unlock();
                }
            }
        }
    }

    /**
     * jstack可以很容易找到死锁的线程以及死锁线程的持有对象和等待对象
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException{
        DeadLock car2south = new DeadLock(south);
        DeadLock car2north = new DeadLock(north);
        car2north.start();
        car2south.start();
        Thread.sleep(1000);
    }
}
