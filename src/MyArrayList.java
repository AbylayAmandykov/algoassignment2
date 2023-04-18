public class MyArrayList<T> implements MyList {
    private T[] arr;
    private int size = 0;

    MyArrayList() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }

    public void increaseBuffer() {
        T[] newArr = (T[]) new Object[arr.length + 5];
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
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
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
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }

    public void delete(int index) {
        checkIndex(index);
        for (int i = index + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
    }
    public void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

    }
}
