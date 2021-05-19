/*
Write a function to split a string and convert it into an array of words. For example:

"Robin Singh" ==> ["Robin", "Singh"]

"I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]
 */

import java.util.Arrays;

public class ConvertAstringToAnArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray("Edik the best")));
    }


    public static String[] stringToArray(String s) {
        String [] arrayS = s.split(" ");

        return arrayS;
    }
}
