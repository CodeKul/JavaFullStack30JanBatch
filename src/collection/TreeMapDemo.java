package collection;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        map.put(11,51);
        map.put(15,65);
        map.put(7,1);
        map.put(null,44);
        System.out.println(map);
    }
}
