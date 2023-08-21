package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Double> map = new LinkedHashMap<>();
        map.put("Amit",86.87);
        map.put("Nayana",76.55);
        map.put("Abhishek",98.32);
        map.put(null,86.32);
        map.put(null,76.32);
        map.put("Amit",96.87);
        System.out.println(map);
        for (Map.Entry entry : map.entrySet()){
            System.out.println("Name : "+entry.getKey()+" Percentage : "+entry.getValue());
        }
    }
}
