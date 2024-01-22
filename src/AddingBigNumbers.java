/*
We need to sum big numbers, and we require your help.

Write a function that returns the sum of two numbers. The input numbers are strings and the function must return a string.

Example
add("123", "321"); -> "444"
add("11", "99");   -> "110"

*/

import java.math.BigInteger;

public class AddingBigNumbers {
    public static void main(String[] args) {
        System.out.println(add("123", "321"));
        System.out.println(add("123", "456"));
        System.out.println(add("888", "222"));
        System.out.println(addLargeNumbers("63829983432984289347293874", "90938498237058927340892374089")); // 91002328220491911630239667963
    }

    public static String add(String a, String b) {
        return String.valueOf(new BigInteger(a).add(new BigInteger(b)));
    }

    private static String addLargeNumbers(String num1, String num2) {
        StringBuilder sum = new StringBuilder();

        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0) ? Character.getNumericValue(num1.charAt(i)) : 0;
            int digit2 = (j >= 0) ? Character.getNumericValue(num2.charAt(j)) : 0;

            int total = digit1 + digit2 + carry;
            carry = total / 10;
            int remainder = total % 10;

            sum.insert(0, remainder);

            i--;
            j--;
        }

        return sum.toString();
    }
}
