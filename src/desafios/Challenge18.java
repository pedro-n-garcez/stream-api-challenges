package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//filter prime numbers from the list

public class Challenge18 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> isNotPrime = number -> {
            if (number == 1)
                return true;

            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    return true;
                }
            }
            return false;
        };

        numbers.stream()
                .filter(isNotPrime)
                .forEach(System.out::println);
    }
}
