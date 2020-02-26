package biased;

import java.util.List;
import java.util.Vector;

public class ThreadSafe {
    public static List<Integer> numberList = new Vector<Integer>();
    public static class AddToList implements Runnable {
        int startnum = 0;

        public AddToList(int startnum) {
            this.startnum = startnum;
        }

        public void run() {
            int count=0;
            while(count<1000000){
                numberList.add(startnum);
                startnum+=2;
                count++;
            }
        }
    }

    /**
     * -client -XX:+UseBiasedLocking -XX:BiasedLockingStartupDelay=0
     * 119
     * -client -XX:-UseBiasedLocking
     * 79
     * 在锁竞争激烈的场景，禁用偏向锁反而带来性能提升
     * @param args
     */
    public static void main(String[] args) throws Exception{
        Thread t1 = new Thread(new AddToList(0));
        Thread t2 = new Thread(new AddToList(1));
        long begin = System.currentTimeMillis();
        t1.start();
        t2.start();
        while(t1.isAlive()||t2.isAlive()){
            Thread.sleep(1);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-begin);
    }
}
