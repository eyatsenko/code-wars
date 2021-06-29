public class CompareWithinMargin {
    public static void main(String[] args) {
        System.out.println(closeCompare(2, 5, 3));
    }

    public static int closeCompare(double a, double b) {

        int result;

        if (a == b) {
            result = 0;
        } else if (a < b) {
            result = -1;
        } else result = 1;

        return result;
    }

    public static int closeCompare(double a, double b, double margin) {

        int result = 0;

        if (margin >= 0) {
            double delta = Math.abs((a - b));

            if (margin == 0) {
                result = closeCompare(a, b);
                return result;
            }

            if (margin >= delta) {
                result = 0;
                return result;
            } else if (margin < delta) {
                result = closeCompare(a, b);
                return result;
            } else result = 1;
        }

        return result;
    }
}
