/*
You get an array of numbers, return the sum of all of the positives ones.
Example [1,-4,7,12] => 1 + 7 + 12 = 20
Note: if there is nothing to sum, the sum is default to 0.
*/

public class SumOfPositive {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,-4,7,12}));
    }

    public static int sum(int[] arr){
        int sum = 0;
        for (int number : arr) {
            if (number > 0) {
                sum += number;
            }
        }
        return sum;
    }

}
