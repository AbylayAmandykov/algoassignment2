# Documentation of the second assignment
Here you can find explanations of all functions that I used to solve these problems.

*ArrayList*

**Description:** Increase the buffer of an array

**Explanation:** It creates a new array by adding + 1 to size of the old one and replace it by copying its elements.

**Solution:** 

```
public void increaseBuffer() {
        T[] newArr = (T[]) new Object[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
```

**Description:** Get size of an array

**Explanation:** Retrurning the number of elements of an array.

**Solution:** 

```
@Override
    public int size() {
        return this.size;
    }
```


**Description:** Check the object

**Explanation:** By loop ``for each`` it checks each element in array, if our chosen object in array it returns True. Otherwise, it returns False.

**Solution:** 

```
@Override
    public boolean contains(Object o) {
        for(T element : arr) {
            if(element.equals(o)) return true;
        }
        return false;
    }
```

**Description:** add object to array

**Explanation:** 

**Solution:** 

```
@Override
   public void add(Object item) {
        if(size == arr.length) {
            increaseBuffer(); // increasing the size if its limit
        }
        arr[size++] = (T) item; // item - our object
    }
```

**add** 

**Description:** add object to array by index

**Explanation:** 

**Solution:** 

```
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

```


**Description:** remove object from an array

**Explanation:** 

**Solution:** 

```
@Override
    public boolean remove(Object item) {
        int index = indexOf(item);
        if(index>=0) {
            remove(index);
            return true;
        }
        return false;
    }
```

**Description:**  remove object from an array by index

**Explanation:** 

**Solution:** 

```
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
```

**Description:** clear the array

**Explanation:**  

**Solution:** 

```
public void clear() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
```

**Description:** get the index of object

**Explanation:** 

**Solution:** 

```
@Override
    public Object get(int index) {
        checkIndex(index);
        return arr[index];
    }
```

**Description:** find the first index of object

**Explanation:**  

**Solution:** 

```
@Override
    public int indexOf(Object o) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals((T) o)) {
                return i;
            }
        }
        return -1;
    }
```
**Description:** find the last index of object

**Explanation:** 

**Solution:** 

```
@Override
    public int lastIndexOf(Object o) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].equals((T) o)) {
                return i;
            }
        }
        return -1;
    }
```

**Description:** sort the array

**Explanation:** 

**Solution:** 

```
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
```

**Description:** checking index for exception

**Explanation:** 

**Solution:** 

```
public void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
    }
```

**Description:** toString the array

**Explanation:** 

**Solution:** 


```
@Override
    public String toString() {
        return Arrays.toString(arr);

    }
```
