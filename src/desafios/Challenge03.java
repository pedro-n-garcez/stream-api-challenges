package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

//check if all numbers in the list are positive

public class Challenge03 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> isNegative = number -> number < 0;

        //use predicate to find any number in the list that is negative
        Optional<Integer> negativeNumbers = numbers.stream()
                .filter(isNegative)
                .findAny();

        String result = "Not all numbers in the list are positive.";
        //check that no negative numbers were found
        if(negativeNumbers.isEmpty()){
            result = "All numbers in the list are positive.";
        }

        System.out.println(result);
    }
}
