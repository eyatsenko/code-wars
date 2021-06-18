/*
HELP! Jason can't find his textbook! It is two days before the test date,
and Jason's textbooks are all out of order! Help him sort a list (ArrayList in java) full of textbooks by subject, so he can study before the test.

The sorting should NOT be case sensitive
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortMyTextbooks {
    public static void main(String[] args) {
        ArrayList<String> strs = new ArrayList<>();
        ArrayList<String> sorted = new ArrayList<>();
        strs.addAll(Arrays.asList(new String[]{"Algebra", "history", "Geometry", "english"}));
        sorted.addAll(Arrays.asList(new String[]{"Algebra", "english", "Geometry", "history"}));

        System.out.println(sort(strs));
    }

    public static List<String> sort(List<String> textbooks) {
        List<String> textBooksLower = new ArrayList<>();
        List<String> result = new ArrayList<>();
        for (String book : textbooks) {
            textBooksLower.add(book.toLowerCase());
        }

        Collections.sort(textBooksLower);

        for (String book : textBooksLower) {
            if (textbooks.contains(book)) {
                result.add(book);
            } else {
                StringBuffer res = new StringBuffer();
                char[] stringArray = book.trim().toCharArray();
                stringArray[0] = Character.toUpperCase(stringArray[0]);
                book = new String(stringArray);
                res.append(book);
                result.add(res.toString());
            }
        }
        return result;
    }
}

