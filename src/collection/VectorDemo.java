package collection;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> cities = new Vector<>();
        cities.add("Pune");
        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Nagpur");
        cities.add("Mumbai");
        cities.add("Madras");
        cities.add("Solapur");
        cities.add("Goa");
        cities.add("Hyderabad");
        cities.add("Chennai");
        System.out.println("Capacity: "+cities.capacity());
        cities.addElement("Nagpur");
        System.out.println("Before Remove ");
        for (String city:cities){
            System.out.println("city "+city);
        }

        System.out.println("After Remove ");
        for (String city:cities){
            System.out.println("city "+city);
        }

    }
}
