# Documentation of the second assignment
Here you can find explanations of all functions that I used to solve these problems.

***ArrayList***

**Description:** Increase the buffer of an array.

**Explanation:** It creates a new array by adding + 1 to size of the old one and replace it by copying its elements.

**Solution:** 

```java
public void increaseBuffer() {
        T[] newArr = (T[]) new Object[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
```

**Description:** Get size of an array.

**Explanation:** Retrurning the number of elements of an array.

**Solution:** 

```java
@Override
    public int size() {
        return this.size;
    }
```


**Description:** Check the object.

**Explanation:** By loop ``for each`` it checks each element in array, if our chosen object in array it returns True. Otherwise, it returns False.

**Solution:** 

```java
@Override
    public boolean contains(Object o) {
        for(T element : arr) {
            if(element.equals(o)) return true;
        }
        return false;
    }
```

**Description:** Add object to array.

**Explanation:** Adding the new element to the end of an array. If it is limit we call the our function increaseBuffer.

**Solution:** 

```java
@Override
   public void add(Object item) {
        if(size == arr.length) {
            increaseBuffer(); // increasing the size if its limit
        }
        arr[size++] = (T) item; // item - our object
    }
```

**Description:** Add object to array by index.

**Explanation:** Adding the new element to the chosen index of an array. If it is limit we call the our function increaseBuffer.

**Solution:** 

```java
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


**Description:** Remove object from an array.

**Explanation:** Remove chosen object from an array.

**Solution:** 

```java
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

**Description:**  Remove object from an array by index.

**Explanation:** It removes the object by index and all elements in the array moves to the left to one space.

**Solution:** 

```java
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

**Description:** Clear the array.

**Explanation:** It clears the size of an array, deletes all elements. And create new array with the size 1.

**Solution:** 

```java
public void clear() {
        this.arr = (T[]) new Object[1];
        this.size = 0;
    }
```

**Description:** Get the index of object.

**Explanation:** It returns the index of chosen object.

**Solution:** 

```java
@Override
    public Object get(int index) {
        checkIndex(index);
        return arr[index];
    }
```

**Description:** Find the first index of object.

**Explanation:** It returns the index of the first occurrence of the chosen object in the array. Otherwise, it returns -1.

**Solution:** 

```java
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
**Description:** Find the last index of object.

**Explanation:** It returns the index of the last occurrence of the chosen object in the array. Otherwise, it returns -1.

**Solution:** 

```java
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

**Description:** Sort the array.

**Explanation:** It sorts the elements of array by ascending order by bubble sort.

**Solution:** 

```java
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

**Description:** Checking index for exception.

**Explanation:** It checks if the index is valid for the array. If the index is less than 0 or greater than or equal to the size of the array, it throws an IndexOutOfBoundsException.

**Solution:** 

```java
public void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
    }
```

**Description:** toString the array.

**Explanation:** It returns a string representation of the array.

**Solution:** 


```java
@Override
    public String toString() {
        return Arrays.toString(arr);

    }
```

***LinkedList***

**Description:** Get size of a LinkedList.

**Explanation:** Retrurning the number of elements of list.

**Solution:** 

```java
@Override
    public int size() {
        return this.size;
    }
```


**Description:** Check the object in LinkedList.

**Explanation:** It checks each element in array, if our chosen object in list it returns True. Otherwise, it returns False.

**Solution:** 

```java
@Override
    public boolean contains(Object o) {
        Node<E> current = head;
        while (current != null) {
            if (current.value.equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
```

**Description:** Add object to the LinkedList.

**Explanation:** Adding the new element to the end of the list. 

**Solution:** 

```java
@Override
    public void add(Object item) {
        Node newNode = new Node(item, null, tail);
        if (tail != null) {
            tail.next = newNode;
        } else {
            head = newNode;
        }
        tail = newNode;
        size++;
    }
```

**Description:** Add object to the LinkedList by index.

**Explanation:** Adding the new element to the chosen index of list. 

**Solution:** 

```java
@Override
    public void add(Object item, int index) {
        checkIndex(index);
        if (index == size) {
            add(item);
        } else {
            Node currentNode;
            if (index < size / 2) {
                currentNode = head;
                for (int i = 0; i < index; i++) {
                    currentNode = currentNode.next;
                }
            } else {
                currentNode = tail;
                for (int i = size - 1; i > index; i--) {
                    currentNode = currentNode.previous;
                }
            }
            Node previousNode = currentNode.previous;
            Node newNode = new Node(item, currentNode, previousNode);
            currentNode.previous = newNode;
            if (previousNode != null) {
                previousNode.next = newNode;
            } else {
                head = newNode;
            }
            size++;
        }
```


