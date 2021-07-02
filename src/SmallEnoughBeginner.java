/*
You will be given an array and a limit value.
You must check that all values in the array are below or equal to the limit value. If they are, return true. Else, return false.

You can assume all values in the array are numbers.*/

public class SmallEnoughBeginner {
    public static void main(String[] args) {
        System.out.println(smallEnough(new int[] { 66, 101 }, 200));
    }

    public static boolean smallEnough(int[] a, int limit) {

        boolean result = true;

        for (int number : a) {
            if (number > limit) {
                result = false;
            }
        }

        return result;
    }
}
