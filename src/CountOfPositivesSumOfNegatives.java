/*
Given an array of integers.
Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
If the input array is empty or null, return an empty array.
Example
For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
*/

import java.util.Arrays;

public class CountOfPositivesSumOfNegatives {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{-2, -3, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14})));
        //System.out.println(Arrays.toString(countPositivesSumNegatives(null)));
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{})));
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        int[] result = new int[]{};

        try {
            if (input.length != 0 && input != null) {

                int countOfPos = 0;
                int sumOfNeg = 0;

                for (int i = 0; i < input.length; i++) {
                    if (input[i] > 0) {
                        countOfPos++;
                    } else {
                        sumOfNeg += input[i];
                    }
                }
                result = new int[]{countOfPos, sumOfNeg};
            }
        } catch (NullPointerException ex) {
            result = new int[]{};
            return result;
        }
        return result;
    }
}
