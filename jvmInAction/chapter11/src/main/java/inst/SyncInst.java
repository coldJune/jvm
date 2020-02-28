package inst;

//Classfile /Users/dengxiaojun/Documents/GitHub/jvm/jvmInAction/chapter11/src/main/java/inst/SyncInst.class
//  Last modified 2020年2月28日; size 456 bytes
//  MD5 checksum eadbfac1d412761ed38d30ef19c820b7
//  Compiled from "SyncInst.java"
//public class inst.SyncInst
//  minor version: 0
//  major version: 55
//  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
//  this_class: #3                          // inst/SyncInst
//  super_class: #4                         // java/lang/Object
//  interfaces: 0, fields: 1, methods: 3, attributes: 1
//Constant pool:
//   #1 = Methodref          #4.#17         // java/lang/Object."<init>":()V
//   #2 = Fieldref           #3.#18         // inst/SyncInst.i:I
//   #3 = Class              #19            // inst/SyncInst
//   #4 = Class              #20            // java/lang/Object
//   #5 = Utf8               i
//   #6 = Utf8               I
//   #7 = Utf8               <init>
//   #8 = Utf8               ()V
//   #9 = Utf8               Code
//  #10 = Utf8               LineNumberTable
//  #11 = Utf8               add1
//  #12 = Utf8               add2
//  #13 = Utf8               StackMapTable
//  #14 = Class              #21            // java/lang/Throwable
//  #15 = Utf8               SourceFile
//  #16 = Utf8               SyncInst.java
//  #17 = NameAndType        #7:#8          // "<init>":()V
//  #18 = NameAndType        #5:#6          // i:I
//  #19 = Utf8               inst/SyncInst
//  #20 = Utf8               java/lang/Object
//  #21 = Utf8               java/lang/Throwable
//{
//  public inst.SyncInst();
//    descriptor: ()V
//    flags: (0x0001) ACC_PUBLIC
//    Code:
//      stack=2, locals=1, args_size=1
//         0: aload_0
//         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//         4: aload_0
//         5: iconst_0
//         6: putfield      #2                  // Field i:I
//         9: return
//      LineNumberTable:
//        line 3: 0
//        line 4: 4
//
//  public synchronized void add1();
//    descriptor: ()V
//    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
//    Code:
//      stack=3, locals=1, args_size=1
//         0: aload_0
//         1: dup
//         2: getfield      #2                  // Field i:I
//         5: iconst_1
//         6: iadd
//         7: putfield      #2                  // Field i:I
//        10: return
//      LineNumberTable:
//        line 6: 0
//        line 7: 10
//
//  public void add2();
//    descriptor: ()V
//    flags: (0x0001) ACC_PUBLIC
//    Code:
//      stack=3, locals=3, args_size=1
//         0: aload_0
//         1: dup
//         2: astore_1
//         3: monitorenter
//         4: aload_0
//         5: dup
//         6: getfield      #2                  // Field i:I
//         9: iconst_1
//        10: iadd
//        11: putfield      #2                  // Field i:I
//        14: aload_1
//        15: monitorexit
//        16: goto          24
//        19: astore_2
//        20: aload_1
//        21: monitorexit
//        22: aload_2
//        23: athrow
//        24: return
//      Exception table:
//         from    to  target type
//             4    16    19   any
//            19    22    19   any
//      LineNumberTable:
//        line 10: 0
//        line 11: 4
//        line 12: 14
//        line 13: 24
//      StackMapTable: number_of_entries = 2
//        frame_type = 255 /* full_frame */
//          offset_delta = 19
//          locals = [ class inst/SyncInst, class java/lang/Object ]
//          stack = [ class java/lang/Throwable ]
//        frame_type = 250 /* chop */
//          offset_delta = 4
//}
//SourceFile: "SyncInst.java"
public class SyncInst {
    private int i=0;

    /**
     * public synchronized void add1();
     *     descriptor: ()V
     *     flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
     *     Code:
     *       stack=3, locals=1, args_size=1
     *          0: aload_0
     *          1: dup
     *          2: getfield      #2                  // Field i:I
     *          5: iconst_1
     *          6: iadd
     *          7: putfield      #2                  // Field i:I
     *         10: return
     *       LineNumberTable:
     *         line 6: 0
     *         line 7: 10
     *
     *  对于同步方法而言，虚拟机通过方法的访问标示符判断，会自动在方法调用前加锁，在同步方法执行完成之后，不管方法正常结束还是异常抛出
     *  虚拟机都会释放这个锁
     */
    public synchronized void add1(){
        i++;
    }

    // public void add2();
    //    descriptor: ()V
    //    flags: (0x0001) ACC_PUBLIC
    //    Code:
    //      stack=3, locals=3, args_size=1
    //         0: aload_0
    //         1: dup
    //         2: astore_1
    //         3: monitorenter          # 获取锁
    //         4: aload_0
    //         5: dup
    //         6: getfield      #2                  // Field i:I
    //         9: iconst_1
    //        10: iadd
    //        11: putfield      #2                  // Field i:I
    //        14: aload_1
    //        15: monitorexit           # 释放锁
    //        16: goto          24
    //        19: astore_2
    //        20: aload_1
    //        21: monitorexit           # 释放锁
    //        22: aload_2
    //        23: athrow
    //        24: return
    //      Exception table:
    //         from    to  target type
    //             4    16    19   any
    //            19    22    19   any
    //      LineNumberTable:
    //        line 10: 0
    //        line 11: 4
    //        line 12: 14
    //        line 13: 24
    //      StackMapTable: number_of_entries = 2
    //        frame_type = 255 /* full_frame */
    //          offset_delta = 19
    //          locals = [ class inst/SyncInst, class java/lang/Object ]
    //          stack = [ class java/lang/Throwable ]
    //        frame_type = 250 /* chop */
    //          offset_delta = 4
    // 会有两个monitorexit是因为生成的字节码自动插入了一段异常处理代码
    //  从异常表中可以看出在4~16行任意地方遇到异常都会进入19行进行处理
    public void add2(){
        synchronized(this){
            i++;
        }
    }
}
