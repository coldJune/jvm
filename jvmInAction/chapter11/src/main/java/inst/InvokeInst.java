package inst;

import java.util.Date;

/**
 * Classfile /Users/dengxiaojun/Documents/GitHub/jvm/jvmInAction/chapter11/src/main/java/inst/InvokeInst.class
 *   Last modified 2020年2月28日; size 1244 bytes
 *   MD5 checksum e53e8b89def75ec7da38087f3c7203ea
 *   Compiled from "InvokeInst.java"
 * public class inst.InvokeInst
 *   minor version: 0
 *   major version: 55
 *   flags: (0x0021) ACC_PUBLIC, ACC_SUPER
 *   this_class: #18                         // inst/InvokeInst
 *   super_class: #19                        // java/lang/Object
 *   interfaces: 0, fields: 0, methods: 10, attributes: 3
 * Constant pool:
 *    #1 = Methodref          #19.#40        // java/lang/Object."<init>":()V
 *    #2 = Fieldref           #41.#42        // java/lang/System.out:Ljava/io/PrintStream;
 *    #3 = String             #43            // aa
 *    #4 = Methodref          #44.#45        // java/io/PrintStream.println:(Ljava/lang/String;)V
 *    #5 = Class              #46            // java/util/Date
 *    #6 = Methodref          #5.#40         // java/util/Date."<init>":()V
 *    #7 = Methodref          #18.#47        // inst/InvokeInst.pMethod:()V
 *    #8 = Methodref          #19.#48        // java/lang/Object.toString:()Ljava/lang/String;
 *    #9 = Class              #49            // java/lang/Thread
 *   #10 = Methodref          #9.#40         // java/lang/Thread."<init>":()V
 *   #11 = Methodref          #9.#50         // java/lang/Thread.run:()V
 *   #12 = InterfaceMethodref #51.#50        // java/lang/Runnable.run:()V
 *   #13 = Long               2l
 *   #15 = InterfaceMethodref #20.#52        // inst/InvokeInst$IAdd.add:(JJJ)J
 *   #16 = Methodref          #53.#54        // java/lang/Math.abs:(I)I
 *   #17 = String             #55            //
 *   #18 = Class              #56            // inst/InvokeInst
 *   #19 = Class              #57            // java/lang/Object
 *   #20 = Class              #58            // inst/InvokeInst$IAdd
 *   #21 = Utf8               IAdd
 *   #22 = Utf8               InnerClasses
 *   #23 = Utf8               <init>
 *   #24 = Utf8               ()V
 *   #25 = Utf8               Code
 *   #26 = Utf8               LineNumberTable
 *   #27 = Utf8               pMethod
 *   #28 = Utf8               invokeVirtual
 *   #29 = Utf8               invokeSpecial1
 *   #30 = Utf8               invokeSpecial2
 *   #31 = Utf8               invokeSpecial3
 *   #32 = Utf8               invokeInterface
 *   #33 = Utf8               invokeInterface2
 *   #34 = Utf8               invokeStatic
 *   #35 = Utf8               toString
 *   #36 = Utf8               ()Ljava/lang/String;
 *   #37 = Utf8               SourceFile
 *   #38 = Utf8               InvokeInst.java
 *   #39 = Utf8               NestMembers
 *   #40 = NameAndType        #23:#24        // "<init>":()V
 *   #41 = Class              #59            // java/lang/System
 *   #42 = NameAndType        #60:#61        // out:Ljava/io/PrintStream;
 *   #43 = Utf8               aa
 *   #44 = Class              #62            // java/io/PrintStream
 *   #45 = NameAndType        #63:#64        // println:(Ljava/lang/String;)V
 *   #46 = Utf8               java/util/Date
 *   #47 = NameAndType        #27:#24        // pMethod:()V
 *   #48 = NameAndType        #35:#36        // toString:()Ljava/lang/String;
 *   #49 = Utf8               java/lang/Thread
 *   #50 = NameAndType        #65:#24        // run:()V
 *   #51 = Class              #66            // java/lang/Runnable
 *   #52 = NameAndType        #67:#68        // add:(JJJ)J
 *   #53 = Class              #69            // java/lang/Math
 *   #54 = NameAndType        #70:#71        // abs:(I)I
 *   #55 = Utf8
 *   #56 = Utf8               inst/InvokeInst
 *   #57 = Utf8               java/lang/Object
 *   #58 = Utf8               inst/InvokeInst$IAdd
 *   #59 = Utf8               java/lang/System
 *   #60 = Utf8               out
 *   #61 = Utf8               Ljava/io/PrintStream;
 *   #62 = Utf8               java/io/PrintStream
 *   #63 = Utf8               println
 *   #64 = Utf8               (Ljava/lang/String;)V
 *   #65 = Utf8               run
 *   #66 = Utf8               java/lang/Runnable
 *   #67 = Utf8               add
 *   #68 = Utf8               (JJJ)J
 *   #69 = Utf8               java/lang/Math
 *   #70 = Utf8               abs
 *   #71 = Utf8               (I)I
 * {
 *   public inst.InvokeInst();
 *     descriptor: ()V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=1, locals=1, args_size=1
 *          0: aload_0
 *          1: invokespecial #1                  // Method java/lang/Object."<init>":()V
 *          4: return
 *       LineNumberTable:
 *         line 5: 0
 *
 *   public void invokeVirtual();
 *     descriptor: ()V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=2, locals=1, args_size=1
 *          0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
 *          3: ldc           #3                  // String aa
 *          5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
 *          8: return
 *       LineNumberTable:
 *         line 10: 0
 *         line 11: 8
 *
 *   public void invokeSpecial1();
 *     descriptor: ()V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=2, locals=2, args_size=1
 *          0: new           #5                  // class java/util/Date
 *          3: dup
 *          4: invokespecial #6                  // Method java/util/Date."<init>":()V
 *          7: astore_1
 *          8: return
 *       LineNumberTable:
 *         line 14: 0
 *         line 15: 8
 *
 *   public void invokeSpecial2();
 *     descriptor: ()V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=1, locals=1, args_size=1
 *          0: aload_0
 *          1: invokevirtual #7                  // Method pMethod:()V
 *          4: return
 *       LineNumberTable:
 *         line 17: 0
 *         line 18: 4
 *
 *   public void invokeSpecial3();
 *     descriptor: ()V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=1, locals=1, args_size=1
 *          0: aload_0
 *          1: invokespecial #8                  // Method java/lang/Object.toString:()Ljava/lang/String;
 *          4: pop
 *          5: return
 *       LineNumberTable:
 *         line 21: 0
 *         line 22: 5
 *
 *   public void invokeInterface();
 *     descriptor: ()V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=2, locals=2, args_size=1
 *          0: new           #9                  // class java/lang/Thread
 *          3: dup
 *          4: invokespecial #10                 // Method java/lang/Thread."<init>":()V
 *          7: astore_1
 *          8: aload_1
 *          9: invokevirtual #11                 // Method java/lang/Thread.run:()V
 *         12: aload_1
 *         13: invokeinterface #12,  1           // InterfaceMethod java/lang/Runnable.run:()V
 *         18: return
 *       LineNumberTable:
 *         line 25: 0
 *         line 26: 8
 *         line 27: 12
 *         line 28: 18
 *
 *   public void invokeInterface2();
 *     descriptor: ()V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=7, locals=2, args_size=1
 *          0: aconst_null
 *          1: astore_1
 *          2: aload_1
 *          3: lconst_1
 *          4: lconst_1
 *          5: ldc2_w        #13                 // long 2l
 *          8: invokeinterface #15,  7           // InterfaceMethod inst/InvokeInst$IAdd.add:(JJJ)J
 *         13: pop2
 *         14: return
 *       LineNumberTable:
 *         line 34: 0
 *         line 35: 2
 *         line 36: 14
 *
 *   public void invokeStatic();
 *     descriptor: ()V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=1, locals=1, args_size=1
 *          0: iconst_m1
 *          1: invokestatic  #16                 // Method java/lang/Math.abs:(I)I
 *          4: pop
 *          5: return
 *       LineNumberTable:
 *         line 39: 0
 *         line 40: 5
 *
 *   public java.lang.String toString();
 *     descriptor: ()Ljava/lang/String;
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=1, locals=1, args_size=1
 *          0: ldc           #17                 // String
 *          2: areturn
 *       LineNumberTable:
 *         line 44: 0
 * }
 * SourceFile: "InvokeInst.java"
 * NestMembers:
 *   inst/InvokeInst$IAdd
 * InnerClasses:
 *   public static #21= #20 of #18;          // IAdd=class inst/InvokeInst$IAdd of class inst/InvokeInst
 */
