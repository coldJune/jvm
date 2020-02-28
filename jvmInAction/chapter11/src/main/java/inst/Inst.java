package inst;

/**
 *Classfile /Users/dengxiaojun/Documents/GitHub/jvm/jvmInAction/chapter11/src/main/java/inst/Inst.class
 *   Last modified 2020年2月28日; size 1671 bytes
 *   MD5 checksum 9bd2471ead0da0eb27d3b5f0d157a560
 *   Compiled from "Inst.java"
 * public class inst.Inst
 *   minor version: 0
 *   major version: 55
 *   flags: (0x0021) ACC_PUBLIC, ACC_SUPER
 *   this_class: #17                         // inst/Inst
 *   super_class: #8                         // java/lang/Object
 *   interfaces: 0, fields: 1, methods: 17, attributes: 1
 * Constant pool:
 *    #1 = Methodref          #8.#49         // java/lang/Object."<init>":()V
 *    #2 = Fieldref           #50.#51        // java/lang/System.out:Ljava/io/PrintStream;
 *    #3 = Double             100000.0d
 *    #5 = Methodref          #52.#53        // java/io/PrintStream.println:(D)V
 *    #6 = Methodref          #52.#54        // java/io/PrintStream.println:(I)V
 *    #7 = Methodref          #52.#55        // java/io/PrintStream.println:(C)V
 *    #8 = Class              #56            // java/lang/Object
 *    #9 = Methodref          #8.#57         // java/lang/Object.toString:()Ljava/lang/String;
 *   #10 = Float              8.0f
 *   #11 = Class              #58            // "[[I"
 *   #12 = String             #59            // hello
 *   #13 = Methodref          #52.#60        // java/io/PrintStream.println:(Ljava/lang/String;)V
 *   #14 = Class              #61            // java/lang/String
 *   #15 = Integer            1000000
 *   #16 = Fieldref           #17.#62        // inst/Inst.i:I
 *   #17 = Class              #63            // inst/Inst
 *   #18 = Utf8               i
 *   #19 = Utf8               I
 *   #20 = Utf8               <init>
 *   #21 = Utf8               ()V
 *   #22 = Utf8               Code
 *   #23 = Utf8               LineNumberTable
 *   #24 = Utf8               print1
 *   #25 = Utf8               print2
 *   #26 = Utf8               (IIII)V
 *   #27 = Utf8               print3
 *   #28 = Utf8               ([C[S)V
 *   #29 = Utf8               print4
 *   #30 = Utf8               ([C[I)V
 *   #31 = Utf8               print5
 *   #32 = Utf8               (I)V
 *   #33 = Utf8               print6
 *   #34 = Utf8               print7
 *   #35 = Utf8               (B)V
 *   #36 = Utf8               print8
 *   #37 = Utf8               print9
 *   #38 = Utf8               print10
 *   #39 = Utf8               print11
 *   #40 = Utf8               print13
 *   #41 = Utf8               print14
 *   #42 = Utf8               getFiled
 *   #43 = Utf8               chackcast
 *   #44 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
 *   #45 = Utf8               StackMapTable
 *   #46 = Utf8               <clinit>
 *   #47 = Utf8               SourceFile
 *   #48 = Utf8               Inst.java
 *   #49 = NameAndType        #20:#21        // "<init>":()V
 *   #50 = Class              #64            // java/lang/System
 *   #51 = NameAndType        #65:#66        // out:Ljava/io/PrintStream;
 *   #52 = Class              #67            // java/io/PrintStream
 *   #53 = NameAndType        #68:#69        // println:(D)V
 *   #54 = NameAndType        #68:#32        // println:(I)V
 *   #55 = NameAndType        #68:#70        // println:(C)V
 *   #56 = Utf8               java/lang/Object
 *   #57 = NameAndType        #71:#72        // toString:()Ljava/lang/String;
 *   #58 = Utf8               [[I
 *   #59 = Utf8               hello
 *   #60 = NameAndType        #68:#73        // println:(Ljava/lang/String;)V
 *   #61 = Utf8               java/lang/String
 *   #62 = NameAndType        #18:#19        // i:I
 *   #63 = Utf8               inst/Inst
 *   #64 = Utf8               java/lang/System
 *   #65 = Utf8               out
 *   #66 = Utf8               Ljava/io/PrintStream;
 *   #67 = Utf8               java/io/PrintStream
 *   #68 = Utf8               println
 *   #69 = Utf8               (D)V
 *   #70 = Utf8               (C)V
 *   #71 = Utf8               toString
 *   #72 = Utf8               ()Ljava/lang/String;
 *   #73 = Utf8               (Ljava/lang/String;)V
 * {
 *   public static int i;
 *     descriptor: I
 *     flags: (0x0009) ACC_PUBLIC, ACC_STATIC
 *
 *   public inst.Inst();
 *     descriptor: ()V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=1, locals=1, args_size=1
 *          0: aload_0
 *          1: invokespecial #1                  // Method java/lang/Object."<init>":()V
 *          4: return
 *       LineNumberTable:
 *         line 3: 0
 *
 *   public void print1();
 *     descriptor: ()V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=3, locals=1, args_size=1
 *          0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
 *          3: ldc2_w        #3                  // double 100000.0d
 *          6: invokevirtual #5                  // Method java/io/PrintStream.println:(D)V
 *          9: return
 *       LineNumberTable:
 *         line 7: 0
 *         line 8: 9
 *
 *   public void print2(int, int, int, int);
 *     descriptor: (IIII)V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=2, locals=6, args_size=5
 *          0: iload_1
 *          1: iload         4
 *          3: iadd
 *          4: istore        5
 *          6: return
 *       LineNumberTable:
 *         line 11: 0
 *         line 12: 6
 *
 *   public void print3(char[], short[]);
 *     descriptor: ([C[S)V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=3, locals=3, args_size=3
 *          0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
 *          3: aload_2
 *          4: iconst_0
 *          5: saload
 *          6: invokevirtual #6                  // Method java/io/PrintStream.println:(I)V
 *          9: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
 *         12: aload_1
 *         13: iconst_0
 *         14: caload
 *         15: invokevirtual #7                  // Method java/io/PrintStream.println:(C)V
 *         18: return
 *       LineNumberTable:
 *         line 15: 0
 *         line 16: 9
 *         line 17: 18
 *
 *   public void print4(char[], int[]);
 *     descriptor: ([C[I)V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=3, locals=7, args_size=3
 *          0: bipush        99
 *          2: istore        6
 *          4: aload_2
 *          5: iconst_0
 *          6: bipush        77
 *          8: iastore
 *          9: return
 *       LineNumberTable:
 *         line 21: 0
 *         line 22: 4
 *         line 23: 9
 *
 *   public void print5(int);
 *     descriptor: (I)V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=2, locals=3, args_size=2
 *          0: new           #8                  // class java/lang/Object
 *          3: dup
 *          4: invokespecial #1                  // Method java/lang/Object."<init>":()V
 *          7: astore_2
 *          8: aload_2
 *          9: invokevirtual #9                  // Method java/lang/Object.toString:()Ljava/lang/String;
 *         12: pop
 *         13: return
 *       LineNumberTable:
 *         line 31: 0
 *         line 32: 8
 *         line 33: 13
 *
 *   public void print6(int);
 *     descriptor: (I)V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=2, locals=6, args_size=2
 *          0: iload_1
 *          1: i2l
 *          2: lstore_2
 *          3: lload_2
 *          4: l2f
 *          5: fstore        4
 *          7: lload_2
 *          8: l2i
 *          9: istore        5
 *         11: return
 *       LineNumberTable:
 *         line 36: 0
 *         line 37: 3
 *         line 38: 7
 *         line 39: 11
 *
 *   public void print7(byte);
 *     descriptor: (B)V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=2, locals=5, args_size=2
 *          0: iload_1
 *          1: istore_2
 *          2: iload_1
 *          3: i2l
 *          4: lstore_3
 *          5: return
 *       LineNumberTable:
 *         line 42: 0
 *         line 43: 2
 *         line 44: 5
 *
 *   public void print8();
 *     descriptor: ()V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=1, locals=3, args_size=1
 *          0: ldc           #10                 // float 8.0f
 *          2: fstore_1
 *          3: fload_1
 *          4: fneg
 *          5: fstore_2
 *          6: fload_2
 *          7: fneg
 *          8: fstore_1
 *          9: return
 *       LineNumberTable:
 *         line 50: 0
 *         line 51: 3
 *         line 52: 6
 *         line 53: 9
 *
 *   public void print9();
 *     descriptor: ()V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=2, locals=4, args_size=1
 *          0: sipush        1000
 *          3: istore_1
 *          4: iconst_2
 *          5: istore_2
 *          6: iload_1
 *          7: iload_2
 *          8: irem
 *          9: istore_3
 *         10: return
 *       LineNumberTable:
 *         line 59: 0
 *         line 60: 4
 *         line 61: 6
 *         line 62: 10
 *
 *   public void print10();
 *     descriptor: ()V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=2, locals=3, args_size=1
 *          0: bipush        123
 *          2: istore_1
 *          3: iload_1
 *          4: iconst_m1
 *          5: ixor
 *          6: istore_2
 *          7: return
 *       LineNumberTable:
 *         line 65: 0
 *         line 66: 3
 *         line 67: 7
 *
 *   public void print11(int);
 *     descriptor: (I)V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=2, locals=3, args_size=2
 *          0: bipush        123
 *          2: istore_2
 *          3: iload_2
 *          4: bipush        10
 *          6: iadd
 *          7: istore_2
 *          8: return
 *       LineNumberTable:
 *         line 70: 0
 *         line 71: 3
 *         line 72: 8
 *
 *   public void print13();
 *     descriptor: ()V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=2, locals=3, args_size=1
 *          0: bipush        123
 *          2: istore_1
 *          3: bipush        122
 *          5: istore_2
 *          6: iload_1
 *          7: iload_2
 *          8: ixor
 *          9: istore_1
 *         10: return
 *       LineNumberTable:
 *         line 75: 0
 *         line 76: 3
 *         line 77: 6
 *         line 78: 10
 *
 *   public void print14();
 *     descriptor: ()V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=2, locals=4, args_size=1
 *          0: bipush        10
 *          2: newarray       int
 *          4: astore_1
 *          5: bipush        10
 *          7: anewarray     #8                  // class java/lang/Object
 *         10: astore_2
 *         11: bipush        10
 *         13: bipush        10
 *         15: multianewarray #11,  2            // class "[[I"
 *         19: astore_3
 *         20: return
 *       LineNumberTable:
 *         line 81: 0
 *         line 82: 5
 *         line 83: 11
 *         line 84: 20
 *
 *   public void getFiled();
 *     descriptor: ()V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=2, locals=1, args_size=1
 *          0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
 *          3: ldc           #12                 // String hello
 *          5: invokevirtual #13                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
 *          8: return
 *       LineNumberTable:
 *         line 87: 0
 *         line 88: 8
 *
 *   public java.lang.String chackcast(java.lang.Object);
 *     descriptor: (Ljava/lang/Object;)Ljava/lang/String;
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=1, locals=2, args_size=2
 *          0: aload_1
 *          1: instanceof    #14                 // class java/lang/String
 *          4: ifeq          12
 *          7: aload_1
 *          8: checkcast     #14                 // class java/lang/String
 *         11: areturn
 *         12: aconst_null
 *         13: areturn
 *       LineNumberTable:
 *         line 91: 0
 *         line 92: 7
 *         line 94: 12
 *       StackMapTable: number_of_entries = 1
 *         frame_type = 12 # same
 *
 *  static {};
 *     descriptor: ()V
 *     flags: (0x0008) ACC_STATIC
 *     Code:
 *       stack=1, locals=0, args_size=0
 *          0: ldc           #15                 // int 1000000
 *          2: putstatic     #16                 // Field i:I
 *          5: return
 *       LineNumberTable:
 *         line 4: 0
 * }
 * SourceFile: "Inst.java"
 */
