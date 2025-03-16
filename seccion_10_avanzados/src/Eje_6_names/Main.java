package Eje_6_names;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Mario", "Lana");

        names.forEach(System.out::println);
    }
}
