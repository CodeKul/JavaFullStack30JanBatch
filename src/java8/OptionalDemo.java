package java8;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String[] str = new String[5];
        Optional<String> checkNullOptional = Optional.ofNullable(str[2]);
        if (checkNullOptional.isPresent())
        System.out.println(checkNullOptional.get().toLowerCase());
        else System.out.println("String is null");
    }
}
