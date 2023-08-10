package desafios;

import java.util.Arrays;
import java.util.List;

//check if all numbers are distinct

public class Challenge9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Long distinctNumbers = numbers.stream()
                .distinct()
                .count();

        String result = "Not all numbers are distinct.";
        if (numbers.size() == distinctNumbers){
            result = "All numbers are distinct.";
        }

        System.out.println(result);
    }
}
