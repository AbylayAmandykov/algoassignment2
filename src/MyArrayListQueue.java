public class MyArrayListQueue<T> {
    private MyArrayList<T> arr;
    public MyArrayListQueue() {
        arr = new MyArrayList<>();
    }
    public void enqueue(T element) {
        arr.add(element);
    }
    public T dequeue() throws NoSuchFieldException {
        isEmptyThrowException();
        return (T) arr.remove(0);
    }
    public T peek() throws NoSuchFieldException {
        isEmptyThrowException();
        return (T) arr.get(0);
    }
    public boolean isEmpty() {
        return arr.size() == 0;
    }
    public int size() {
        return arr.size();
    }
    private void isEmptyThrowException() throws NoSuchFieldException {
        if (isEmpty()) {
            throw new NoSuchFieldException();
        }
    }
}
