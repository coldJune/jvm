package localvar;

public class LocalVarGc {
    /**
     * 申请空间后立即回收，因为byte数组依然被变量a引入所以无法回收
     * [0.005s][warning][gc] -XX:+PrintGC is deprecated. Will use -Xlog:gc instead.
     * [0.029s][info   ][gc] Using G1
     * [0.363s][info   ][gc] Periodic GC disabled
     * [B@9f70c54
     * [3.281s][info   ][gc] GC(0) Pause Full (System.gc()) 14M->7M(37M) 167.079ms
     */
    public  void localvarGc1(){
        byte[] a = new byte[6*1024*1024];
        System.out.println(a);
        System.gc();
    }

    /**
     * 垃圾回收前将a置为null，使byte数组失去强引用，故可以回收
     * [0.004s][warning][gc] -XX:+PrintGC is deprecated. Will use -Xlog:gc instead.
     * [0.026s][info   ][gc] Using G1
     * [0.388s][info   ][gc] Periodic GC disabled
     * [B@9f70c54
     * [2.967s][info   ][gc] GC(0) Pause Full (System.gc()) 14M->0M(14M) 202.355ms
     */
    public  void localvarGc2(){
        byte[] a = new byte[6*1024*1024];
        System.out.println(a);
        a=null;
        System.gc();
    }

    /**
     * 在进行垃圾回收前先使局部变量a失效
     * 虽然变量a离开了作用域但是变量a依然在局部变量表中未被覆盖
     * 并且指向byte数组，故无法回收
     * [0.004s][warning][gc] -XX:+PrintGC is deprecated. Will use -Xlog:gc instead.
     * [0.023s][info   ][gc] Using G1
     * [0.391s][info   ][gc] Periodic GC disabled
     * [B@9f70c54
     * [2.762s][info   ][gc] GC(0) Pause Full (System.gc()) 14M->7M(34M) 176.424ms
     */
    public  void localvarGc3(){
        {
            byte[] a = new byte[6*1024*1024];
            System.out.println(a);
        }
        System.gc();
    }

    /**
     * 使用变量b覆盖了a，byte数组失去引用，故可以回收
     * [0.006s][warning][gc] -XX:+PrintGC is deprecated. Will use -Xlog:gc instead.
     * [0.029s][info   ][gc] Using G1
     * [0.400s][info   ][gc] Periodic GC disabled
     * [B@61dc03ce
     * 10
     * [3.405s][info   ][gc] GC(0) Pause Full (System.gc()) 14M->0M(10M) 224.192ms
     */
    public  void localvarGc4(){
        {
            byte[] a = new byte[6*1024*1024];
            System.out.println(a);
        }
        int c = 10;
        System.out.println(c);
        System.gc();
    }

    /**
     * 在localvarGc1内部虽然不能回收，但是在localvarGc1返回后栈帧销毁
     * 则byte数组自然也失去引用，所以在localvarGc5被回收
     * [0.004s][warning][gc] -XX:+PrintGC is deprecated. Will use -Xlog:gc instead.
     * [0.029s][info   ][gc] Using G1
     * [0.375s][info   ][gc] Periodic GC disabled
     * [B@9f70c54
     * [2.706s][info   ][gc] GC(0) Pause Full (System.gc()) 14M->7M(37M) 172.887ms
     * [2.818s][info   ][gc] GC(1) Pause Full (System.gc()) 8M->0M(8M) 108.880ms
     */
    public  void localvarGc5(){
        localvarGc1();
        System.gc();
    }

    public static void main(String[] args) {
        LocalVarGc ins = new LocalVarGc();
        ins.localvarGc5();
    }
}
