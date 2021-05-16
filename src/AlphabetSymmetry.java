/*
Consider the word "abode". We can see that the letter a is in position 1 and b is in position 2. In the alphabet, a and b are also in positions 1 and 2.
Notice also that d and e in abode occupy the positions they would occupy in the alphabet, which are positions 4 and 5.
Given an array of words, return an array of the number of letters that occupy their positions in the alphabet for each word. For example,
solve(["abode","ABc","xyzD"]) = [4, 3, 1]
See test cases for more examples.
Input will consist of alphabet characters, both uppercase and lowercase. No spaces.
Good luck!
*/


import java.util.Arrays;

public class AlphabetSymmetry {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new String[]{"abcdefghijklmnopqrstuvwxyzzzz", "ABc", "xyz"})));
    }

    public static int[] solve(String[] arr) {
        int[] ints = new int[arr.length];
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < arr.length; i++) {
            String line = arr[i].toLowerCase();
            int count = 0;
            for (int j = 0; j < line.length(); j++) {
                if (j > 25) {
                    continue;
                }
                char ch = line.charAt(j);

                if (ch == chars[j]) {
                    count++;
                }
            }
            ints[i] = count;
        }
        return ints;
    }
}