public class Inst {
    public static int i = 1000000;

    /**
     *
     * public void print1();
     *     descriptor: ()V
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=3, locals=1, args_size=1
     *          0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
     *          3: ldc2_w        #3                  // double 100000.0d
     *                           # ldc是万能的入栈指令，它可以接受一个8位的参数，该参数指向常量池中的int、float或者String索引
     *                           # ldc_w接收两个8位参数，能支持的索引范围大于ldc
     *                           # ldc2_w用于压入long或者double
     *          6: invokevirtual #5                  // Method java/io/PrintStream.println:(D)V
     *          9: return
     *       LineNumberTable:
     *         line 7: 0
     *         line 8: 9
     */
    public void print1() {
        System.out.println(100000.0d);
    }

    /**
     * public void print2(int, int, int, int);
     *     descriptor: (IIII)V
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=2, locals=6, args_size=5
     *          0: iload_1
     *          1: iload         4 # 将局部变量表第四个位置的值压入操作数栈
     *          3: iadd
     *          4: istore        5 # 将操作数栈栈顶的值存入局部变量表第五个位置
     *          6: return
     *       LineNumberTable:
     *         line 11: 0
     *         line 12: 6
     * @param i
     * @param j
     * @param k
     * @param z
     */
    public void print2(int i, int j, int k, int z) {
        int b = i + z;
    }

