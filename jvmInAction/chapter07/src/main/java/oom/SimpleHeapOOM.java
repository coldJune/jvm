package oom;

import java.util.ArrayList;

public class SimpleHeapOOM {
    /**
     * -Xmx1000M
     * 创建1024M的byte数组，设置最大堆内存为1000M，最后会报出堆溢出的错误
     * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
     * -Xmx2048M
     * 扩大堆内存将能缓解
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<byte[]>();
        for(int i=0;i<1024;i++){
            list.add(new byte[1024*1024]);
        }
    }
}
