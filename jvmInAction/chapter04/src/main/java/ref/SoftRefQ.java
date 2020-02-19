package ref;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

public class SoftRefQ {
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

    static ReferenceQueue<User> softQueue = null;
    public static class CheckRefQueue extends Thread{
        @Override
        public void run() {
            while (true){
                if(softQueue !=null){
                    UserSoftReference obj = null;
                    try {
                        obj = (UserSoftReference) softQueue.remove();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    if(obj !=null){
                        System.out.println("user id "+obj.uid+" is delete");
                    }
                }
            }
        }
    }

    public static class UserSoftReference extends SoftReference<User>{
        int uid;
        public UserSoftReference(User referent, ReferenceQueue<? super User> q){
            super(referent, q);
            uid = referent.id;
        }
    }

    /**
     * 每一个软引用都可以附带一个引用队列，当对象的可达性状态发生改变时(由可达变为不可达)，软引用对象就会进入引用队列
     * 通过这个引用队列可以跟踪对象的回收情况(≥jdk8依然无法复现该情况，后序查证)
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException{
        Thread t = new CheckRefQueue();
        t.setDaemon(true);
        t.start();

        User u = new User(1,"jun");
        softQueue = new ReferenceQueue<User>();
        UserSoftReference userSoftReference = new UserSoftReference(u, softQueue);
        u = null;

        System.out.println(userSoftReference.get());
        System.gc();
        System.out.println("After GC:");
        System.out.println(userSoftReference.get());

        System.out.println("try to create byte array and GC");
        byte[] b = new byte[1024*925*7];
        System.gc();
        System.out.println(userSoftReference.get());

        Thread.sleep(1000);

    }
}
