/**
 * Classfile /Users/dengxiaojun/Documents/GitHub/jvm/jvmInAction/chapter11/src/main/java/Calc.class
 *   Last modified 2020年2月28日; size 262 bytes
 *   MD5 checksum 4405b3903de34c27a8613cfa9465c0c7
 *   Compiled from "Calc.java"
 * public class Calc
 *   minor version: 0
 *   major version: 55
 *   flags: (0x0021) ACC_PUBLIC, ACC_SUPER
 *   this_class: #2                          // Calc
 *   super_class: #3                         // java/lang/Object
 *   interfaces: 0, fields: 0, methods: 2, attributes: 1
 * Constant pool:
 *    #1 = Methodref          #3.#12         // java/lang/Object."<init>":()V
 *    #2 = Class              #13            // Calc
 *    #3 = Class              #14            // java/lang/Object
 *    #4 = Utf8               <init>
 *    #5 = Utf8               ()V
 *    #6 = Utf8               Code
 *    #7 = Utf8               LineNumberTable
 *    #8 = Utf8               calc
 *    #9 = Utf8               ()I
 *   #10 = Utf8               SourceFile
 *   #11 = Utf8               Calc.java
 *   #12 = NameAndType        #4:#5          // "<init>":()V
 *   #13 = Utf8               Calc
 *   #14 = Utf8               java/lang/Object
 * {
 *   public Calc();
 *     descriptor: ()V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=1, locals=1, args_size=1
 *          0: aload_0
 *          1: invokespecial #1                  // Method java/lang/Object."<init>":()V
 *          4: return
 *       LineNumberTable:
 *         line 1: 0
 *
 *   public int calc();
 *     descriptor: ()I
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=2, locals=4, args_size=1
 *          0: sipush        500  # sipush本身占用1个字节，并接受双字节的参数，所以sipush占用三个字节
 *                                # sipush将操作数500压入操作数栈
 *          3: istore_1           # istore本身占用1个字节且不接受参数
 *                                # istore_1从操作数栈弹出一个元素并将其放在局部变量表的第一个位置
 *          4: sipush        200
 *          7: istore_2
 *          8: bipush        50
 *         10: istore_3
 *         11: iload_1            # iload将局部变量表的值压入操作数栈
 *                                # iload_1将局部变量表第一个位置的值压入操作数栈
 *         12: iload_2
 *         13: iadd               # iadd表示加法操作，从操作数栈中弹出两个元素做加法，并将结果压回操作数栈
 *         14: iload_3
 *         15: idiv               # idiv表示除法，从操作数栈中弹出两个元素，相除后将结果压入操作数栈（用第二顺位元素除以栈顶元素）
 *         16: ireturn            # ireturn将当前函数操作数栈的顶层元素弹出，并将这个元素压入调用者函数的操作数栈中，所有当前函数的操作数栈中的其他元素都会被丢弃
 *                                # 如果是synchronized方法还会执行一个隐含的monitorexit指令退出临界区
 *       LineNumberTable:
 *         line 3: 0
 *         line 4: 4
 *         line 5: 8
 *         line 6: 11
 * }
 * SourceFile: "Calc.java"
 */
public class Calc {
    public int calc(){
        int a = 500;
        int b = 200;
        int c = 50;
        return (a+b)/c;
    }
}
