package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

//check if there is at least one negative number

public class Challenge15 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

         boolean negativeNumberExists = numbers.stream().anyMatch(n -> n < 0);

         String result = "There aren't any negative numbers in the list.";
         if (negativeNumberExists) {
             result = "There is at least one negative number in the list.";
         }

         System.out.println(result);
    }
}
