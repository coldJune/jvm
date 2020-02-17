package heap;

public class SimpleHeap {
    private int id;
    public SimpleHeap(int id){
        this.id = id;
    }
    public void show(){
        System.out.println("Id is "+ id);
    }

    /**
     * s1/s2是局部变量存在于Java栈中
     * new SimpleHeap(1)和new SimpleHeap(2)使用在元数据区的SimpleHeap类型在Java堆中创建了两个实例
     * s1/s2分别指向这两个实例
     * @param args
     */
    public static void main(String[] args) {
        SimpleHeap s1 = new SimpleHeap(1);
        SimpleHeap s2 = new SimpleHeap(2);
        s1.show();
        s2.show();
    }
}
