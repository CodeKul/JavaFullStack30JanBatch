package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Grapes");

        fruits.addFirst("Papaya");
        fruits.addLast("Orange");
        fruits.offerFirst("Strawberry");
        fruits.offerLast("Dragon Fruit");

        fruits.poll();
//        for (String f:fruits){
//            System.out.println(f);
//        }
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