    /**
     *  public void print3(char[], short[]);
     *     descriptor: ([C[S)V
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=3, locals=3, args_size=3
     *          0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
     *          3: aload_2          # 将数组引用入栈
     *          4: iconst_0         # 将索引入栈，索引为常数0
     *          5: saload           # 弹出栈顶的数组引用和索引，将s[0]入栈
     *          6: invokevirtual #6                  // Method java/io/PrintStream.println:(I)V
     *          9: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
     *         12: aload_1          # 将数组引用入栈
     *         13: iconst_0         # 将索引入栈，索引为常数0
     *         14: caload           # 弹出栈顶的char数组引用和索引，将cs[0]入栈
     *         15: invokevirtual #7                  // Method java/io/PrintStream.println:(C)V
     *         18: return
     *       LineNumberTable:
     *         line 15: 0
     *         line 16: 9
     *         line 17: 18
     * @param cs
     * @param s
     */
    public void print3(char[] cs, short[] s) {
        System.out.println(s[0]);
        System.out.println(cs[0]);
    }

    /**
     * public void print4(char[], int[]);
     *     descriptor: ([C[I)V
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=3, locals=7, args_size=3
     *          0: bipush        99  # 将99入栈
     *          2: istore        6   # 将99出栈并存入局部变量表第6个位置
     *          4: aload_2           # 将局部变量表第二个位置的数组引用入栈
     *          5: iconst_0          # 将常数0入栈
     *          6: bipush        77  # 将77入栈
     *          8: iastore           # iastore需要三个参数，表示将77赋值给局部变量表第二位数组的第0个索引位置
     *          9: return
     *       LineNumberTable:
     *         line 21: 0
     *         line 22: 4
     *         line 23: 9
     * @param cs
     * @param s
     */
    public void print4(char[] cs, int[] s) {
        int i, j, k, x;
        x = 99;
        s[0] = 77;
    }

