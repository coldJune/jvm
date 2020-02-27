package staticdead;

public class StaticA {
    static {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){

        }
        try {
            Class.forName("staticdead.StaticB");
        }catch (ClassNotFoundException e){

        }
        System.out.println("StaticA init OK");
    }
}