public class InvokeInst {
    private void pMethod(){

    }

    /**
     * public void invokeVirtual();
     *     descriptor: ()V
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=2, locals=1, args_size=1
     *          0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
     *          3: ldc           #3                  // String aa
     *          5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
     *                                  # invokevirtual虚函数调用，调用对象的实例方法，根据对象的实际类型进行派发，支持多态
     *                                  # 这里调用了PrintStream的println()方法，调用前在操作数栈中压入调用对象的实例和该函数的所有参数
     *                                  # invokevirtual需要两个字节作为操作数，用于计算指向常量池的索引，这里的索引必须是CONSTANT_Methodref入口，表示调用的方法
     *          8: return
     *       LineNumberTable:
     *         line 10: 0
     *         line 11: 8
     */
    public void invokeVirtual(){
        System.out.println("aa");
    }

    /**
     *  public void invokeSpecial1();
     *     descriptor: ()V
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=2, locals=2, args_size=1
     *          0: new           #5                  // class java/util/Date
     *          3: dup
     *          4: invokespecial #6                  // Method java/util/Date."<init>":()V
     *                                  # invokespecial用于调用特殊的函数，如构造函数、私有方法或父类方法
     *                                  # 指令调用时接收两个字节作为其操作数，用于计算常量池索引入口，该入口必须为CONSTAN_Methodref
     *                                  # 在调用时操作数栈中必须准备号对象实例、函数参数等信息
     *          7: astore_1
     *          8: return
     *       LineNumberTable:
     *         line 14: 0
     *         line 15: 8
     */
    public void invokeSpecial1(){
        Date d=new Date();
    }

