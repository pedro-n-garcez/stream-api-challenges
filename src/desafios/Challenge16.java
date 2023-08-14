package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

//calculate factorial of a given number

public class Challenge16 {
    public static void main(String[] args) {
         int number = 5;

         Function<Integer, Integer> factorial = (num) -> {
             Integer result = IntStream.rangeClosed(2, num) //rangeClosed which includes largest number in range
                     .reduce(1, (x, y) -> x * y);
             return result;
         };

         System.out.println(factorial.apply(number));
    }
}
