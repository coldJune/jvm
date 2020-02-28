package inst;
//Classfile /Users/dengxiaojun/Documents/GitHub/jvm/jvmInAction/chapter11/src/main/java/inst/SkipInst.class
//  Last modified 2020年2月28日; size 1699 bytes
//  MD5 checksum d9311f5b5b6d7683db99867597d854ab
//  Compiled from "SkipInst.java"
//public class inst.SkipInst
//  minor version: 0
//  major version: 55
//  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
//  this_class: #15                         // inst/SkipInst
//  super_class: #7                         // java/lang/Object
//  interfaces: 0, fields: 0, methods: 10, attributes: 1
//Constant pool:
//   #1 = Methodref          #7.#37         // java/lang/Object."<init>":()V
//   #2 = Fieldref           #38.#39        // java/lang/System.out:Ljava/io/PrintStream;
//   #3 = Methodref          #23.#40        // java/io/PrintStream.println:(I)V
//   #4 = Methodref          #23.#41        // java/io/PrintStream.println:(Z)V
//   #5 = Float              9.0f
//   #6 = Float              10.0f
//   #7 = Class              #42            // java/lang/Object
//   #8 = Methodref          #32.#43        // java/lang/String.hashCode:()I
//   #9 = String             #44            // geym
//  #10 = Methodref          #32.#45        // java/lang/String.equals:(Ljava/lang/Object;)Z
//  #11 = String             #46            // zbase
//  #12 = String             #47            // java
//  #13 = Methodref          #15.#48        // inst/SkipInst.swtich3:(I)V
//  #14 = Methodref          #15.#49        // inst/SkipInst.swtich2:(I)V
//  #15 = Class              #50            // inst/SkipInst
//  #16 = Utf8               <init>
//  #17 = Utf8               ()V
//  #18 = Utf8               Code
//  #19 = Utf8               LineNumberTable
//  #20 = Utf8               arraySize
//  #21 = Utf8               cmp
//  #22 = Utf8               StackMapTable
//  #23 = Class              #51            // java/io/PrintStream
//  #24 = Utf8               cmp2
//  #25 = Utf8               cmp3
//  #26 = Utf8               swtich1
//  #27 = Utf8               (I)V
//  #28 = Utf8               swtich2
//  #29 = Utf8               swtich3
//  #30 = Utf8               swtich4
//  #31 = Utf8               (Ljava/lang/String;)V
//  #32 = Class              #52            // java/lang/String
//  #33 = Utf8               trycatch
//  #34 = Class              #53            // java/lang/Throwable
//  #35 = Utf8               SourceFile
//  #36 = Utf8               SkipInst.java
//  #37 = NameAndType        #16:#17        // "<init>":()V
//  #38 = Class              #54            // java/lang/System
//  #39 = NameAndType        #55:#56        // out:Ljava/io/PrintStream;
//  #40 = NameAndType        #57:#27        // println:(I)V
//  #41 = NameAndType        #57:#58        // println:(Z)V
//  #42 = Utf8               java/lang/Object
//  #43 = NameAndType        #59:#60        // hashCode:()I
//  #44 = Utf8               geym
//  #45 = NameAndType        #61:#62        // equals:(Ljava/lang/Object;)Z
//  #46 = Utf8               zbase
//  #47 = Utf8               java
//  #48 = NameAndType        #29:#27        // swtich3:(I)V
//  #49 = NameAndType        #28:#27        // swtich2:(I)V
//  #50 = Utf8               inst/SkipInst
//  #51 = Utf8               java/io/PrintStream
//  #52 = Utf8               java/lang/String
//  #53 = Utf8               java/lang/Throwable
//  #54 = Utf8               java/lang/System
//  #55 = Utf8               out
//  #56 = Utf8               Ljava/io/PrintStream;
//  #57 = Utf8               println
//  #58 = Utf8               (Z)V
//  #59 = Utf8               hashCode
//  #60 = Utf8               ()I
//  #61 = Utf8               equals
//  #62 = Utf8               (Ljava/lang/Object;)Z
//{
//  public inst.SkipInst();
//    descriptor: ()V
//    flags: (0x0001) ACC_PUBLIC
//    Code:
//      stack=1, locals=1, args_size=1
//         0: aload_0
//         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//         4: return
//      LineNumberTable:
//        line 3: 0
//
//  public void arraySize();
//    descriptor: ()V
//    flags: (0x0001) ACC_PUBLIC
//    Code:
//      stack=2, locals=2, args_size=1
//         0: bipush        10
//         2: newarray       int
//         4: astore_1
//         5: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
//         8: aload_1
//         9: arraylength
//        10: invokevirtual #3                  // Method java/io/PrintStream.println:(I)V
//        13: return
//      LineNumberTable:
//        line 5: 0
//        line 6: 5
//        line 7: 13
//
//  public void cmp();
//    descriptor: ()V
//    flags: (0x0001) ACC_PUBLIC
//    Code:
//      stack=3, locals=3, args_size=1
//         0: bipush        9
//         2: istore_1
//         3: bipush        10
//         5: istore_2
//         6: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
//         9: iload_1
//        10: iload_2
//        11: if_icmple     18
//        14: iconst_1
//        15: goto          19
//        18: iconst_0
//        19: invokevirtual #4                  // Method java/io/PrintStream.println:(Z)V
//        22: return
//      LineNumberTable:
//        line 13: 0
//        line 14: 3
//        line 15: 6
//        line 16: 22
//      StackMapTable: number_of_entries = 2
//        frame_type = 255 /* full_frame */
//          offset_delta = 18
//          locals = [ class inst/SkipInst, int, int ]
//          stack = [ class java/io/PrintStream ]
//        frame_type = 255 /* full_frame */
//          offset_delta = 0
//          locals = [ class inst/SkipInst, int, int ]
//          stack = [ class java/io/PrintStream, int ]
//
//  public void cmp2();
//    descriptor: ()V
//    flags: (0x0001) ACC_PUBLIC
//    Code:
//      stack=3, locals=3, args_size=1
//         0: ldc           #5                  // float 9.0f
//         2: fstore_1
//         3: ldc           #6                  // float 10.0f
//         5: fstore_2
//         6: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
//         9: fload_1
//        10: fload_2
//        11: fcmpl
//        12: ifle          19
//        15: iconst_1
//        16: goto          20
//        19: iconst_0
//        20: invokevirtual #4                  // Method java/io/PrintStream.println:(Z)V
//        23: return
//      LineNumberTable:
//        line 22: 0
//        line 23: 3
//        line 24: 6
//        line 25: 23
//      StackMapTable: number_of_entries = 2
//        frame_type = 255 /* full_frame */
//          offset_delta = 19
//          locals = [ class inst/SkipInst, float, float ]
//          stack = [ class java/io/PrintStream ]
//        frame_type = 255 /* full_frame */
//          offset_delta = 0
//          locals = [ class inst/SkipInst, float, float ]
//          stack = [ class java/io/PrintStream, int ]
//
//  public void cmp3();
//    descriptor: ()V
//    flags: (0x0001) ACC_PUBLIC
//    Code:
//      stack=3, locals=3, args_size=1
//         0: new           #7                  // class java/lang/Object
//         3: dup
//         4: invokespecial #1                  // Method java/lang/Object."<init>":()V
//         7: astore_1
//         8: new           #7                  // class java/lang/Object
//        11: dup
//        12: invokespecial #1                  // Method java/lang/Object."<init>":()V
//        15: astore_2
//        16: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
//        19: aload_1
//        20: aload_2
//        21: if_acmpne     28
//        24: iconst_1
//        25: goto          29
//        28: iconst_0
//        29: invokevirtual #4                  // Method java/io/PrintStream.println:(Z)V
//        32: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
//        35: aload_1
//        36: aload_2
//        37: if_acmpeq     44
//        40: iconst_1
//        41: goto          45
//        44: iconst_0
//        45: invokevirtual #4                  // Method java/io/PrintStream.println:(Z)V
//        48: return
//      LineNumberTable:
//        line 31: 0
//        line 32: 8
//        line 33: 16
//        line 34: 32
//        line 35: 48
//      StackMapTable: number_of_entries = 4
//        frame_type = 255 /* full_frame */
//          offset_delta = 28
//          locals = [ class inst/SkipInst, class java/lang/Object, class java/lang/Object ]
//          stack = [ class java/io/PrintStream ]
//        frame_type = 255 /* full_frame */
//          offset_delta = 0
//          locals = [ class inst/SkipInst, class java/lang/Object, class java/lang/Object ]
//          stack = [ class java/io/PrintStream, int ]
//        frame_type = 78 /* same_locals_1_stack_item */
//          stack = [ class java/io/PrintStream ]
//        frame_type = 255 /* full_frame */
//          offset_delta = 0
//          locals = [ class inst/SkipInst, class java/lang/Object, class java/lang/Object ]
//          stack = [ class java/io/PrintStream, int ]
//
//  public void swtich1(int);
//    descriptor: (I)V
//    flags: (0x0001) ACC_PUBLIC
//    Code:
//      stack=1, locals=2, args_size=2
//         0: iload_1
//         1: tableswitch   { // 1 to 3
//                       1: 28
//                       2: 31
//                       3: 34
//                 default: 34
//            }
//        28: goto          34
//        31: goto          34
//        34: return
//      LineNumberTable:
//        line 43: 0
//        line 44: 28
//        line 45: 31
//        line 48: 34
//      StackMapTable: number_of_entries = 3
//        frame_type = 28 /* same */
//        frame_type = 2 /* same */
//        frame_type = 2 /* same */
//
//  public void swtich2(int);
//    descriptor: (I)V
//    flags: (0x0001) ACC_PUBLIC
//    Code:
//      stack=1, locals=2, args_size=2
//         0: iload_1
//         1: lookupswitch  { // 3
//                     100: 36
//                     200: 39
//                     300: 42
//                 default: 42
//            }
//        36: goto          42
//        39: goto          42
//        42: return
//      LineNumberTable:
//        line 56: 0
//        line 57: 36
//        line 58: 39
//        line 61: 42
//      StackMapTable: number_of_entries = 3
//        frame_type = 36 /* same */
//        frame_type = 2 /* same */
//        frame_type = 2 /* same */
//
//  public void swtich3(int);
//    descriptor: (I)V
//    flags: (0x0001) ACC_PUBLIC
//    Code:
//      stack=1, locals=2, args_size=2
//         0: iload_1
//         1: tableswitch   { // 1 to 5
//                       1: 36
//                       2: 39
//                       3: 45
//                       4: 45
//                       5: 42
//                 default: 45
//            }
//        36: goto          45
//        39: goto          45
//        42: goto          45
//        45: return
//      LineNumberTable:
//        line 69: 0
//        line 71: 36
//        line 73: 39
//        line 75: 42
//        line 78: 45
//      StackMapTable: number_of_entries = 4
//        frame_type = 36 /* same */
//        frame_type = 2 /* same */
//        frame_type = 2 /* same */
//        frame_type = 2 /* same */
//
//  public void swtich4(java.lang.String);
//    descriptor: (Ljava/lang/String;)V
//    flags: (0x0001) ACC_PUBLIC
//    Code:
//      stack=2, locals=4, args_size=2
//         0: aload_1
//         1: astore_2
//         2: iconst_m1
//         3: istore_3
//         4: aload_2
//         5: invokevirtual #8                  // Method java/lang/String.hashCode:()I
//         8: lookupswitch  { // 3
//                 3169394: 44
//                 3254818: 72
//               115685963: 58
//                 default: 83
//            }
//        44: aload_2
//        45: ldc           #9                  // String geym
//        47: invokevirtual #10                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
//        50: ifeq          83
//        53: iconst_0
//        54: istore_3
//        55: goto          83
//        58: aload_2
//        59: ldc           #11                 // String zbase
//        61: invokevirtual #10                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
//        64: ifeq          83
//        67: iconst_1
//        68: istore_3
//        69: goto          83
//        72: aload_2
//        73: ldc           #12                 // String java
//        75: invokevirtual #10                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
//        78: ifeq          83
//        81: iconst_2
//        82: istore_3
//        83: iload_3
//        84: tableswitch   { // 0 to 2
//                       0: 112
//                       1: 115
//                       2: 118
//                 default: 121
//            }
//       112: goto          121
//       115: goto          121
//       118: goto          121
//       121: return
//      LineNumberTable:
//        line 81: 0
//        line 83: 112
//        line 85: 115
//        line 87: 118
//        line 90: 121
//      StackMapTable: number_of_entries = 8
//        frame_type = 253 /* append */
//          offset_delta = 44
//          locals = [ class java/lang/String, int ]
//        frame_type = 13 /* same */
//        frame_type = 13 /* same */
//        frame_type = 10 /* same */
//        frame_type = 28 /* same */
//        frame_type = 2 /* same */
//        frame_type = 2 /* same */
//        frame_type = 249 /* chop */
//          offset_delta = 2
//
//  public void trycatch();
//    descriptor: ()V
//    flags: (0x0001) ACC_PUBLIC
//    Code:
//      stack=2, locals=2, args_size=1
//         0: aload_0
//         1: iconst_1
//         2: invokevirtual #13                 // Method swtich3:(I)V
//         5: aload_0
//         6: iconst_1
//         7: invokevirtual #14                 // Method swtich2:(I)V
//        10: goto          21
//        13: astore_1
//        14: aload_0
//        15: iconst_1
//        16: invokevirtual #14                 // Method swtich2:(I)V
//        19: aload_1
//        20: athrow
//        21: return
//      Exception table:
//         from    to  target type
//             0     5    13   any
//      LineNumberTable:
//        line 94: 0
//        line 96: 5
//        line 97: 10
//        line 96: 13
//        line 97: 19
//        line 98: 21
//      StackMapTable: number_of_entries = 2
//        frame_type = 77 /* same_locals_1_stack_item */
//          stack = [ class java/lang/Throwable ]
//        frame_type = 7 /* same */
//}
//SourceFile: "SkipInst.java"
public class SkipInst {
    /**
     *public void arraySize();
     *     descriptor: ()V
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=2, locals=2, args_size=1
     *          0: bipush        10
     *          2: newarray       int
     *          4: astore_1
     *          5: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
     *          8: aload_1
     *          9: arraylength
     *         10: invokevirtual #3                  // Method java/io/PrintStream.println:(I)V
     *         13: return
     *       LineNumberTable:
     *         line 5: 0
     *         line 6: 5
     *         line 7: 13
     */
    public void arraySize() {
        int[] a = new int[10];
        System.out.println(a.length);
    }