    /**
     * public void print5(int);
     *     descriptor: (I)V
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=2, locals=3, args_size=2
     *          0: new           #8                  // class java/lang/Object
     *                              # new指令之后对obj对象进行了两次操作，一次是通过invokespecial调用构造函数，一次是通过astore_2将对象复制给obj局部变量
     *                              # 这两个操作都会将栈顶元素弹出，为了连续两次使用同样的栈顶元素，这里使用dup复制
     *          3: dup              # 复制栈顶元素并再次压入栈顶
     *          4: invokespecial #1                  // Method java/lang/Object."<init>":()V
     *          7: astore_2
     *          8: aload_2
     *          9: invokevirtual #9                  // Method java/lang/Object.toString:()Ljava/lang/String;
     *         12: pop              # 弹出栈顶元素直接废弃(pop只能丢弃一个字长32位，要丢弃2个字长64位需用pop2)
     *                              # 在obj.toString()方法执行完后，函数的返回值会出现在栈顶，但没有使用，故简单的使用pop丢弃
     *         13: return
     *       LineNumberTable:
     *         line 31: 0
     *         line 32: 8
     *         line 33: 13
     * @param i
     */
    public void print5(int i) {
        Object obj=new Object();
        obj.toString();
    }

    /**
     * public void print6(int);
     *     descriptor: (I)V
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=2, locals=6, args_size=2
     *          0: iload_1
     *          1: i2l          # int转换为long
     *          2: lstore_2
     *          3: lload_2
     *          4: l2f
     *          5: fstore        4
     *          7: lload_2
     *          8: l2i          # long转换为int
     *          9: istore        5
     *         11: return
     *       LineNumberTable:
     *         line 36: 0
     *         line 37: 3
     *         line 38: 7
     *         line 39: 11
     * @param i
     */
    public void print6(int i) {
        long l=i;
        float f=l;
        int j=(int)l;
    }

