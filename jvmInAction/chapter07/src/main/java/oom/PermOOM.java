package oom;

import metaspace.CglibBean;

import java.util.HashMap;

public class PermOOM {
    /**
     * -XX:MaxMetaspaceSize=10m
     * 如果不断的产生新的类而没有卸载，那么最终会导致永久区/元数据区溢出
     * 有三种方式可以缓解这种情况
     * 1.增加MaxMetaspaceSize的值
     * 2.减少系统需要的类的数量
     * 3.使用ClassLoader合理地装载各个类，并定期进行回收
     * @param args
     */
    public static void main(String[] args) {
        try {
            for(int i=0;i<1000000;i++){
                CglibBean bean = new CglibBean("com.jun.bean"+i,new HashMap());
            }
        }catch (Error e){
            e.printStackTrace();
        }
    }
}
