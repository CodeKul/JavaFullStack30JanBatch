package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //Stream.of
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        stream.forEach(System.out::println);

        // List Stream
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C1");
        list.add("D2");
        list.add("E3");
        list.add("Aa");
        list.add("Aaa");
        list.add("Bb");

       Stream<String> streamString= list.stream();
        System.out.println("----Stream filter----");
       streamString.filter(s -> s.length() == 1)
               .forEach(System.out::println);

       //count

      Long cnt =  list.stream().filter(s -> s.startsWith("A"))
                .count();
        System.out.println("cnt "+cnt);

        List<String> tags = Arrays.asList("nature","animals","sunset","","",""," ");
        Set<String> filteredTags =  tags.stream().filter(tag -> !tag.isEmpty() && !tag.isBlank())
                .collect(Collectors.toSet());

        System.out.println(filteredTags);

        Set<String> upperTags =   tags.stream().map(s -> s.toUpperCase())
                .filter(s -> !s.isEmpty() && !s.isBlank())
                .collect(Collectors.toSet());
        System.out.println(upperTags);

        List<Integer> numbers = Arrays.asList(5,6,9,2,7,8,4);
    }
}
