package java8;

import java.util.*;

public class ForEach1Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("India");
        list.add("USA");
        list.add("UK");
        list.add("Shri-lanka");
        list.forEach(str -> System.out.println(str));
        list.forEach(System.out::println);

        Map<String,Double> students = new HashMap<>();
        students.put("Rupali",98.3);
        students.put("Amruta",97.3);
        students.put("Sneha",91.3);
        students.put("Anuja",95.3);

        students.forEach((x,y) -> System.out.println(x+" "+y));
    }
}
