package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//group into even or odd numbers

public class Challenge17 {
    //utility function to avoid repetition
    public static void printListWithName(String name, List<Integer> list) {
        System.out.println(String.format("%s: ",name));
        list.stream().forEach(System.out::println);
        System.out.println("\n");
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> isEven = number -> number % 2 == 0;

        Map<Boolean, List<Integer>> partitionNumbers =
                numbers.stream().collect(
                        Collectors.partitioningBy(isEven));

        List<Integer> evenNumbers = partitionNumbers.get(true);
        List<Integer> oddNumbers = partitionNumbers.get(false);

        printListWithName("Even",evenNumbers);
        printListWithName("Odd",oddNumbers);
    }
}
