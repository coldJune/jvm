package staticdead;

public class StaticB {
    static {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){

        }
        try {
            Class.forName("staticdead.StaticA");
        }catch (ClassNotFoundException e){

        }
        System.out.println("StaticB init OK");
    }
}
