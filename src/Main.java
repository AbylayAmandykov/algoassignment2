import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyArrayListStack<Integer> arrayListStack = new MyArrayListStack();
        System.out.println("Stack for ArrayList:");
        System.out.println("Is empty? " + arrayListStack.isEmpty());
        arrayListStack.push(5);
        arrayListStack.push(3);
        arrayListStack.push(19);
        System.out.println("Is empty? " + arrayListStack.isEmpty());
        System.out.println("Size: " + arrayListStack.size());
        System.out.println("Removed element: " + arrayListStack.pop());
        System.out.println("Top element: " + arrayListStack.peek());
        System.out.println();
        MyLinkedListStack<Integer> linkedListStack = new MyLinkedListStack();
        System.out.println("Stack for LinkedList:");
        System.out.println("Is empty? " + linkedListStack.isEmpty());
        linkedListStack.push(7);
        linkedListStack.push(6);
        linkedListStack.push(14);
        System.out.println("Is empty? " + linkedListStack.isEmpty());
        System.out.println("Size: " + linkedListStack.size());
        System.out.println("Removed element: " + linkedListStack.pop());
        System.out.println("Top element: " + linkedListStack.peek());

    }
}