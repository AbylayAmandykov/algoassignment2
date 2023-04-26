import java.util.LinkedList;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("Welcome to the world of Lists! \n" +
                           "Please, let me show you my all methods for lists! \n" +
                           "If you are ready enter 1 (for the ArrayList) or 2 (for the LinkedList) to start the code! To exit 0");
        System.out.println(arrayList);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        Object arr[] = {1,2};
        arrayList.add(3);
        arrayList.addAllElements(arr, 2);
        System.out.println(arrayList);
//        int choose;
//        do {
//            choose = sc.nextInt();
//            if (choose == 1) {
//                System.out.println("Current size of an array: " + arrayList.size());
//                arrayList.add(5);
//                arrayList.add(3);
//                arrayList.add(8, 0);
//                arrayList.add(4);
//                arrayList.add(2);
//                arrayList.add(3);
//                System.out.println("Current array: " + arrayList);
//                System.out.println("Current size of an array: " + arrayList.size());
//                System.out.println("Checking for the element 4 and 9 in our array: " + arrayList.contains(4) + " " + arrayList.contains(9));
//                System.out.println("Getting the 4 by index: " + arrayList.get(3));
//                System.out.println("Getting the the first occurrence of 3: " + arrayList.indexOf(3));
//                System.out.println("Getting the the last occurrence of 3: " + arrayList.lastIndexOf(3));
//                arrayList.sort();
//                System.out.println("Sorted array: " + arrayList);
//                arrayList.remove(0);
//                System.out.println("Remove the 3 if it exists " + arrayList.remove((Object) 3));
//                System.out.println(arrayList);
//                arrayList.clear();
//                System.out.println("Our ArrayList after the clearing " + arrayList);
//            }
//            if (choose == 2) {
//                System.out.println("Current size of LinkedList: " + linkedList.size());
//                linkedList.add(5);
//                linkedList.add(3);
//                linkedList.add(0, 8);
//                linkedList.add(4);
//                linkedList.add(2);
//                linkedList.add(3);
//                System.out.println("Current list: " + linkedList);
//                System.out.println("Current size of the list: " + linkedList.size());
//                System.out.println("Checking for the element 4 and 9 in our list: " + linkedList.contains(4) + " " + linkedList.contains(9));
//                System.out.println("Getting the 4 by index: " + linkedList.get(3));
//                System.out.println("Getting the the first occurrence of 3: " + linkedList.indexOf(3));
//                System.out.println("Getting the the last occurrence of 3: " + linkedList.lastIndexOf(3));
//                linkedList.sort(null);
//                System.out.println("Sorted list: " + linkedList);
//                linkedList.remove(0);
//                System.out.println("Remove the 3 if it exists " + linkedList.remove((Object) 3));
//                System.out.println(linkedList);
//                linkedList.clear();
//                System.out.println("Our LinkedList after the clearing " + linkedList);
//            }
//        }
//        while(choose!=0);
   }
}