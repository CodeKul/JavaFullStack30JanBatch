package java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEach1Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("India");
        list.add("USA");
        list.add("UK");
        list.add("Shri-lanka");
//        Iterator iterable = list.iterator();
//        while (iterable.hasNext()){
//            System.out.println(iterable.next());
//        }

        list.forEach(str -> System.out.println(str));

        list.forEach(System.out::println);
    }
}
