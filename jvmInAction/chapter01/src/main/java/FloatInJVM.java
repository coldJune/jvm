public class FloatInJVM {
    /**
     * 浮点数在JVM中用IEEE 754表示
     * Float.floatToRawIntBits可以获得单精度的表示
     * @param args
     */
    public static void main(String[] args) {
        float a = -5;
        System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(a)));
    }
}
