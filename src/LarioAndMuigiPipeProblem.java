/*
Issue
Looks like some hoodlum plumber and his brother has been running around and damaging your stages again.

The pipes connecting your level's stages together need to be fixed before you receive any more complaints.
Each pipe should be connecting, since the levels ascend,
you can assume every number in the sequence after the first index will be greater than the previous and that there will be no duplicates.

Task
Given the a list of numbers, return the list so that the values increment by 1 for each index up to the maximum value.

Example
Input: 1,3,5,6,7,8

Output: 1,2,3,4,5,6,7,8
*/

import java.util.Arrays;

public class LarioAndMuigiPipeProblem {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pipeFix(new int[]{0, 7, 8})));
    }

    public static int[] pipeFix(int[] numbers) {
        int firstElIndex = 0;
        int lastElIndex = numbers.length - 1;
        int from = numbers[firstElIndex];
        int arraySize = 1;

        if (numbers[firstElIndex] < 0 && numbers[lastElIndex] < 0) {
            arraySize = Math.abs(numbers[firstElIndex]);
        } else if (numbers[firstElIndex] < 0 && numbers[lastElIndex] >= 0) {
            arraySize = (Math.abs(numbers[firstElIndex])) + (Math.abs(numbers[lastElIndex])) + 1;
        } else if (numbers[firstElIndex] >= 0 && numbers[lastElIndex] >= 0) {
            arraySize = Math.abs(numbers[lastElIndex]) - Math.abs(numbers[firstElIndex]) + 1;
        }

        int[] array = new int[arraySize];

        int c = 0;
        int iterator = 0;
        for (int i = from; iterator <= array.length; i++) {
            array[c] = i;
            if (c == array.length - 1) {
                break;
            }
            c++;
            iterator ++;
        }
        return array;
    }
}
