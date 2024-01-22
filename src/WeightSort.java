/*
My friend John and I are members of the "Fat to Fit Club (FFC)".
John is worried because each month a list with the weights of members is published and each month he is the last on the list which means he is the heaviest.

I am the one who establishes the list so I told him: "Don't worry any more,
I will modify the order of the list". It was decided to attribute a "weight" to numbers. The weight of a number will be from now on the sum of its digits.

For example 99 will have "weight" 18, 100 will have "weight" 1 so in the list 100 will come before 99.

Given a string with the weights of FFC members in normal order can you give this string ordered by "weights" of these numbers?

Example:
"56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes:

"100 180 90 56 65 74 68 86 99"
When two numbers have the same "weight", let us class them as if they were strings (alphabetical ordering) and not numbers:

180 is before 90 since, having the same "weight" (9), it comes before as a string.

All numbers in the list are positive numbers and the list can be empty.

Notes
it may happen that the input string have leading, trailing whitespaces and more than a unique whitespace between two consecutive numbers
For C: The result is freed.
*/

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class WeightSort {
    public static void main(String[] args) {
//        System.out.println(orderWeight("56 65 74 100 99 68 86 180 90"));
//        System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
        System.out.println(orderWeights("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }

//    public static String orderWeight(String strng) {
//        HashMap<Integer, Integer> numbersAndTheirWeight = new HashMap<>();
//        int[] numbers = getIntArray(strng);
//
//        for (int number : numbers) {
//            numbersAndTheirWeight.put(number, calcNumberWeight(number));
//        }
//
//        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(numbersAndTheirWeight.entrySet());
//        list.sort(Map.Entry.comparingByValue());
//
//        LinkedHashMap<Integer, Integer> sortedNumbersAndTheirWeight = new LinkedHashMap<>();
//        for (Map.Entry<Integer, Integer> entry : list) {
//            sortedNumbersAndTheirWeight.put(entry.getKey(), entry.getValue());
//        }
//        StringBuilder stringBuilder = new StringBuilder();
//        for (Map.Entry<Integer, Integer> entry : sortedNumbersAndTheirWeight.entrySet()) {
//            stringBuilder.append(entry.getKey());
//            stringBuilder.append(" ");
//        }
//        return stringBuilder.toString().trim();
//    }



    public static String orderWeights(String input) {
        // Split the input string into an array of weights
        String[] weights = input.trim().split("\\s+");

        // Create a custom comparator based on the sum of digits
        Comparator<String> weightComparator = (s1, s2) -> {
            int sum1 = calculateSumOfDigits(s1);
            int sum2 = calculateSumOfDigits(s2);

            // If weights have the same sum of digits, compare them as strings
            if (sum1 == sum2) {
                return s1.compareTo(s2);
            }

            return Integer.compare(sum1, sum2);
        };

        // Sort the weights using the custom comparator
        Arrays.sort(weights, weightComparator);

        // Join the sorted weights into a string
        return String.join(" ", weights);
    }

    private static int calculateSumOfDigits(String number) {
        return number.chars().map(Character::getNumericValue).sum();
    }


    public static int[] getIntArray(String str) {
        String[] strings = str.split(" ");
        int[] result = new int[strings.length];

        for (int i = 0; i < strings.length; i++) {
            result[i] = Integer.valueOf(strings[i]);
        }
        return result;
    }

    public static int calcNumberWeight(int number) {
        String strNum = String.valueOf(number);

        if (strNum.length() == 1) {
            return number;
        } else {
            char [] chars = strNum.toCharArray();
            int sum = 0;
            for(char ch : chars) {
                sum += Character.getNumericValue(ch);
            }
            return sum;
        }

    }
}