    /**
     * public void print7(byte);
     *     descriptor: (B)V
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=2, locals=5, args_size=2
     *          0: iload_1
     *          1: istore_2             # byte转换为int只是简单的通过操作数栈交换两个数据
     *          2: iload_1
     *          3: i2l                  # byte转换为long使用i2l，byte等同于int处理，short也类似
     *          4: lstore_3
     *          5: return
     *       LineNumberTable:
     *         line 42: 0
     *         line 43: 2
     *         line 44: 5
     *
     * 1.减少实际的数据类型
     * 2.局部变量表的槽位固定为32位，byte和short存入局部变量表也是占用32位，没有必要特意区分
     * @param i
     */
    public void print7(byte i) {
        int k=i;
        long l=i;
    }

    /**
     *  public void print8();
     *     descriptor: ()V
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=1, locals=3, args_size=1
     *          0: ldc           #10                 // float 8.0f
     *          2: fstore_1
     *          3: fload_1
     *          4: fneg         # fneg前后操作数栈没有变化，只有栈顶的元素符号位被取反
     *          5: fstore_2
     *          6: fload_2
     *          7: fneg
     *          8: fstore_1
     *          9: return
     *       LineNumberTable:
     *         line 50: 0
     *         line 51: 3
     *         line 52: 6
     *         line 53: 9
     */
    public void print8() {
        float i=8;
        float j=-i;
        i=-j;
    }

    /**
     *  public void print9();
     *     descriptor: ()V
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=2, locals=4, args_size=1
     *          0: sipush        1000
     *          3: istore_1
     *          4: iconst_2
     *          5: istore_2
     *          6: iload_1
     *          7: iload_2
     *          8: irem
     *          9: istore_3
     *         10: return
     *       LineNumberTable:
     *         line 59: 0
     *         line 60: 4
     *         line 61: 6
     *         line 62: 10
     */
    public void print9() {
        int d1=1000;
        int d2=2;
        int i=d1%d2;
    }

    /**
     * public void print10();
     *     descriptor: ()V
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=2, locals=3, args_size=1
     *          0: bipush        123
     *          2: istore_1
     *          3: iload_1
     *          4: iconst_m1            # 向操作数栈中压入常数-1
     *          5: ixor                 # ixor为整数的按位异或，从栈中弹出两个整数，并将它们按位异或，将结果再压入栈中
     *                                  # 取反操作通过与-1的按位异或完成
     *          6: istore_2
     *          7: return
     *       LineNumberTable:
     *         line 65: 0
     *         line 66: 3
     *         line 67: 7
     */
    public void print10() {
        int i=123;
        int j=~i;
    }

