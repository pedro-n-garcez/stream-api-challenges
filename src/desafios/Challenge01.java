package desafios;

import java.util.Arrays;
import java.util.List;

//sort all numbers by ascending order

public class Challenge01 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
