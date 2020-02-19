package ref;

import java.lang.ref.WeakReference;

public class WeakRef {
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
     * 弱引用是一种比软引用更弱的引用，在系统GC时只要发现弱引用
     * 无论系统堆空间使用情况如何，都会将对象进行回收
     *
     * 由于垃圾回收器的线程通常优先级很低，因此并不一定很快发现持有弱引用的对象
     * 在这种情况下弱引用对象可能存在较长时间
     * 一旦一个弱引用被垃圾回收器回收，便会加入到一个注册的引用队列
     * @param args
     */
    public static void main(String[] args) {
        User user = new User(1,"jun");
        WeakReference<User> userWeakReference = new WeakReference<User>(user);
        user = null;
        System.out.println(userWeakReference.get());
        System.gc();

        System.out.println("After GC");
        System.out.println(userWeakReference.get());
    }
}