    /**
     *  public void print11(int);
     *     descriptor: (I)V
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=2, locals=3, args_size=2
     *          0: bipush        123
     *          2: istore_2
     *          3: iload_2
     *          4: bipush        10
     *          6: iadd
     *          7: istore_2
     *          8: return
     *       LineNumberTable:
     *         line 70: 0
     *         line 71: 3
     *         line 72: 8
     * @param j
     */
    public void print11(int j) {
        int i=123;
        i=i+10;
    }

    /**
     * public void print13();
     *     descriptor: ()V
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=2, locals=3, args_size=1
     *          0: bipush        123
     *          2: istore_1
     *          3: bipush        122
     *          5: istore_2
     *          6: iload_1
     *          7: iload_2
     *          8: ixor             # 按位异或
     *          9: istore_1
     *         10: return
     *       LineNumberTable:
     *         line 75: 0
     *         line 76: 3
     *         line 77: 6
     *         line 78: 10
     */
    public void print13() {
        int i=123;
        int j=122;
        i=i^j;
    }

    /**
     * public void print14();
     *     descriptor: ()V
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=2, locals=4, args_size=1
     *          0: bipush        10
     *          2: newarray       int           # newarray创建基本类型的数组，这里创建int类型数组
     *          4: astore_1
     *          5: bipush        10
     *          7: anewarray     #8                  // class java/lang/Object
     *                                          # anewarray创建对象类型的数组，这里创建Object类型的数组
     *         10: astore_2
     *         11: bipush        10
     *         13: bipush        10
     *         15: multianewarray #11,  2            // class "[[I"
     *                                          # multianewarray创建多位对象数组，这里创建10*10的数组
     *         19: astore_3
     *         20: return
     *       LineNumberTable:
     *         line 81: 0
     *         line 82: 5
     *         line 83: 11
     *         line 84: 20
     */
    public void print14() {
        int[] intarray=new int[10];
        Object[] objarray=new Object[10];
        int[][] mintarray=new int[10][10];
    }

    /**
     * public void getFiled();
     *     descriptor: ()V
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=2, locals=1, args_size=1
     *          0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
     *                                  # getstatic用于操作类的静态字段，它含有一个操作数，为指向常量池的Fieldref索引
     *                                  # 其作用是获取Fieldref指定的对象或者值，并将其压入操作数栈
     *                                  # 这里用于将System.out这个静态字段压入操作数栈。这段指令显示常量池2号为Fieldref，它指向System.out静态字段，字段类型为java/io/PrintStream
     *          3: ldc           #12                 // String hello
     *          5: invokevirtual #13                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
     *          8: return
     *       LineNumberTable:
     *         line 87: 0
     *         line 88: 8
     */
    public void getFiled() {
        System.out.println("hello");
    }

    /**
     * public java.lang.String chackcast(java.lang.Object);
     *     descriptor: (Ljava/lang/Object;)Ljava/lang/String;
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=1, locals=2, args_size=2
     *          0: aload_1
     *          1: instanceof    #14                 // class java/lang/String
     *                                  # instanceof用来判断给定对象是否是某一个类的实例，它会将结果压入操作数栈
     *          4: ifeq          12
     *          7: aload_1
     *          8: checkcast     #14                 // class java/lang/String
     *                                  # checkcast用于检查类型强制转换是否可以进行，如果可以，checkcast指令不会改变操作数栈，如果不行，则会抛出ClassCastException异常
     *         11: areturn
     *         12: aconst_null
     *         13: areturn
     *       LineNumberTable:
     *         line 91: 0
     *         line 92: 7
     *         line 94: 12
     *       StackMapTable: number_of_entries = 1
     *         frame_type = 12 #same
     * @param obj
     * @return
     */
    public String chackcast(Object obj) {
        if(obj instanceof String)
            return (String)obj;
        else
            return null;
    }
}
