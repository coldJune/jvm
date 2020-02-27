package intern;

public class StringIntern {
    /**
     * 因为a和b的字面量都是"123"，所以a.equals(b)为true
     * 由于a和b是两个不同的对象，所以a==b为false
     * 因为a在拘留表中的引用就是b，所以a.intern()==为true
     * 由于b在拘留表中的引用就是b本身，而a是不同的对象，所以b.internal()==a为false, b.intern()==b为true
     * 由于a.intern()和a不是同一个，所以a.internal()==b为false
     * 由于a.intern()和b.intern()都指向b,所以两者相等
     * @param args
     */
    public static void main(String[] args) {
        String a = Integer.toString(1)+Integer.toString(2)+Integer.toString(3);
        String b = "123";
        System.out.println(a.equals(b));//true
        System.out.println(a==b);//false
        System.out.println(a.intern()==b);//true
        System.out.println(b.intern()==a);//false
        System.out.println(b.intern()==b);//true
        System.out.println(a==a.intern());//false
        System.out.println(b.intern()==a.intern());//true

    }
}
