/*
Given a non-empty array of integers, return the result of multiplying the values together in order. Example:
[1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
*/
public class BeginnerReduceButGrow {
    public static void main(String[] args) {
        System.out.println(grow(new int[]{1, 2, 3, 4}));
    }

    public static int grow(int[] x) {
        int result = 1;
        for (int i : x) {
            result *= i;
        }
        return result;
    }
}
