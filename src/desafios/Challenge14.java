package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

//find the largest prime number in the list

public class Challenge14 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> isPrime = number -> {
            if (number == 1)
                return false;

            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        };

        int result = numbers.stream()
                .filter(isPrime)
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .get();

        System.out.println(result);
    }
}