   //public void cmp();
   //    descriptor: ()V
   //    flags: (0x0001) ACC_PUBLIC
   //    Code:
   //      stack=3, locals=3, args_size=1
   //         0: bipush        9
   //         2: istore_1
   //         3: bipush        10
   //         5: istore_2
   //         6: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
   //         9: iload_1
   //        10: iload_2
   //        11: if_icmple     18               # 如果条件成立则跳转到18行将0压入操作数栈，否则执行下一行将1压入操作数栈
   //        14: iconst_1
   //        15: goto          19
   //        18: iconst_0
   //        19: invokevirtual #4                  // Method java/io/PrintStream.println:(Z)V
   //        22: return
   //      LineNumberTable:
   //        line 13: 0
   //        line 14: 3
   //        line 15: 6
   //        line 16: 22
   //      StackMapTable: number_of_entries = 2
   //        frame_type = 255 /* full_frame */
   //          offset_delta = 18
   //          locals = [ class inst/SkipInst, int, int ]
   //          stack = [ class java/io/PrintStream ]
   //        frame_type = 255 /* full_frame */
   //          offset_delta = 0
   //          locals = [ class inst/SkipInst, int, int ]
   //          stack = [ class java/io/PrintStream, int ]
    public void cmp() {
        short f1 = 9;
        byte f2 = 10;
        System.out.println(f1 > f2);
    }

