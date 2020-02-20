import java.util.HashMap;
import java.util.Map;

public class PretenureSizeThreshold {
    public static final int _1k=1024;

    /**
     * -Xmx32m -Xms32m -XX:+UseSerialGC -XX:+PrintGCDetails
     * 分配5M空间，6千个字节数组，可以看到所有对象均分配在新生代，老年代使用率为0
     *
     * -Xmx32m -Xms32m -XX:+UseSerialGC -XX:+PrintGCDetails -XX:PretenureSizeThreshold=1000
     * -XX:PretenureSizeThreshold=<value>单位为字节，用来设置对象直接晋升到老年代的阈值
     * 如果对象大于指定值就会在老年代分配，该参数只对Serial和ParNew有效
     * 但是通过以上参数设置，老年代空间理应被占用5M，结果却是只占用了48K，这是因为虚拟机在为线程分配空间时会优先使用一块叫TLAB的区域
     * 对体积不大的对象，很可能在TLAB上先分配，就失去了在老年代分配的机会
     *
     * -Xmx32m -Xms32m -XX:+UseSerialGC -XX:+PrintGCDetails -XX:PretenureSizeThreshold=1000 -XX:-UseTLAB
     * 使用参数-XX:-UseTLAB之后可以看到结果满足预期
     * @param args
     */
    public static void main(String args[]){
        Map<Integer, byte[]> map = new HashMap<Integer, byte[]>();
        for(int i=0;i<5*_1k;i++){
            byte[] b = new byte[_1k];
            map.put(i,b);
        }
    }
}
