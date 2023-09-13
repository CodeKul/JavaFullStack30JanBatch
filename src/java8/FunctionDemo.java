package java8;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Integer n = 3;
//        CalculateSquare c = (no) -> no * no;
//        System.out.println(c.getSquare(n));
        Function<Integer,Integer> value = (no) -> no  * no;
        System.out.println(value.apply(5));
    }
}

//interface CalculateSquare{
//    int getSquare(int n);
//}