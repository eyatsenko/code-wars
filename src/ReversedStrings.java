/*
Complete the solution so that it reverses the string passed into it.
'world'  =>  'dlrow'
*/

public class ReversedStrings {
    public static void main(String[] args) {
        System.out.println(solution("Edik"));
    }

    public static String solution(String str) {
        char [] chars = str.toCharArray();
        char [] chars2 = new char[chars.length];
        String result = "";

        int k = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            chars2[i] = chars[k];
            k --;
        }

        for (char ch : chars2) {
            result += ch;
        }
        return result;
    }
}
