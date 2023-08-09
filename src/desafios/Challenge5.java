package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//calculate the average of numbers greater than 5

public class Challenge5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> isGreaterThanFive = number -> number > 5;

        //using filter to get numbers > 5 and getting their average as a double
        Double result = numbers.stream()
                .filter(isGreaterThanFive)
                .mapToDouble(Double::valueOf)
                .average()
                .getAsDouble();

        System.out.println(result);
    }
}
