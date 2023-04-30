import java.util.EmptyStackException;
public class MyLinkedListStack<T> {
    private MyLinkedList<T> top;
    public MyLinkedListStack() {
        top = new MyLinkedList<>();
    }
    public void push(T element) {
        top.add(element);
    }
    public T pop() {
        isEmptyThrowException();
        return (T) top.remove(top.size()-1);
    }
    public T peek() {
        isEmptyThrowException();
        return (T) top.get(top.size()-1);
    }
    public boolean isEmpty() {
        return top.size() == 0;
    }
    public int size() {
        return top.size();
    }
    public void isEmptyThrowException() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
    }
}
