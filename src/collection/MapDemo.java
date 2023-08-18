package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(411028,"Kothrud");
        map.put(411021,"Bavdhan");
        map.put(411038,"Warje");
        System.out.println(map);

        System.out.println("Area : "+ map.get(411021));
        map.put(411027,"Kothrud");
        map.put(null,"Bhusari Colony");
        map.put(null,"Left Bhusari Colony");

        map.put(411038,"Karve Nagar");
        System.out.println(map);


    }
}
