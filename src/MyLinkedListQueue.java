public class MyLinkedListQueue<T> {
    private MyLinkedList<T> front;
    public MyLinkedListQueue() {
        front = new MyLinkedList<>();
    }
    public void enqueue(T element) {
        front.add(element);
    }
    public T dequeue() throws NoSuchFieldException {
        isEmptyThrowException();
        return (T) front.remove(0);
    }
    public T peek() throws NoSuchFieldException {
        isEmptyThrowException();
        return (T) front.get(0);
    }
    public boolean isEmpty() {
        return front.size() == 0;
    }
    public int size() {
        return front.size();
    }
    private void isEmptyThrowException() throws NoSuchFieldException {
        if (isEmpty()) {
            throw new NoSuchFieldException();
        }
    }
}
