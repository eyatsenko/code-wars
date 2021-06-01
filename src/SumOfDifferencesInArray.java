/*
Your task is to sum the differences between consecutive pairs in the array in descending order.
For example:
sumOfDifferences([2, 1, 10])
Returns 9
Descending order: [10, 2, 1]
Sum: (10 - 2) + (2 - 1) = 8 + 1 = 9
If the array is empty or the array has only one element the result should be 0 (Nothing in Haskell).
*/

import java.util.Arrays;

public class SumOfDifferencesInArray {
    public static void main(String[] args) {
        System.out.println(sumOfDifferences(new int[]{2, 1, 10}));
    }

    public static int sumOfDifferences(int[] arr) {
        int [] arrSorted = new int[arr.length];
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSorted[i] = arr[i];
        }
        Arrays.sort(arrSorted);

        for (int j = arrSorted.length - 1; j >= 1; j--) {
            result += arrSorted[j] - arrSorted[j-1];
        }
        return result;
    }
}
