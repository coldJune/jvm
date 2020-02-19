package ref;

public class CanReliveObj {
    public static CanReliveObj obj;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("CanReliveObj finalize called");
        obj = this;
    }

    @Override
    public String toString() {
        return "I am CanReliveObj";
    }

    /**
     * finalize可以复活对象，但finalize只会被调用一次
     * 不推荐使用finalize
     * 1.finalize有可能发生引用外泄，在无意中复活对象
     * 2.finalize是被系统调用，调用时间不明确，所以不是一个好的资源释放方案，推荐使用try-catch-finally释放资源
     * but
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException{
        obj = new CanReliveObj();
        obj = null;
        System.gc();
        Thread.sleep(1000);
        if(obj == null){
            System.out.println("obj 是 null");
        }else {
            System.out.println("obj 可用");
        }

        System.out.println("第二次gc");
        obj = null;
        Thread.sleep(1000);
        if(obj == null){
            System.out.println("obj 是 null");
        }else{
            System.out.println("obj 可用");
        }

    }
}
