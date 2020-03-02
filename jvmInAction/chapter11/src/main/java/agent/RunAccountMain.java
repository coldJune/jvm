package agent;

import aop.timestat.Account;

/**
 * -javaagent:/Users/dengxiaojun/Downloads/agent.jar
 * 使用以上参数访问打好的jar包
 *
 * -javaagent:/Users/dengxiaojun/Downloads/agent.jar=argument
 * 可以在代理后面加上参数
 *
 */
public class RunAccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.operation();
    }
}
