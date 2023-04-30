public class MyArrayListQueue<T> {
    private MyArrayList<T> arr;
    public MyArrayListQueue() {
        arr = new MyArrayList<>();
    }
    /*
    adds an element to the back of the queue using the add method for MyArrayList
    @element - added element
    */
    public void enqueue(T element) {
        arr.add(element);
    }
    /*
    removes and returns the front element of the queue using the remove method
    @throws NoSuchFieldException if queue is empty
    */
    public T dequeue() throws NoSuchFieldException {
        isEmptyThrowException();
        return (T) arr.remove(0); // returning the removed element
    }
    /*
    returns the front element of the queue without removing it using the get method
    @throws NoSuchFieldException if queue is empty
    */
    public T peek() throws NoSuchFieldException {
        isEmptyThrowException();
        return (T) arr.get(0); // getting the first element
    }
    /*
    returns true if the queue is empty or false if it is not using the isEmpty method
    */
    public boolean isEmpty() {
        return arr.size() == 0;
    }
    /*
    returns the number of elements in the queue using the size method
    */
    public int size() {
        return arr.size();
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
