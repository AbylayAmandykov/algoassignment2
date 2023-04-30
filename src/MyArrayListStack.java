import java.util.EmptyStackException;

public class MyArrayListStack<T> {
    private MyArrayList<T> arr;
    public MyArrayListStack() {
        arr = new MyArrayList<>();
    }
    public void push(T element) {
        arr.add(element);
    }
    public T pop() {
        isEmptyThrowException();
        return (T) arr.remove(arr.size()-1);
    }
    public T peek() {
        isEmptyThrowException();
        return (T) arr.get(arr.size()-1);
    }
    public boolean isEmpty() {
        return arr.size() == 0;
    }
    public int size() {
        return arr.size();
    }
    public void isEmptyThrowException() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
    }
}
