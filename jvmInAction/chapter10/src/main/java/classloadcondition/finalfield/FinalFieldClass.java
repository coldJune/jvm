package classloadcondition.finalfield;

public class FinalFieldClass {
    public static final String constString="CONST";

    static {
        System.out.println("FinalFieldClass init");
    }
}
