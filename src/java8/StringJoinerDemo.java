package java8;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",");
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Orange");
        joiner.add("Grapes");
        System.out.println(joiner);
    }
}
