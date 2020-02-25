package heap;

import java.util.List;
import java.util.Vector;

public class TraceStudent {
    static List<WebPage> webpages = new Vector<WebPage>();

    public static void createWebPage(){
        for(int i=0;i<100;i++){
            WebPage wp = new WebPage();
            wp.setUrl("http://wwww."+Integer.toString(i)+".com");
            wp.setContent(Integer.toString(i));
            webpages.add(wp);
        }
    }

    /**
     * -XX:+HeapDumpBeforeFullGC -XX:HeapDumpPath=stu.hprof
     * @param args
     */
    public static void main(String[] args) {
        createWebPage();
        Student student3 = new Student(3,"jun");
        Student student5 = new Student(5,"cold");
        Student student7 = new Student(7,"deng");

        for(int i=0;i<webpages.size();i++){
            if(i%student3.getId() == 0){
                student3.visit(webpages.get(i));
            }
            if(i%student5.getId()==0){
                student5.visit(webpages.get(i));
            }
            if(i%student7.getId()==0){
                student7.visit(webpages.get(i));
            }
        }

        webpages.clear();
        System.gc();

    }
}
