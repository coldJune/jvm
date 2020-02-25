package string;

public class ConstantPool {
    /**
     * 159259014
     * 653687670
     * 356473385
     * 构造一个函数在传入参数的基础上加一个0
     * 第一次打印字符串本身的hash
     * 第二次和第三次打印字符串在常量池中引用的hash
     * 在进行gc之后，即使第二次和第三次是字面量相同的字符串，但由于之前的字符串已经被回收，第三次相同字面量的字符串重新放入了常量池
     * 所以两者hash不同
     * 如果注释gc，则两者相同
     * @param args
     */
    public static void main(String[] args) {
        if(args.length==0)return;
        System.out.println(System.identityHashCode(args[0]+Integer.toString(0)));
        System.out.println(System.identityHashCode((args[0]+Integer.toString(0)).intern()));
//        System.gc();
        System.out.println(System.identityHashCode((args[0]+Integer.toString(0)).intern()));

    }
}
