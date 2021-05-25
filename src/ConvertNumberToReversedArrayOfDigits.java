/*
Convert number to reversed array of digits
Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
Example:
348597 => [7,9,5,8,4,3]
*/

import java.util.Arrays;

public class ConvertNumberToReversedArrayOfDigits {
    public static void main(String[] args) {
        int [] ints = digitize(348597);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] digitize(long n) {
        String numberS = String.valueOf(n);
        long len = numberS.length();
        char [] array = new char[(int) len];
        int [] reversedArray = new int[(int) len];

        for (int i = 0; i < len; i++) {
            array[i] = numberS.charAt(i);
        }

        int k = 0;
        for (int j = (int) (len - 1); j >= 0; j--) {
            char ch = array[j];
            reversedArray[k] = Integer.parseInt(String.valueOf(ch));
            k ++;
        }
        return reversedArray;
    }
}
