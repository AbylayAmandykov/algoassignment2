import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyArrayList arrayList = new MyArrayList<Integer>();
        MyLinkedList linkedList = new MyLinkedList<Integer>();
//        arrayList.add(sc.nextInt());
//        arrayList.add(sc.nextInt());
//        arrayList.add(sc.nextInt());
//        System.out.println(arrayList.size());
//
//        //arrayList.sort();
//
//        System.out.println(arrayList);
//        arrayList.sort();

        linkedList.add(sc.nextInt());
        linkedList.add(sc.nextInt());
        linkedList.add(sc.nextInt());
        linkedList.add(3, 2);
        linkedList.add(sc.nextInt());
         //linkedList.add(sc.nextInt(), sc.nextInt());
        System.out.println(linkedList.size());
        System.out.println(linkedList);





    }
}