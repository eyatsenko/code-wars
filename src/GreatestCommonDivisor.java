/*
Find the greatest common divisor of two positive integers. The integers can be large, so you need to find a clever solution.
The inputs x and y are always greater or equal to 1, so the greatest common divisor will always be an integer that is also greater or equal to 1.
*/

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(compute(30, 12));
    }

    public static int compute(int x, int y) {

        int nod = x;

        for (int i = x; i > 0; i--) {
            if (x % i == 0 && y % i == 0) {
                nod = i;
                break;
            }
        }
        return nod;
    }
}
