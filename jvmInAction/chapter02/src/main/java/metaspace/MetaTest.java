package metaspace;

import java.util.HashMap;

public class MetaTest {
    /**
     * -Xlog:gc* -XX:MaxMetaspaceSize=10m
     * 设置元空间大小为10m，使用Cglib动态生成类，由于类的元信息是存储在元空间
     * 在创建147个类之后会报内存溢出
     * Caused by: java.lang.OutOfMemoryError: Metaspace
     * @param args
     */
    public static void main(String[] args) {
        int i=0;
        try {
            for(i=0;i<100000;i++){
                CglibBean bean = new CglibBean("metaspace"+i, new HashMap());
            }
        }catch (Exception e){
            System.out.println("total create count:"+i);
            e.printStackTrace();
        }
    }
}
