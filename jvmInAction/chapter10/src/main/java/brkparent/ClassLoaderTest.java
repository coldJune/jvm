package brkparent;

public class ClassLoaderTest {
    /**
     * 通过继承ClassLoader修改loadClass的行为从而改变默认的双亲委托模式
     * 重写的方法中首先会在"~/Downloads"查找brkparent.DemoA类，如果没找到，才使用父类加载器
     * 而双亲委托模式是先用父类加载器加载，加载不了再使用本加载器加载
     * @param args
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException{
        OrderClassLoader myLoader = new OrderClassLoader("~/Downloads");
        Class clz = myLoader.loadClass("brkparent.DemoA");
        System.out.println(clz.getClassLoader());

        System.out.println("----Class Loader Tree---");
        ClassLoader cl = clz.getClassLoader();
        while (cl !=null){
            System.out.println(cl);
            cl = cl.getParent();
        }
    }
}
