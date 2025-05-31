// Write a Java program to copy one array list into another.

import java.util.ArrayList;

public class ArrayListCopyExample {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Mango");

        ArrayList<String> list2 = new ArrayList<>();

        list2.addAll(list1);

        System.out.println("Original list: " + list1);
        System.out.println("Copied list: " + list2);
    }
}
