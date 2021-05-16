/*
Complete the function that takes a non-negative integer n as input,
and returns a list of all the powers of 2 with the exponent ranging from 0 to n (inclusive).

Examples
n = 0  ==> [1]        # [2^0]
n = 1  ==> [1, 2]     # [2^0, 2^1]
n = 2  ==> [1, 2, 4]  # [2^0, 2^1, 2^2]
*/

public class PowersOf2 {
    public static void main(String[] args) {
        long [] array123 = powersOfTwo(3);
        for (long l : array123) {
            System.out.println(l);
        }
    }

    public static long[] powersOfTwo(int n) {
        long result = 1;
        long[] array = new long[n + 1];
        array [0] = 1;

        for(int i = 1; i <= n; i++)
        {
            result *= 2;
            array [i] = result;
        }

        return array;
    }
}
