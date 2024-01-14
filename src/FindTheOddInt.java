/*
Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.

Examples
[7] should return 7, because it occurs 1 time (which is odd).
[0] should return 0, because it occurs 1 time (which is odd).
[1,1,2] should return 2, because it occurs 1 time (which is odd).
[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindTheOddInt {
    public static void main(String[] args) {
        System.out.println(findIt(new int[]{1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 2, 1}));
    }

    public static int findIt(int[] array) {
        int result = 0;
        HashMap<Integer, Integer> myMap = new HashMap<>();

        for (int number : array) {
            if (!myMap.containsKey(number)) {
                myMap.put(number, 1);
            } else {
                int count = myMap.get(number);
                myMap.put(number, count + 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = myMap.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value % 2 != 0) {
                result = key;
            }
        }
        return result;
    }
}
