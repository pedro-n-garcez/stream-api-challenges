package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//filter numbers within a range

public class Challenge13 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int lowerBound = 3;
        int upperBound = 9;

        Predicate<Integer> range = number -> number > lowerBound && number < upperBound;

        List<Integer> numbersWithinRange = numbers.stream()
                .filter(range)
                .toList();

        numbersWithinRange.stream()
                .forEach(System.out::println);
    }
}
