import java.util.EmptyStackException;
public class MyLinkedListStack<T> {
    private MyLinkedList<T> top;
    //constructor
    public MyLinkedListStack() {
        top = new MyLinkedList<>();
    }
    /*
    push - adds an element to the top of the stack using the add method of MyArrayList
    @element - added element
    */
    public void push(T element) {
        top.add(element);
    }
    /*
    pop - removes and returns the top element of the stack using the remove method for MyArrayList
    @throws EmptyStackException if stack is empty.
     */
    public T pop() {
        isEmptyThrowException();
        return (T) top.remove(top.size()-1); // removing the last element by minus 1 from size
    }
    /*
    peek - returns the top element of the stack using method of ArrayList get
    @throws EmptyStackException if stack is empty.
     */
    public T peek() {
        isEmptyThrowException();
        return (T) top.get(top.size()-1); // getting the last element by minus 1 from size
    }
    /*
    returns true if the stack is empty or false if it is not
     */
    public boolean isEmpty() {
        return top.size() == 0;
    }
    /*
    returns the number of elements in the stack using the size method for MyArrayList
   */
    public int size() {
        return top.size();
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
