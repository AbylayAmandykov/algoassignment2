public class MyArrayListQueue<T> {
    private MyArrayList<T> arr;
    public MyArrayListQueue() {
        arr = new MyArrayList<>();
    }
    public void enqueue(T element) {
        arr.add(element);
    }
}
