package threadSafe;

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
     * Vector是线程安全的，但由于对整个操作同步，所以效率比较低
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
