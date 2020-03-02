package aop.securitycheck;

public class RunAccountMain {
    /**
     * 通过ASM织入相应共能
     * @param args
     */
    public static void main(String[] args) {
        Account account = new Account();
        account.operation();
    }
}
