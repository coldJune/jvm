public class LongFinalize {
    public static class LF{
        private byte[] content = new byte[512];

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            try {
                System.out.println(Thread.currentThread().getId());
                Thread.sleep(1000);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }

    /**
     * 函数finalize()由FinalizerThread线程处理
     * 由于对象回收前又被Finalizer的referent字段进行强引用，并加入FinalizerThread的执行队列，这让对象又变为可达，从而阻止对象的正常回收
     * 而且由于在引用队列中的元素排队执行finalize方法，一旦出现性能问题，可能导致垃圾对象长时间堆积从而导致OOM
     * 下面模拟了这种现象
     * -Xmx10m -Xms10m -XX:+PrintGCDetails -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=./f.dump
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException{
        long b = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            LF f = new LF();
            Thread.sleep(1);
        }
        long e = System.currentTimeMillis();
        System.out.println(e-b);
    }
}
