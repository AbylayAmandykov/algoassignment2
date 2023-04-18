public class MyArrayList<T> {
    private T[] arr;
    private int size = 0;

    MyArrayList() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }

}
