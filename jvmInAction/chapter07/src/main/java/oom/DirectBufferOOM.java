package oom;

import java.nio.ByteBuffer;

public class DirectBufferOOM {
    /**
     * -Xmx512m -XX:+PrintGCDetails
     * 直接内存在第510次循环的时候触发GC，这是一为默认直接内存的大小-XX:MaxDirectMemorySize的值为-Xmx的值
     * 此处-Xmx设置512M，则直接内存在510次申请时达到限定值触发GC，GC会回收直接内存
     *
     * -Xmx512m -XX:+PrintGCDetails -XX:MaxDirectMemorySize=2g
     * 将直接内存的大小设置为2g将不会触发GC
     *
     * 在32位虚拟机上会报OOM，因为32位系统对应用程序的可用最大内存有限制
     * @param args
     */
    public static void main(String[] args) {
        for(int i=0;i<1024;i++){
            ByteBuffer.allocateDirect(1024*1024);
            System.out.println(i);
        }
    }
}
