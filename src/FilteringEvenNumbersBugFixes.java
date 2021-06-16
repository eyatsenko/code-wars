import java.util.*;

public class FilteringEvenNumbersBugFixes {
    public static void main(String[] args) {
        System.out.println(filterOddNumber(new LinkedList<>(Arrays.asList(1, 2, 2, 2, 4, 3, 4, 5, 6, 7))));
    }

    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        List<Integer> listOfOddNumbers = new ArrayList<>();

        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i) % 2 != 0) {
                listOfOddNumbers.add(listOfNumbers.get(i));
            }
        }
        return listOfOddNumbers;
    }
}
