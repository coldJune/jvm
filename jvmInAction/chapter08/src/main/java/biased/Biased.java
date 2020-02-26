package biased;

import java.util.List;
import java.util.Vector;

public class Biased {
    public static List<Integer> numberList = new Vector<Integer>();

    /**
     * jdk8
     * -client -XX:+UseBiasedLocking -XX:BiasedLockingStartupDelay=0
     * 2230
     *
     * -XX:-UseBiasedLocking
     * 2317
     *
     * -client使用客户端编译器，忽略即使编译器优化
     * -XX:+UseBiasedLocking 开启偏向锁
     * -XX:BiasedLockingStartupDelay=0 设置偏向锁在虚拟机启动后立即启动，不设置则默认是虚拟机启动后4s才启用偏向锁
     *
     * 偏向锁在锁存在少量竞争的情况下对性能有一定帮助
     * 但在锁竞争激烈的场合，由于线程不停切换使得锁很难保证偏向模式，这时使用偏向锁可能适得其反
     * 可以使用-XX:-UseBiasedLocking禁用偏向锁
     * @param args
     */
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        int count = 0;
        int startnum = 0;
        while(count<10000000){
            numberList.add(startnum);
            startnum+=2;
            count++;
        }
        long end = System.currentTimeMillis();
        System.out.println(end-begin);
    }
}
