package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> integers = new LinkedHashSet<>();
        integers.add(50);
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(30);
        integers.add(40);
        System.out.println(integers);
    }
}
