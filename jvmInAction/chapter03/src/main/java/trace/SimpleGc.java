package trace;

import java.util.ArrayList;
import java.util.List;

public class SimpleGc {
    /**
     * -verbose:gc -Xms10m -Xmn10m -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+PrintGCApplicationConcurrentTime -XX:+PrintGCApplicationStoppedTime -XX:+PrintReferenceGC -XX:+PrintHeapAtGC -XX:+PrintVMOptions -XX:+PrintCommandLineFlags -XX:+PrintFlagsFinal
     *
     *
     * VM option '+PrintGC' 打印GC日志
     * VM option '+PrintGCDetails' 打印GC日志详情
     * VM option '+PrintGCTimeStamps' 打印GC使额外输出打印的时间，时间为JVM启动时间的偏移量
     * VM option '+PrintGCApplicationConcurrentTime' 打印应用程序的执行时间
     * VM option '+PrintGCApplicationStoppedTime' 打印应用程序的停顿时间
     * VM option '+PrintReferenceGC' 跟踪系统内的软引用、弱引用和Finallize队列
     * VM option '+PrintHeapAtGC' 在每次GC前后分别打印堆信息
     * VM option '+PrintVMOptions' 打印虚拟机接受到的命令行显示参数
     * VM option '+PrintCommandLineFlags' 打印传递给虚拟机的显式和隐式参数
     * VM option '+PrintFlagsFinal' 打印所有系统参数的值
     * @param args
     */
    public static void main(String[] args) {
        List<byte[]> l = new ArrayList<byte[]>();
        for(int i=0;i<1000000;i++){
            byte[] bytes = new byte[64];
            l.add(bytes);
            if(l.size()*64/1024/1204>13){
                l.clear();
            }
        }
    }
}