    //  public void cmp2();
    //    descriptor: ()V
    //    flags: (0x0001) ACC_PUBLIC
    //    Code:
    //      stack=3, locals=3, args_size=1
    //         0: ldc           #5                  // float 9.0f
    //         2: fstore_1
    //         3: ldc           #6                  // float 10.0f
    //         5: fstore_2
    //         6: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
    //         9: fload_1
    //        10: fload_2
    //        11: fcmpl                             # 对栈顶的两个元素进行比较
    //        12: ifle          19                  # 获取栈顶的结果，确认是否跳转
    //        15: iconst_1
    //        16: goto          20
    //        19: iconst_0
    //        20: invokevirtual #4                  // Method java/io/PrintStream.println:(Z)V
    //        23: return
    //      LineNumberTable:
    //        line 22: 0
    //        line 23: 3
    //        line 24: 6
    //        line 25: 23
    //      StackMapTable: number_of_entries = 2
    //        frame_type = 255 /* full_frame */
    //          offset_delta = 19
    //          locals = [ class inst/SkipInst, float, float ]
    //          stack = [ class java/io/PrintStream ]
    //        frame_type = 255 /* full_frame */
    //          offset_delta = 0
    //          locals = [ class inst/SkipInst, float, float ]
    //          stack = [ class java/io/PrintStream, int ]
    public void cmp2() {
        float f1 = 9;
        float f2 = 10;
        System.out.println(f1 > f2);
    }

