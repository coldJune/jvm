package heap;

import java.util.Vector;

public class DumpOOM {
    /**
     * -Xmx20m -Xms5m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=./a.dump
     * -XX:+HeapDumpOnOutOfMemoryError 在内存溢出时导出整个堆信息
     * -XX:HeapDumpPath=./a.dump 指定导出堆的存放路径
     *
     * -Xmx20m -Xms5m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=./a.dump "-XX:OnOutOfMemoryError=./jstack.sh %p"
     * -XX:OnOutOfMemoryError可以在堆溢出时指定运行的脚本
     * @param args
     */
    public static void main(String[] args) {
        Vector v = new Vector();
        for(int i=0;i<25;i++){
            v.add(new byte[1*1024*1024]);
        }
    }
}
