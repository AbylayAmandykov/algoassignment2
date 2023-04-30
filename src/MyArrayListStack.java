public class MyArrayListStack<T> {
    MyArrayList arrayList = new MyArrayList();
    private MyArrayList<T> arr;
    public MyArrayListStack() {
        arr = new MyArrayList<>();
    }
    public void push(T element) {
        arrayList.add(element);
    }
    public T pop() {
        return (T) arrayList.remove(arr.size()-1);
    }
    public T peek() {
        return (T) arrayList.remove(arr.size()-1);
    }
    public boolean isEmpty() {
        return arr.size() == 0;
    }
    public int size() {
        return arr.size();
    }


}
