import java.util.Arrays;

public class MyArrayList<T> implements MyList {
    private T[] arr;
    private int size = 0;
    // constructor
    MyArrayList() {
        this.arr = (T[]) new Object[0];
        this.size = 0;
    }
     /*
       increaseBuffer - increasing the buffer of an array
       @return void
    */
    public void addAllElements(Object newArr[], int index) {
        checkIndex(index);
        T[] newArray = (T[]) new Object[arr.length +index];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        arr = newArray;
        for(int i = size - 1; i>=index; i--) {
            arr[i+ newArr.length] = arr[i];
        }
        for(int i = 0; i< newArr.length; i++) {
            arr[index + i+ 1] = (T) newArr[i];
        }
        size+= newArr.length;
    }
    public void increaseBuffer() {
        T[] newArr = (T[]) new Object[arr.length +1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
    /*
          function returns the size of an array
          @return int size
    */
    @Override
    public int size() {
        return this.size;
    }
     /*
       contains - checking the element in array
       @return true if we have such element, else false
    */
    @Override
    public boolean contains(Object o) {
        for(T element : arr) {
            if(element.equals(o)) return true;
        }
        return false;
    }
    /*
       add - adding new object to array
       @return void
    */
    @Override
    public void add(Object item) {
        if(size == arr.length) {
            increaseBuffer(); // increasing the size if its limit
        }
        arr[size++] = (T) item; // item - our object
    }
    /*
       add - adding new object to array by index
       @return void
    */
    @Override
    public void add(Object item, int index) { // index - that index where we need to put our new object
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
    /*
           remove - delete, remove the object from an array
           @return boolean
    */
    @Override
    public boolean remove(Object item) {
        int index = indexOf(item);
        if(index>=0) {
            remove(index);
            return true;
        }
        return false;
    }
    /*
           remove - delete, remove the object from an array by index
    */
    @Override
    public Object remove(int index) { // index - our removing index
        checkIndex(index);
        T temp = this.arr[index];
        for (int i = index + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        this.size--;
        return temp; // returning the object
    }
    /*
          function clear the array
          @return void
    */
    public void clear() {
        this.arr = (T[]) new Object[1];
        this.size = 0;
    }
    /*
          get - getting the index of an object
          @return object
    */
    @Override
    public Object get(int index) {
        checkIndex(index);
        return arr[index];
    }
    /*
          indexOf - returns the index of the first entry of the object
          @return int
    */
    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals((T) o)) {
                return i;
            }
        }
        return -1;
    }
    /*
          lastIndexOf - returns the index of the last entry of the object
          @return int
    */
    @Override
    public int lastIndexOf(Object o) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].equals((T) o)) {
                return i;
            }
        }
        return -1;
    }
    /*
          sort - sorting the array by bubble sort
          @return int
    */
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
    /*
          checkIndex - checking for exception the index
          @return void
    */
    public void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
    }
    /*
          toString - returns a string representation of the array
          @return String
    */
    @Override
    public String toString() {
        return Arrays.toString(arr);

    }
}
