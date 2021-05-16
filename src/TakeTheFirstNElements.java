/*
Create a method take that accepts a list/array and a number n, and returns a list/array array of the first n elements from the list/array.
If you need help, here's a reference:
https://docs.oracle.com/javase/6/docs/api/java/util/Arrays.html#copyOfRange(int[],%20int,%20int)
*/

public class TakeTheFirstNElements {
    public static void main(String[] args) {
        int [] ints = take(new int[]{-89, -20, -65, -84, -23, 7, -30, -54, -36, -81, -79, 9, -13, 3, -84, 9, -23, -5}, 56);

        for (int number : ints) {
            System.out.println(number);
        }
    }

    public static int[] take(int[] arr, int n) {
        int [] newArray;
        if (n != 0 && n < arr.length){
            newArray = new int[n];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = arr[i];
            }
        } else if (n == 0){
            newArray = new int[0];
        } else {
            newArray = new int[arr.length];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = arr[i];
            }
        }

        return newArray;
    }
}
