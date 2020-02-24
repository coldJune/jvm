public class HprofTest {
    public void slowMethd(){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }

    public void slowerMethod(){
        try {
            Thread.sleep(10000);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }

    public void fastMethod(){
        try {
            Thread.yield();
        }catch (Exception ie){
            ie.printStackTrace();
        }
    }

    /**
     * 使用参数-agentlib:hprof=cpu=times,interval=10启动可以查看程序中各个函数的CPU占用时间
     * @param args
     */
    public static void main(String[] args) {
        HprofTest test = new HprofTest();
        test.fastMethod();
        test.slowMethd();
        test.slowerMethod();
    }
}
