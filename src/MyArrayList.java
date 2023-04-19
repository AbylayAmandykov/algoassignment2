import java.util.Arrays;

public class MyArrayList<T> implements MyList {
    private T[] arr;
    private int size = 0;

    MyArrayList() {
        this.arr = (T[]) new Object[0];
        this.size = 0;
    }

    public void increaseBuffer() {
        T[] newArr = (T[]) new Object[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean contains(Object o) {
        for(T element : arr) {
            if(element.equals(o)) return true;
        }
        return false;
    }

    @Override
    public void add(Object item) {
        if(size == arr.length) {
            increaseBuffer();
        }
        arr[size++] = (T) item;
    }
    @Override
    public void add(Object item, int index) {
        checkIndex(index);
        if(size == arr.length) {
            increaseBuffer();
        }
        for(int i = size - 1; i>=index; i--) {
            arr[i+1] = arr[i];
        }
        arr[index] = (T) item;
        size++;
    }

    @Override
    public boolean remove(Object item) {
        int index = indexOf(item);
        if(index>=0) {
            remove(index);
            return true;
        }
        return false;
    }

    @Override
    public Object remove(int index) {
        checkIndex(index);
        T temp = this.arr[index];
        for (int i = index + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        this.size--;
        return temp;
    }

    public void clear() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        return arr[index];
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals((T) o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].equals((T) o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sort() {
        for(int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if ((int) arr[j] < (int) arr[i]) {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
    }
    @Override
    public String toString() {
        return Arrays.toString(arr);

    }
}
