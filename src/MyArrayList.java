public class MyArrayList<T> {
    private T[] arr;
    private int size = 0;

    MyArrayList() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
    public void increaseBuffer() {
        T[] newArr = (T[]) new Object[arr.length+5];
        for(int i = 0; i< arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

}