**Description:** Remove object from the LinkedList.

**Explanation:** Remove chosen object from the list. If there is a such element it returns True, otherwise False.

**Solution:** 

```java
@Override
    public boolean remove(Object item) {
        Node currentNode = head;
        while (currentNode != null && !currentNode.value.equals(item)) {
            currentNode = currentNode.next;
        }
        if (currentNode != null) {
            if (currentNode == head) {
                head = currentNode.next;
                if (head != null) {
                    head.previous = null;
                }
            } else if (currentNode == tail) {
                tail = currentNode.previous;
                if (tail != null) {
                    tail.next = null;
                }
            } else {
                currentNode.previous.next = currentNode.next;
                currentNode.next.previous = currentNode.previous;
            }
            size--;
            return true;
        }
        return false;
```

**Description:**  Remove object from the LinkedList by index.

**Explanation:** It removes the object by index from the list.

**Solution:** 

```java
@Override
    public Object remove(int index) {
        checkIndex(index);
        Node curNode;
        if (index < size / 2) {
            curNode = head;
            for (int i = 0; i < index; i++) {
                curNode = curNode.next;
            }
        } else {
            curNode = tail;
            for (int i = size - 1; i > index; i--) {
                curNode = curNode.previous;
            }
        }
        Node prevNode = curNode.previous;
        Node nextNode = curNode.next;
        if (prevNode != null) {
            prevNode.next = nextNode;
        } else {
            head = nextNode;
        }
        if (nextNode != null) {
            nextNode.previous = prevNode;
        } else {
            tail = prevNode;
        }
        size--;
        return curNode.value; // returning object
    }
```

**Description:** Clear the LinkedList.

**Explanation:** It clears the size of the list, deletes all elements. 

**Solution:** 

```java
@Override
public void clear() {
   this.head = null;
   this.tail = null;
   size = 0;
}
```

**Description:** Get the index of object.

**Explanation:** It returns the index of chosen object.

**Solution:** 

```java
@Override
public Object get(int index) {
    checkIndex(index);
     Node currentNode;
        if (index < size / 2) {
            currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        } else {
            currentNode = tail;
            for (int i = size - 1; i > index; i--) {
                currentNode = currentNode.previous;
            }
        }
        return currentNode.value;
    }
```

**Description:** Find the first index of object.

**Explanation:** It returns the index of the first occurrence of the chosen object in the list. Otherwise, it returns -1.

**Solution:** 

```java
@Override
public int indexOf(Object o) {
        Node curNode = head;
        int index = 0;
        while (curNode != null) {
            if (curNode.value.equals(o)) {
                return index;
            }
            curNode = curNode.next;
            index++;
        }
        return -1;
    }
```
**Description:** Find the last index of object.

**Explanation:** It returns the index of the last occurrence of the chosen object in the list. Otherwise, it returns -1.

**Solution:** 

```java
public int lastIndexOf(Object o) {
   Node curNode = tail;
   int index = size - 1;
   while (curNode != null) {
     if (curNode.value.equals(o)) {
       return index;
            }
   curNode = curNode.previous;
            index--;
        }
        return -1;
    }
```

**Description:** Sort the LinkedList.

**Explanation:** It sorts the elements of list by ascending order with bubble sort.

**Solution:** 

```java
@Override
public void sort() {
        if (size < 2) { // base case
            return;
        }
        Node current = head;
        while (current != null) {
            Node min = current;
            Node innerCurrent = current.next;
            while (innerCurrent != null) {
                if (((Comparable) innerCurrent.value).compareTo(min.value) < 0) {
                    min = innerCurrent;
                }
                innerCurrent = innerCurrent.next;
            }

            if (min != current) {
                Object temp = current.value;
                current.value = min.value;
                min.value = temp;
            }
            current = current.next;
        }
    }
```

**Description:** Checking index for exception.

**Explanation:** It checks if the index is valid for the LinkedList. If the index is less than 0 or greater than or equal to the size of the list, it throws an IndexOutOfBoundsException.

**Solution:** 

```java
public void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
    }
```

**Description:** toString the array.

**Explanation:** It returns a string representation of the LinkedList.

**Solution:** 


```java
public String toString() {
        String out = "[";
        Node<E> nextNode = this.head;
        while (nextNode != null) {
            out += nextNode.value + " ";
            nextNode = nextNode.next;
        }
        return out + "]";
    }
```

