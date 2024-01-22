/*
Complete the solution so that it splits the string into pairs of two characters.
If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').
Examples:
* 'abc' =>  ['ab', 'c_']
* 'abcdef' => ['ab', 'cd', 'ef']

*/

import java.util.ArrayList;

public class SplitStrings {
    public static void main(String[] args) {
        String[] strings = solution("abcdef");
        String[] strings2 = solution("abcdefg");

        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println();
        for (String string : strings2) {
            System.out.println(string);
        }
    }

    public static String[] solution(String s) {
        ArrayList<String> strings = new ArrayList<>();
        StringBuilder strB = new StringBuilder();
        char[] letters = s.toCharArray();

        if (s.length() % 2 != 0) {
            letters = new char[s.length() + 1];
            int currentIndex = 0;
            for (int i = 0; i < s.length(); i++) {
                char currentChar = s.charAt(i);
                letters[currentIndex] = currentChar;
                currentIndex++;
            }
            letters[letters.length-1] = '_';
        }
        for (int i = 0; i < letters.length; ) {
            strB.append(letters[i]);
            strB.append(letters[i + 1]);
            strings.add(strB.toString());
            strB = new StringBuilder();
            i += 2;
        }
        return strings.toArray(new String[0]);
    }
}
