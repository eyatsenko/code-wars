/*
Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor. First argument is an array of numbers and the second is the divisor.
Example
divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindNumbersWhichAreDivisibleByGivenNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 2)));
    }
    public static int[] divisibleBy(int[] numbers, int divider) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                list.add(numbers[i]);
            }
        }

        int [] result = new int[list.size()];

        for (int j = 0; j < list.size(); j++) {
            result[j] = list.get(j);
        }

        return result;
    }
}
