package jit.tieredcom;

public class WriterMain {
    /**
     * -XX:+PrintCompilation -server -Xcomp -XX:-TieredCompilation
     * 打开编译日志，可以看到DBWriter::write被编译为本地代码
     * 而有些函数后面的made not entrant表示新的代码调用不能使用这块编译结果，但可能存在正在使用这段代码块的程序
     * 如果代码块没有被使用并处于made not entrant状态，一旦被清理线程发现，代码块会被进一步标记为mode zombie状态，此时代码块将被彻底清除
     *
     * -XX:+PrintCompilation -server -Xcomp -XX:+TieredCompilation
     * -XX:+TieredCompilation打开多级编译
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException{

        long b = System.currentTimeMillis();
        WriterService ws = new WriterService();
        for (int i=0;i<2000000;i++){
            ws.service();
        }
        System.out.println("spend "+(System.currentTimeMillis()-b));
        ws=null;
        System.gc();
        Thread.sleep(5000);

    }
}
