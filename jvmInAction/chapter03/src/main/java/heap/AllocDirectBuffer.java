package heap;


import java.nio.ByteBuffer;

public class AllocDirectBuffer {
    public void directAllocate(){
        long startTime = System.currentTimeMillis();
        for(int i=0;i<2000000;i++){
            ByteBuffer b = ByteBuffer.allocateDirect(1000);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("direct alloc:"+(endTime-startTime));
    }

    public void bufferAllocate(){
        long startTime = System.currentTimeMillis();
        for(int i=0;i<2000000;i++){
            ByteBuffer b = ByteBuffer.allocate(1000);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("buffer alloc:"+(endTime-startTime));
    }

    /**
     * 可以看出在未预热的情况下申请内存空间时，堆内存远远快于直接内存
     * 但是在预热之后堆内存的速度相对于直接内存有不小的落后
     * @param args
     */
    public static void main(String[] args) {
        AllocDirectBuffer alloc = new AllocDirectBuffer();
        alloc.bufferAllocate();
        alloc.directAllocate();
        System.out.println("----预热结束----");
        alloc.bufferAllocate();
        alloc.directAllocate();
    }
}
