import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyArrayList arrayList = new MyArrayList<Integer>();
        arrayList.add(sc.nextInt());
        arrayList.add(sc.nextInt());
        arrayList.add(sc.nextInt());
        System.out.println(arrayList.size());

        //arrayList.sort();

        System.out.println(arrayList);
        arrayList.sort();





    }
}