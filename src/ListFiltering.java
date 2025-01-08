import java.util.ArrayList;
import java.util.List;

/**
 * In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list
 * with the strings filtered out.
 * <p>
 * Example
 * Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
 * Kata.filterList(List.of(1, "a", "b", 0, 15)) => List.of(1,0,15)
 * Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123)) => List.of(1, 2, 123)
 */

public class ListFiltering {
    public static void main(String[] args) {
        System.out.println(ListFiltering.filterList(List.of(1, 2, "a", "b")));
    }

    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        List<Object> result = new ArrayList<>();
        for (Object o : list) {
            if (o.getClass() == Integer.class) {
                result.add(o);
            }
        }
        return result;
    }
}
