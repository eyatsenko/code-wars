/*
I'm new to coding and now I want to get the sum of two arrays...actually the sum of all their elements. I'll appreciate for your help.
P.S. Each array includes only integer numbers. Output is a number too.
*/


public class ArrayPlusArray {
    public static void main(String[] args) {
        System.out.println(arrayPlusArray(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int[] arrayResult = new int[arr1.length];
        int result = 0;
        for (int i = 0; i < arrayResult.length; i++) {
            arrayResult[i] = arr1[i] + arr2[i];
        }
        for (int num : arrayResult) {
            result += num;
        }
        return result;
    }
}