    //public void cmp3();
    //    descriptor: ()V
    //    flags: (0x0001) ACC_PUBLIC
    //    Code:
    //      stack=3, locals=3, args_size=1
    //         0: new           #7                  // class java/lang/Object
    //         3: dup
    //         4: invokespecial #1                  // Method java/lang/Object."<init>":()V
    //         7: astore_1
    //         8: new           #7                  // class java/lang/Object
    //        11: dup
    //        12: invokespecial #1                  // Method java/lang/Object."<init>":()V
    //        15: astore_2
    //        16: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
    //        19: aload_1
    //        20: aload_2
    //        21: if_acmpne     28                  # 将19行20行分别压入栈顶元素进行比较，执行对象引用的比较并确认是否跳转
    //        24: iconst_1
    //        25: goto          29
    //        28: iconst_0
    //        29: invokevirtual #4                  // Method java/io/PrintStream.println:(Z)V
    //        32: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
    //        35: aload_1
    //        36: aload_2
    //        37: if_acmpeq     44
    //        40: iconst_1
    //        41: goto          45
    //        44: iconst_0
    //        45: invokevirtual #4                  // Method java/io/PrintStream.println:(Z)V
    //        48: return
    //      LineNumberTable:
    //        line 31: 0
    //        line 32: 8
    //        line 33: 16
    //        line 34: 32
    //        line 35: 48
    //      StackMapTable: number_of_entries = 4
    //        frame_type = 255 /* full_frame */
    //          offset_delta = 28
    //          locals = [ class inst/SkipInst, class java/lang/Object, class java/lang/Object ]
    //          stack = [ class java/io/PrintStream ]
    //        frame_type = 255 /* full_frame */
    //          offset_delta = 0
    //          locals = [ class inst/SkipInst, class java/lang/Object, class java/lang/Object ]
    //          stack = [ class java/io/PrintStream, int ]
    //        frame_type = 78 /* same_locals_1_stack_item */
    //          stack = [ class java/io/PrintStream ]
    //        frame_type = 255 /* full_frame */
    //          offset_delta = 0
    //          locals = [ class inst/SkipInst, class java/lang/Object, class java/lang/Object ]
    //          stack = [ class java/io/PrintStream, int ]
    public void cmp3() {
        Object f1 = new Object();
        Object f2 = new Object();
        System.out.println(f1 == f2);
        System.out.println(f1 != f2);
    }

