package collection;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        SortedSet<Integer> integers = new TreeSet<>();
        integers.add(50);
        integers.add(40);
        integers.add(58);
        integers.add(5);
        integers.add(null);
        System.out.println(integers);

    }
}
