package threadSafe;

import java.util.ArrayList;
import java.util.List;

public class ThreadUnSafe {
    public static List<Integer> numberList = new ArrayList<Integer>();
    public static class AddToList implements Runnable {
        int startnum = 0;

        public AddToList(int startnum) {
            this.startnum = startnum;
        }

        public void run() {
            int count=0;
            while(count<10000000){
                numberList.add(startnum);
                startnum+=2;
                count++;
            }
        }
    }

    /**
     * jdk8
     * 同时两个线程向list添加数据，由于ArrayList不是线程安全，会抛出ArrayIndexOutOfBoundsException
     * 这是因为两个线程同时对ArrayList进行写操作，破坏了ArrayList内部数据的一致性，导致一个线程访问了错误的数组索引
     * @param args
     */
    public static void main(String[] args) {
        Thread t1 = new Thread(new AddToList(0));
        Thread t2 = new Thread(new AddToList(1));
        t1.start();
        t2.start();
    }
}
