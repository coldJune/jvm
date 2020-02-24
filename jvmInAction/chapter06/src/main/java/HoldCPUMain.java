public class HoldCPUMain {
    public static class HoldCPUTask implements Runnable{
        public void run() {
            while (true){
                double a = Math.random()*Math.random();
            }
        }
    }

    public static class LazyTask implements Runnable{
        public void run() {
            try {
                while(true){
                    Thread.sleep(1000);
                }
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }

    /**
     * 使用jps找到JAVA程序的PID，然后使用pidstat -p pid -u 1 3输出程序的CPU使用情况
     * -p指定进程ID，-u表示CPU使用率监控
     * 同时可以使用-t监控到线程级别
     *
     * 可以通过pidstat找到占用大量CPU的java程序然后通过-u在java堆栈找到指定的代码
     * @param args
     */
    public static void main(String[] args) {
        new Thread(new HoldCPUTask()).start();
        new Thread(new LazyTask()).start();
        new Thread(new LazyTask()).start();
        new Thread(new LazyTask()).start();
    }
}
