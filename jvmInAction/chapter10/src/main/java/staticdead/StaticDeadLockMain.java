package staticdead;

public class StaticDeadLockMain extends Thread {
    private char flag;

    public StaticDeadLockMain(char flag) {
        this.flag = flag;
        this.setName("Thread"+flag);
    }

    @Override
    public void run() {
        try {
            Class.forName("staticdead.Static"+flag);
        }catch (ClassNotFoundException e){

        }
        System.out.println(getName()+" over");
    }

    /**
     * 类初始化过程中也会出现死锁问题，如StaticA在初始化时会尝试初始化StaticB，StaticB在初始化是会尝试初始化StaticA
     * 系统并不会给出足够的信息判断死锁，但是死锁确实存在
     * @param args
     */
    public static void main(String[] args) {
        StaticDeadLockMain loadA = new StaticDeadLockMain('A');
        StaticDeadLockMain loadB = new StaticDeadLockMain('B');
        loadA.start();
        loadB.start();

    }
}
