package ref;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class TraceCanReliveObj {
    public static TraceCanReliveObj obj;
    static ReferenceQueue<TraceCanReliveObj> phantomQueue = null;
    public static class CheckRefQueue extends Thread{
        @Override
        public void run() {
            while (true){
                if(phantomQueue != null){
                    PhantomReference<TraceCanReliveObj> objt = null;
                    try {
                        objt = (PhantomReference<TraceCanReliveObj>)phantomQueue.remove();
                    }catch (InterruptedException ie){
                        ie.printStackTrace();
                    }
                    if(objt != null){
                        System.out.println("TraceCanReliveObj is delete");
                    }
                }
            }
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("CanReliveObj finalize called");
        obj = this;
    }

    @Override
    public String toString() {
        return "i am CanReliveObj";
    }

    /**
     * 虚引用是所有引用类型中最弱的一个
     * 持有虚引用的对象和没有引用几乎一样，随时都可能被垃圾回收器回收
     * 当试图通过虚引用的get()方法取得强引用时总是会失败
     *
     * 虚引用必须和引用队列一起使用，他的作用在于跟踪垃圾回收过程
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException{
        Thread t = new CheckRefQueue();
        t.setDaemon(true);
        t.start();

        phantomQueue = new ReferenceQueue<TraceCanReliveObj>();
        obj = new TraceCanReliveObj();
        PhantomReference<TraceCanReliveObj> phantomReference = new PhantomReference<TraceCanReliveObj>(obj,phantomQueue);
        System.out.println(phantomReference.get());
        obj = null;
        System.gc();

        Thread.sleep(1000);
        if(obj == null){
            System.out.println("obj is null");
        }else {
            System.out.println("obj 可用");
        }

        System.out.println("第二次gc");
        obj = null;
        System.gc();

        Thread.sleep(1000);
        if(obj == null){
            System.out.println("obj is null");
        }else {
            System.out.println("obj 可用");
        }
    }
}