    //public void swtich1(int);
    //    descriptor: (I)V
    //    flags: (0x0001) ACC_PUBLIC
    //    Code:
    //      stack=1, locals=2, args_size=2
    //         0: iload_1
    //         1: tableswitch   { // 1 to 3   # tableswitch的case值是连续的，只需要记录最低值和最高值以及每一项的偏移量，给定的index值通过简单的计算即可定位到offset
    //                       1: 28
    //                       2: 31
    //                       3: 34
    //                 default: 34
    //            }
    //        28: goto          34
    //        31: goto          34
    //        34: return
    //      LineNumberTable:
    //        line 43: 0
    //        line 44: 28
    //        line 45: 31
    //        line 48: 34
    //      StackMapTable: number_of_entries = 3
    //        frame_type = 28 /* same */
    //        frame_type = 2 /* same */
    //        frame_type = 2 /* same */
    public void swtich1(int i) {
        switch (i) {
            case 1:break;
            case 2:break;
            case 3:break;
        }
    }

    //public void swtich2(int);
    //    descriptor: (I)V
    //    flags: (0x0001) ACC_PUBLIC
    //    Code:
    //      stack=1, locals=2, args_size=2
    //         0: iload_1
    //         1: lookupswitch  { // 3  # lookupswitch处理的是离散的case值，并将case-offset对按照case值大小排序，给定index需要查找与index相等的case，获取offset
    //                                  # lookupswitch需要为每一种情况保存case-offset的值，所以占用空间更多
    //                     100: 36
    //                     200: 39
    //                     300: 42
    //                 default: 42
    //            }
    //        36: goto          42
    //        39: goto          42
    //        42: return
    //      LineNumberTable:
    //        line 56: 0
    //        line 57: 36
    //        line 58: 39
    //        line 61: 42
    //      StackMapTable: number_of_entries = 3
    //        frame_type = 36 /* same */
    //        frame_type = 2 /* same */
    //        frame_type = 2 /* same */
    public void swtich2(int i) {
        switch (i) {
            case 100:break;
            case 200:break;
            case 300:break;
        }
    }

