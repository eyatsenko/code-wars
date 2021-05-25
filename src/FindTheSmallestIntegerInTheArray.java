/*
Given an array of integers your solution should find the smallest integer.
For example:
    Given [34, 15, 88, 2] your solution will return 2
    Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.
*/


public class FindTheSmallestIntegerInTheArray {
    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[] {5,4,1,4,5}));
    }

    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i = 1; i < args.length; i++) {
            int next = args[i];
            if (min > next){
                min = next;
            }
        }
        return min;
    }
}
