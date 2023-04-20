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
    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

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
    }
    @Override
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    @Override
    public Object get(int index) {
        return null;
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
    private void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }
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
