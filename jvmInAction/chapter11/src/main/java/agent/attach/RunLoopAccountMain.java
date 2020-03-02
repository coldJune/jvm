package agent.attach;

import aop.timestat.Account;

public class RunLoopAccountMain {
    /**
     * 不加任何虚拟机参数运行代码，持续调用operation
     * @param args
     */
    public static void main(String[] args) {
        Account account = new Account();
        while(true){
            account.operation();
            try {
                Thread.sleep(1000);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
