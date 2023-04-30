public class MyLinkedListQueue<T> {
    private MyLinkedList<T> front;
    public MyLinkedListQueue() {
        front = new MyLinkedList<>();
    }
    /*
    adds an element to the back of the queue using the add method for MyLinkedList
    @element - added element
    */
    public void enqueue(T element) {
        front.add(element);
    }
    /*
    removes and returns the front element of the queue using the remove method
    @throws NoSuchFieldException if queue is empty
    */
    public T dequeue() throws NoSuchFieldException {
        isEmptyThrowException();
        return (T) front.remove(0); // returning the removed element
    }
    /*
    returns the front element of the queue without removing it using the get method
    @throws NoSuchFieldException if queue is empty
    */
    public T peek() throws NoSuchFieldException {
        isEmptyThrowException();
        return (T) front.get(0);
    }
    /*
    returns true if the queue is empty or false if it is not using the isEmpty method
    */
    public boolean isEmpty() {
        return front.size() == 0;
    }
    /*
    returns the number of elements in the queue using the size method
    */
    public int size() {
        return front.size();
    }
    /*
    exception by using isEmpty method
    */
    private void isEmptyThrowException() throws NoSuchFieldException {
        if (isEmpty()) {
            throw new NoSuchFieldException();
        }
    }
}
