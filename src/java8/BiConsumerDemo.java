package java8;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer = (n1,n2) -> System.out.println(n1+n2);
        biConsumer.accept(5,6);
    }
}
