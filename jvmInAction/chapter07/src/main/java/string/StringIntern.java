package string;

import java.util.ArrayList;

public class StringIntern {
    /**
     * -Xmx5m
     * JDK7之后常量池已经存放在堆中，所以会造成堆溢出
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        for(int i=0;i<1024*1024*7;i++){
            al.add(String.valueOf(i).intern());
        }
    }
}
