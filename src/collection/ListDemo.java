package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Hyderabad");
        System.out.println(cities);

        System.out.println(cities.contains("Pune"));
        System.out.println(cities.contains("Pune"));
        System.out.println(cities.remove(2));
        System.out.println(cities);
        cities.add(1,"Delhi");
        cities.set(2,"Ahmadabad");
        cities.add("Pune");
        System.out.println(cities);
    }
}
