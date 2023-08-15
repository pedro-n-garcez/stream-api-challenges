package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//check if all numbers in the list are equal

public class Challenge19 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> isNegative = number -> number < 0;

        boolean allNumbersEqual = numbers.stream()
                .distinct()
                .count() == 1;

        String result = "The numbers are not equal.";
        if(allNumbersEqual) {
            result = "All numbers are equal.";
        }

        System.out.println(result);
    }
}
