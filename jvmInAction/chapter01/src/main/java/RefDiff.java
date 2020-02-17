public class RefDiff {
    /**
     * 对于原始类型来说i1和i2表示不同的变量
     * 但对于引用类型来说，v1和v2都指向同一个new 出来的Value对象
     * @param args
     */
    public static void main(String[] args) {
        int i1 = 3;
        int i2 = i1;
        i2 = 5;
        System.out.println("i1="+i1);
        System.out.println("i2="+i2);

        Value v1 = new Value();
        v1.val=5;
        Value v2 = v1;
        v2.val = 10;
        System.out.println("v1.val="+v1.val);
        System.out.println("v2.val="+v2.val);
    }
}

class Value{int val;}
