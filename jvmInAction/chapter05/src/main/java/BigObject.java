import java.util.HashMap;
import java.util.Map;

public class BigObject {
    /**
     * -Xmx10m -Xms10m -Xmn2m -XX:+PrintGCDetails
     * 当eden区和survivor区无法容纳大对象时将直接晋升到老年代
     * @param args
     */
    public static void main(String[] args) {
        Map<Integer, byte[]> map = new HashMap<Integer, byte[]>();
        for(int i=0;i<5;i++){
            byte[] b = new byte[1000*1024];
            map.put(i,b);
        }
    }
}
