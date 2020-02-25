package string;

public class  StringBasic{
    /**
     * 当两个String对象拥有相同的值时，他们只是引用常量池的同一个拷贝
     *
     * str1和str2都开辟了一块空间存放String实例，所以他们在堆中的引用不同
     * 但由于他们都指向统一字符串常量，所以通过intern返回的字符串在常量池中的引用相同
     * @param args
     */
    public static void main(String[] args) {
        String str1 = new String("aa");
        String str2 = "aa";
        System.out.println(str1==str2);
        System.out.println(str1 == str2.intern());
        System.out.println("aa"==str2.intern());
        System.out.println(str1.intern()==str2.intern());
    }
}
