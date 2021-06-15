/*
Simple, remove the spaces from the string, then return the resultant string.
*/

import java.util.Arrays;

public class RemoveStringSpaces {
    public static void main(String[] args) {
        System.out.println(noSpace("London is a capital of Great Britain"));
    }

    static String noSpace(final String x) {
        String [] words = x.split(" ", 9999);
        String result = "";
        for (String s : words) {
            result += s;
        }
        return result;
    }
}
