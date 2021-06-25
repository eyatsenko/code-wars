public class SquareSum {
    public static void main(String[] args) {
        System.out.println(squareSum(new int[]{1, 2, 2}));
    }

    public static int squareSum(int[] n) {
        int result = 0;
        for (int i : n) {
            result += i * i;
        }
        return result;
    }
}
