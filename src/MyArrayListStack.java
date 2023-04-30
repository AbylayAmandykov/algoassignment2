public class MyArrayListStack<T> {
    MyArrayList arrayList = new MyArrayList();
    private MyArrayList<T> arr;
    public MyArrayListStack() {
        arr = new MyArrayList<>();
    }
    public void push(T element) {
        arrayList.add(element);
    }
    public boolean isEmpty() {
        return arr.size() == 0;
    }

}
