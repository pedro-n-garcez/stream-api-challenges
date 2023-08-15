package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//sum of all numbers that are multiples of either 3 or 5

public class Challenge20 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> isMultipleOfThreeOrFive = number -> number % 3 == 0 || number % 5 == 0;

        Integer sumOfMultiples = numbers.stream()
                .filter(isMultipleOfThreeOrFive)
                .reduce(0, Integer::sum);

        System.out.println(sumOfMultiples);
    }
}
