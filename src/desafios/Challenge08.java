package desafios;

import java.util.Arrays;
import java.util.List;

//add the digits of all numbers in the list

public class Challenge08 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int result = numbers.stream()
                .map(number -> {
                    int sumOfDigits = 0;
                    while (number != 0){
                        int digit = number % 10; //mod 10 gets the last digit
                        sumOfDigits = sumOfDigits + digit; //add digit to sum
                        number = number / 10; //remove last digit
                    }
                    return sumOfDigits;
                })
                .reduce(0, Integer::sum);

        System.out.println(result);
    }
}