    //public void swtich3(int);
    //    descriptor: (I)V
    //    flags: (0x0001) ACC_PUBLIC
    //    Code:
    //      stack=1, locals=2, args_size=2
    //         0: iload_1
    //         1: tableswitch   { // 1 to 5
    //                       1: 36
    //                       2: 39
    //                       3: 45
    //                       4: 45
    //                       5: 42
    //                 default: 45
    //            }
    //        36: goto          45
    //        39: goto          45
    //        42: goto          45
    //        45: return
    //      LineNumberTable:
    //        line 69: 0
    //        line 71: 36
    //        line 73: 39
    //        line 75: 42
    //        line 78: 45
    //      StackMapTable: number_of_entries = 4
    //        frame_type = 36 /* same */
    //        frame_type = 2 /* same */
    //        frame_type = 2 /* same */
    //        frame_type = 2 /* same */
    public void swtich3(int i) {
        switch (i) {
            case 1:
                break;
            case 2:
                break;
            case 5:
                break;
            default:
        }
    }

    //  public void swtich4(java.lang.String);
    //    descriptor: (Ljava/lang/String;)V
    //    flags: (0x0001) ACC_PUBLIC
    //    Code:
    //      stack=2, locals=4, args_size=2
    //         0: aload_1
    //         1: astore_2
    //         2: iconst_m1
    //         3: istore_3
    //         4: aload_2
    //         5: invokevirtual #8                  // Method java/lang/String.hashCode:()I
    //         8: lookupswitch  { // 3          # jdk7之后，支持使用字符串进行switch操作，字符串对应的switch通过lookupswitch指令实现，实际使用字符串的hash值作为分值的case
    //                                          # 如果hash没有匹配则必然没有该字符串，如果hash冲突则进行二次确认
    //                 3169394: 44
    //                 3254818: 72
    //               115685963: 58
    //                 default: 83
    //            }
    //        44: aload_2
    //        45: ldc           #9                  // String geym
    //        47: invokevirtual #10                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
    //        50: ifeq          83
    //        53: iconst_0
    //        54: istore_3
    //        55: goto          83
    //        58: aload_2
    //        59: ldc           #11                 // String zbase
    //        61: invokevirtual #10                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
    //        64: ifeq          83
    //        67: iconst_1
    //        68: istore_3
    //        69: goto          83
    //        72: aload_2
    //        73: ldc           #12                 // String java
    //        75: invokevirtual #10                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
    //        78: ifeq          83
    //        81: iconst_2
    //        82: istore_3
    //        83: iload_3
    //        84: tableswitch   { // 0 to 2
    //                       0: 112
    //                       1: 115
    //                       2: 118
    //                 default: 121
    //            }
    //       112: goto          121
    //       115: goto          121
    //       118: goto          121
    //       121: return
    //      LineNumberTable:
    //        line 81: 0
    //        line 83: 112
    //        line 85: 115
    //        line 87: 118
    //        line 90: 121
    //      StackMapTable: number_of_entries = 8
    //        frame_type = 253 /* append */
    //          offset_delta = 44
    //          locals = [ class java/lang/String, int ]
    //        frame_type = 13 /* same */
    //        frame_type = 13 /* same */
    //        frame_type = 10 /* same */
    //        frame_type = 28 /* same */
    //        frame_type = 2 /* same */
    //        frame_type = 2 /* same */
    //        frame_type = 249 /* chop */
    //          offset_delta = 2
    public void swtich4(String i) {
        switch (i) {
            case "geym":
                break;
            case "zbase":
                break;
            case "java":
                break;
            default:
        }
    }

    //public void trycatch();
    //    descriptor: ()V
    //    flags: (0x0001) ACC_PUBLIC
    //    Code:
    //      stack=2, locals=2, args_size=1
    //         0: aload_0
    //         1: iconst_1
    //         2: invokevirtual #13                 // Method swtich3:(I)V
    //         5: aload_0
    //         6: iconst_1
    //         7: invokevirtual #14                 // Method swtich2:(I)V
    //        10: goto          21
    //        13: astore_1
    //        14: aload_0
    //        15: iconst_1
    //        16: invokevirtual #14                 // Method swtich2:(I)V
    //        19: aload_1
    //        20: athrow
    //        21: return
    //      Exception table:
    //         from    to  target type
    //             0     5    13   any
    //      LineNumberTable:
    //        line 94: 0
    //        line 96: 5
    //        line 97: 10
    //        line 96: 13
    //        line 97: 19
    //        line 98: 21
    //      StackMapTable: number_of_entries = 2
    //        frame_type = 77 /* same_locals_1_stack_item */
    //          stack = [ class java/lang/Throwable ]
    //        frame_type = 7 /* same */
    public void trycatch() {
        try {
            swtich3(1);
        } finally {
            swtich2(1);
        }
    }
}
