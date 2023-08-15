package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//remove all odd numbers from the list

public class Challenge04 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> isEven = number -> number % 2 == 0;

        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven)
                .toList();

        evenNumbers.forEach(System.out::println);
    }
}
