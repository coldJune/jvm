public class SimpleArgs {
    /**
     * Runtime.getRuntime().maxMemory()可以获得最大内存
     * @param args
     */
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            System.out.println("arg["+(i+1)+"]:"+args[i]);
        }
        System.out.println("-Xmx"+Runtime.getRuntime().maxMemory()/1024/1024+"M");
    }
}
