/*
Hey awesome programmer!
You've got much data to manage and of course you use zero-based and non-negative ID's to make each data item unique!
Therefore you need a method, which returns the smallest unused ID for your next new data item...
Note: The given array of used IDs may be unsorted. For test reasons there may be duplicate IDs, but you don't have to find or remove them!
Go on and code some pure awesomeness!
*/

import java.util.Arrays;

public class SmallestUnusedID {
    public static void main(String[] args) {
        System.out.println(nextId(new int[]{ 15, 1, 10}));

    }

    public static int nextId(int[] ids) {
        int result = 0;
        if (ids.length != 0) {

            int[] sortedIds = new int[ids.length];
            for (int i = 0; i < ids.length; i++) {
                sortedIds[i] = ids[i];
            }

            int n = sortedIds.length;

            for (int i = 0, m = 0; i != n; i++, n = m) {
                for (int j = m = i + 1; j != n; j++) {
                    if (sortedIds[j] != sortedIds[i]) {
                        if (m != j) sortedIds[m] = sortedIds[j];
                        m++;
                    }
                }
            }

            if (n != sortedIds.length) {
                int[] b = new int[n];
                for (int i = 0; i < n; i++) b[i] = sortedIds[i];

                sortedIds = b;
            }

            Arrays.sort(sortedIds);
            for (int nnn : sortedIds) {
                System.out.println(nnn);
            }

            for (int i = 1; i < sortedIds.length; i++) {
                if (sortedIds[i -1] != 0 && sortedIds[i - 1] + 1 != sortedIds[i]) {
                    result = sortedIds[i - 1] + 1;
                    break;
                } else if (sortedIds[i -1] == 0 && sortedIds[i - 1] + 1 != sortedIds[i]) {
                    result = sortedIds[i - 1] + 1;
                    break;
                }
            }
            if (result == 0) {
                result = sortedIds[sortedIds.length-1] + 1;
            }
        }
        return result;
    }
}
