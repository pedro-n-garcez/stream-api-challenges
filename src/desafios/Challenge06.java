package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

//check if any of the numbers is greater than 10

public class Challenge06 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> isGreaterThanTen = number -> number > 10;

        Optional<Integer> numbersGreaterThanTen = numbers.stream()
                .filter(isGreaterThanTen)
                .findAny();

        String result = "The list does contain a number greater than 10.";
        if(numbersGreaterThanTen.isEmpty()){
            result = "The list does not contain any number greater than 10.";
        }

        System.out.println(result);
    }
}
