import java.util.EmptyStackException;
public class MyArrayListStack<T> {
    private MyArrayList<T> arr;
    public MyArrayListStack() {
        arr = new MyArrayList<>();
    }
    /*
    push - adds an element to the top of the stack using the add method of MyArrayList
    @element - added element
    */
    public void push(T element) {
        arr.add(element);
    }
     /*
    pop - removes and returns the top element of the stack using the remove method for MyArrayList
    @throws EmptyStackException if stack is empty.
     */
    public T pop() {
        isEmptyThrowException();
        return (T) arr.remove(arr.size()-1); // removing the last element by minus 1 from size
    }
    /*
    peek - returns the top element of the stack using method of ArrayList get
    @throws EmptyStackException if stack is empty.
     */
    public T peek() {
        isEmptyThrowException();
        return (T) arr.get(arr.size()-1); // getting the last element by minus 1 from size
    }
    /*
    returns true if the stack is empty or false if it is not
     */
    public boolean isEmpty() {
        return arr.size() == 0;
    }
    /*
    returns the number of elements in the stack using the size method for MyArrayList
     */
    public int size() {
        return arr.size();
    }
    /*
    exception by using isEmpty method
     */
    public void isEmptyThrowException() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
    }
}
