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
    public T getElement(int index) {
        checkIndex(index);
        return arr[index];
    }
    public int getSize() {
        return size;
    }
    public void clear() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
    public void delete(int index) {
        checkIndex(index);
        for(int i = index + 1; i<size; i++) {
            arr[i-1] = arr[i];
        }
        size--;
    }
    public void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }


}
