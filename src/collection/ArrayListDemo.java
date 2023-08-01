package collection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nos = new ArrayList<>();
        nos.add(1);
        nos.add(2);
        nos.add(3);
        nos.add(4);
        nos.add(5);
        System.out.println("Nos "+nos);
        System.out.println("Element at 2nd index: "+nos.get(2));
        System.out.println("Remove element at 4th index: "+nos.remove(4));
        System.out.println(nos.size());
    }
}
