package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Chickoo");
        fruits.add("Papaya");
        fruits.add("Grape");

        System.out.println(fruits);
        System.out.println(fruits.remove());
        System.out.println(fruits.poll());
        System.out.println(fruits.peek());


    }
}
