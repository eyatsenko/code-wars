/*
Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
Return your answer as a number.
*/

import java.util.Arrays;
import java.util.List;

public class SumMixedArray {
    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
    }

    public static int sum(List<?> mixed) {
        int result = 0;

        for (var elem : mixed) {
            try {
                result += Integer.parseInt((String) elem);
            } catch (ClassCastException e){
                result += (int) elem;
            }

        }
        return result;
    }
}
