package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//print the sum of all even numbers in the list

public class Challenge2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> isEven = number -> number % 2 == 0;

        int result = numbers.stream()
                .filter(isEven)
                .reduce(0, Integer::sum);

        System.out.println(result);
    }
}
