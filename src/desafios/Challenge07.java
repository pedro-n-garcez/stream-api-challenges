package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//return the second-largest number in the list

public class Challenge07 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //this stream sorts by descending order then
        //skips the first element to give us the second-largest number
        Integer secondLargest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findAny()
                .get();

        System.out.println(secondLargest);
    }
}
