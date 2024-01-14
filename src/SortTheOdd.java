import java.util.*;
import java.util.stream.Collectors;

public class SortTheOdd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})));
        System.out.println(Arrays.toString(sortArray(new int[]{ 5, 3, 2, 8, 1, 4 })));
    }

    public static int[] sortArray(int[] array) {
        List<Integer> result = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());
        HashMap<Integer, Integer> numberAndIndex = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            numberAndIndex.put(i, array[i]);
        }

        LinkedList<Integer> indexesOfOdd = new LinkedList<>();
        LinkedList<Integer> odds = new LinkedList<>();

        Set<Map.Entry<Integer, Integer>> entrySet = numberAndIndex.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value % 2 != 0) {
                odds.add(value);
                indexesOfOdd.add(key);
            }
        }
        Collections.sort(odds);
        int counter = 0;
        for (int i = 0; i < result.size(); i++) {
            if (indexesOfOdd.contains(i)) {
                result.set(i, odds.get(counter));
                counter ++;
            }
        }
        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
