package heap;

import java.nio.ByteBuffer;

public class AccessDirectBuffer {
    public void directAccess(){
        ByteBuffer b = ByteBuffer.allocateDirect(500);
        long startTime = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            for(int j=0;j<99;j++){
                b.putInt(j);
            }
            b.flip();
            for(int j=0;j<99;j++){
                b.getInt();
            }
            b.clear();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("testDirectWrite:"+(endTime-startTime));
    }

    public void bufferAccess(){
        ByteBuffer b = ByteBuffer.allocate(500);
        long startTime = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            for(int j=0;j<99;j++){
                b.putInt(j);
            }
            b.flip();
            for(int j=0;j<99;j++){
                b.getInt();
            }
            b.clear();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("testBufferWrite:"+(endTime-startTime));
    }

    /**
     * 为了摒除申请内存的时间消耗，将开始时间置于分配内存之后
     * 可以看出对直接内存的读写明显快于对堆内存的读写
     * testBufferWrite:364
     * testDirectWrite:46
     * @param args
     */
    public static void main(String[] args) {
        AccessDirectBuffer alloc =  new AccessDirectBuffer();
        alloc.bufferAccess();
        alloc.directAccess();
        System.out.println("-----预热结束-----");
        alloc.bufferAccess();
        alloc.directAccess();
    }
}
