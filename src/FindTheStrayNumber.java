/*
You are given an odd-length array of integers, in which all of them are the same, except for one single number.
Complete the method which accepts such an array, and returns that single different number.
The input array will always be valid! (odd-length >= 3)

Examples
[1, 1, 2] ==> 2
[17, 17, 3, 17, 17, 17, 17] ==> 3
*/

public class FindTheStrayNumber {
    public static void main(String[] args) {
        System.out.println(stray(new int[]{1, 1, 1, 1, 1, 5}));
    }

    static int stray(int[] numbers) {

        int result = 0;

        if (numbers.length > 1) {
            for (int i = 1; i < numbers.length; i++) {
                if (numbers [i] != numbers[i - 1] && numbers[i-1] != numbers[numbers.length -1]) {
                    result = numbers [i - 1];
                    break;
                } else if (numbers [i] != numbers[i - 1] && numbers[i-1] == numbers[numbers.length -1]) {
                    result = numbers [i];
                    break;
                } else if (numbers [0] == numbers[1] && numbers[0] != numbers[numbers.length -1]) {
                    result = numbers [numbers.length -1];
                    break;
                }
            }
        }

        return result;
    }
}
