public class IntInJVM {
    /**
     * 整数在虚拟机中用补码表示
     * int表示32位有符号整数，第一位位符号位，1表示负数，0表示正数
     * 补码的计算规则为，正数补码和原码，负数的补码是其反码+1
     *
     * 以下代码进行32次循环，每次循环取出int中的一位
     * 0x80000000是一个首位为1，其余位为0的整数，通过右移i位定位到要获取的第i位
     * 并将除该位的其它位统一设置为0，保持该位不变，最后将该位移至最右进行输出
     * -10=11111111111111111111111111110110
     * @param args
     */
    public static void main(String[] args) {
        int a = -10;
        for(int i=0;i<32;i++){
            int t = (a& 0x80000000>>>i)>>>(31-i);
            System.out.print(t);
        }
        System.out.println();
        System.out.println(Integer.toBinaryString(a));
    }
}
