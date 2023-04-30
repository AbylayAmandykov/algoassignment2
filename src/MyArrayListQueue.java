import java.util.EmptyStackException;

public class MyArrayListQueue<T> {
    private MyArrayList<T> arr;
    public MyArrayListQueue() {
        arr = new MyArrayList<>();
    }
    public void enqueue(T element) {
        arr.add(element);
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
