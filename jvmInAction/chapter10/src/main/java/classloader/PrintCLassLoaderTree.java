package classloader;

public class PrintCLassLoaderTree {

    /**
     * PrintCLassLoaderTree用户类加载于AppClassLoader(应用类加载器)中，而AppClassLoader的双亲为ExtClassLoader(扩展类加载器)，
     * ExtClassLoader无法再获取启动类加载器
     *
     * String属于Java核心类，会被启动类加载器加载，故获取类加载器时返回null
     * @param args
     */
    public static void main(String[] args) {
        ClassLoader cl = PrintCLassLoaderTree.class.getClassLoader();
        while(cl!=null){
            System.out.println(cl);
            cl=cl.getParent();
        }
        System.out.println("String classloader:"+String.class.getClassLoader());
    }
}
