import java.io.*;

public class HoldIOMain {
    public static class HoldIOTask implements Runnable{
        public void run() {
            while (true){
                try {
                    FileOutputStream fos = new FileOutputStream(new File("tmp"));
                    for(int i=0;i<10000;i++){
                        fos.write(i);
                    }
                    fos.close();
                    FileInputStream fis = new FileInputStream(new File("temp"));
                    while(fis.read()!=-1);
                    System.out.println("once ag");
                }catch (FileNotFoundException e){
                    e.printStackTrace();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static class LazyTask implements Runnable{
        public void run() {
            try {
                while (true){
                    Thread.sleep(1000);
                }
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }

    /**
     * 通过jps找到进程ID，使用pidstat -p pid -d -t 1 3监控程序的I/O使用情况，
     * -d表明监控对象为磁盘I/O
     * @param args
     */
    public static void main(String[] args) {
        new Thread(new HoldIOTask()).start();
        new Thread(new LazyTask()).start();
        new Thread(new LazyTask()).start();
        new Thread(new LazyTask()).start();
    }
}
