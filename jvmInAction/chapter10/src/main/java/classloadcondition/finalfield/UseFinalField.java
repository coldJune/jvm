package classloadcondition.finalfield;

public class UseFinalField {
    /**
     * 引用常量并不会导致类初始化，因为Class文件生成时，由于final的不变性，做了优化
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(FinalFieldClass.constString);
    }
}
