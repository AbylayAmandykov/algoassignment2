import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyArrayListStack<Integer> arrayListStack = new MyArrayListStack();
        System.out.println("Stack for ArrayList");
        System.out.println("Is empty? " + arrayListStack.isEmpty());
        arrayListStack.push(5);
        arrayListStack.push(3);
        arrayListStack.push(19);
        System.out.println("Is empty? " + arrayListStack.isEmpty());
        System.out.println("Size: " + arrayListStack.size());
        System.out.println("Removed element: " + arrayListStack.pop());
        System.out.println("Top element: " + arrayListStack.peek());

    }
}