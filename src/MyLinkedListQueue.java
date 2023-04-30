public class MyLinkedListQueue<T> {
    private MyLinkedList<T> front;
    public MyLinkedListQueue() {
        front = new MyLinkedList<>();
    }
    public void enqueue(T element) {
        front.add(element);
    }
    public boolean isEmpty() {
        return front.size() == 0;
    }
}
