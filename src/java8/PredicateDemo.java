package java8;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = n -> n < 10;
        System.out.println(predicate.test(50));
    }
}
