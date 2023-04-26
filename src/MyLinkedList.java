public class MyLinkedList<E> implements MyList {
    private class Node<E> {
        E value;
        Node<E> previous;
        Node<E> next;

        public Node(E v, Node next, Node previous) {
            this.value = v;
            this.previous = previous;
            this.next = next;
        }
    }
    private Node<E> head;
    private Node<E> tail;
    private int size;
    MyLinkedList() {
        size = 0;
    }
    /*
          function returns the size of LinkedList
          @return int size
    */
    @Override
    public int size() {
        return this.size;
    }
    /*
       contains - checking the element in LinkedList
       @return boolean
    */
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
    /*
           add - adding new object to LinkedList
           @return void
    */
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
    /*
       add - adding new object to LinkedList by index
       @return void
    */
//    public void allALlElements(Object list, int index) {
//        checkIndex(index);
//        if(index == size) {
//            add(list);
//        }
//        else
//    }
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
        /*
           remove - delete, remove the object from LinkedList
           @return boolean
    */
    }
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
    }
    //remove - delete, remove the object from the LinkedList by index
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
    /*
              function clear the LinkedList
              @return void
    */
    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
        size = 0;
    }
    /*
              get - getting the index of an object from LinkedList
              @return object
    */
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
    /*
          indexOf - returns the index of the first entry of the object in LinkedList
          @return int
    */
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
     /*
          lastIndexOf - returns the index of the last entry of the object in LinkedList
          @return int
    */
    @Override
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
    /*
         sort - sorting the LinkedList by bubble sort
         @return int
   */
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
    /*
        checkIndex - checking for exception the index
        @return void
  */
    private void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }
    /*
         toString - returns a string representation of the LinkedList
         @return String
   */
    public String toString() {
        String out = "[";
        Node<E> nextNode = this.head;
        while (nextNode != null) {
            out += nextNode.value + " ";
            nextNode = nextNode.next;
        }
        return out + "]";
    }
}
