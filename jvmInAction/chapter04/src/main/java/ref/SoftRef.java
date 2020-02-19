package ref;

import java.lang.ref.SoftReference;

public class SoftRef {
    public static class User{
        public int id;
        public String name;
        public User(int id, String name){
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "[id=" + id + ",name=" + name + "]";
        }
    }

    /**
     * 按理说软引用在内存不足的情况下会被回收，但此处无法复现该种情况
     * 先按住不表
     * @param args
     */
    public static void main(String[] args){
        User u = new User(1, "jun");
        SoftReference<User> userSoftReference = new SoftReference<User>(u);
        u = null;
        System.out.println(userSoftReference.get());
        System.gc();

        System.out.println("After GC");
        System.out.println(userSoftReference.get());

        byte[] c = new byte[1024*925*7];
        byte[] b = new byte[1024*1010*2];
//        System.gc();
        System.out.println(userSoftReference.get());
    }
}