    /**
     * public void invokeSpecial2();
     *     descriptor: ()V
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=1, locals=1, args_size=1
     *          0: aload_0
     *          1: invokevirtual #7                  // Method pMethod:()V
     *                                  # 调用私有方法
     *          4: return
     *       LineNumberTable:
     *         line 17: 0
     *         line 18: 4
     */
    public void invokeSpecial2(){
        pMethod();
    }

    /**
     *  public void invokeSpecial3();
     *     descriptor: ()V
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=1, locals=1, args_size=1
     *          0: aload_0
     *          1: invokespecial #8                  // Method java/lang/Object.toString:()Ljava/lang/String;
     *                                  # 调用父类方法，通过操作数指向父类的toString()方法，从而避免了子类toString()方法的使用
     *          4: pop
     *          5: return
     *       LineNumberTable:
     *         line 21: 0
     *         line 22: 5
     */
    public void invokeSpecial3(){
        super.toString();
    }

    /**
     *  public void invokeInterface();
     *     descriptor: ()V
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=2, locals=2, args_size=1
     *          0: new           #9                  // class java/lang/Thread
     *          3: dup
     *          4: invokespecial #10                 // Method java/lang/Thread."<init>":()V
     *          7: astore_1
     *          8: aload_1
     *          9: invokevirtual #11                 // Method java/lang/Thread.run:()V
     *                                      # 直接针对Thread对象的调用
     *         12: aload_1
     *         13: invokeinterface #12,  1           // InterfaceMethod java/lang/Runnable.run:()V
     *                                      # invokeinterface 接口方法的调用，当被调用对象申明为接口时，使用该指令调用接口的方法
     *                                      # invokeinterface 在调用时需要额外传入1个字节，作为无符号整数，表示这次调用所需参数的字数，包含隐含的this
     *                                      # 本例中函数没有参数，只需要当前引用this，故字数为1
     *         18: return
     *       LineNumberTable:
     *         line 25: 0
     *         line 26: 8
     *         line 27: 12
     *         line 28: 18
     *
     */
    public void invokeInterface(){
        Thread t=new Thread();
        t.run();
        ((Runnable)t).run();
    }

    public static interface IAdd{
        long add(long a,long b,long c);
    }

    /**
     *public void invokeInterface2();
     *     descriptor: ()V
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=7, locals=2, args_size=1
     *          0: aconst_null
     *          1: astore_1
     *          2: aload_1
     *          3: lconst_1
     *          4: lconst_1
     *          5: ldc2_w        #13                 // long 2l
     *          8: invokeinterface #15,  7           // InterfaceMethod inst/InvokeInst$IAdd.add:(JJJ)J
     *         13: pop2
     *         14: return
     *       LineNumberTable:
     *         line 34: 0
     *         line 35: 2
     *         line 36: 14
     */
    public void invokeInterface2(){
        IAdd c=null;
        c.add(1, 1,2);
    }

    /**
     *  public void invokeStatic();
     *     descriptor: ()V
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=1, locals=1, args_size=1
     *          0: iconst_m1
     *          1: invokestatic  #16                 // Method java/lang/Math.abs:(I)I
     *          4: pop
     *          5: return
     *       LineNumberTable:
     *         line 39: 0
     *         line 40: 5
     */
    public void invokeStatic(){
        Math.abs(-1);
    }

    /**
     *   public java.lang.String toString();
     *     descriptor: ()Ljava/lang/String;
     *     flags: (0x0001) ACC_PUBLIC
     *     Code:
     *       stack=1, locals=1, args_size=1
     *          0: ldc           #17                 // String
     *          2: areturn
     *       LineNumberTable:
     *         line 44: 0
     * @return
     */
    @Override
    public String toString(){
        return "";
    }
}
