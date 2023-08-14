package desafios;

import java.util.Arrays;
import java.util.List;

//print the sum of the squares of all numbers in the list

public class Challenge11 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int result = numbers.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println(result);
    }
}
