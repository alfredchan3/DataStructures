package Array;

public class Array {

    private int[] data;
    private int size;

    /**
     * 构造函数，传入数组的容量capacity构造Array
     *
     * @param capacity
     */
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    /**
     * 无参构造函数，默认容量为10
     */
    public Array() {
        this(10);
    }

    /**
     * 获取数组中的元素个数
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 获取数组容量
     *
     * @return 数组容量
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * 数组是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 向所有元素后添加新元素
     *
     * @param e 需要添加的元素
     */
    public void addLast(int e) {

        add(size, e);

//        if (size == data.length) {
//            throw new IllegalArgumentException("AddLast failed.Array is Full.");
//        }
//
//        data[size] = e;
//        size++;
    }

    /**
     * 向所有元素前添加新元素
     *
     * @param e 需要添加的元素
     */
    public void addFirst(int e){
        add(0,e);
    }

    /**
     * 在第index个位置插入一个新元素e
     *
     * @param index 需要插入的下标
     * @param e     需要插入的元素
     */
    public void add(int index, int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("Add failed.Array is Full.");
        }

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed.Require index >=0 and index < size.");
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }

        data[index] = e;
        size++;


    }
}
