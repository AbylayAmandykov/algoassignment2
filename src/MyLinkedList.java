public class MyLinkedList<E> implements MyList {
    private MyArrayList arrayList = new MyArrayList<E>();
    private class Node<E> {
        E val;
        Node previous;
        Node next;

        public Node(E v) {
            val = v;
            previous = null;
            next = null;
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

    }

    @Override
    public void add(Object item, int index) {

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
}
