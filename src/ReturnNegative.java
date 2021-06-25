public class ReturnNegative {
    public static void main(String[] args) {
        System.out.println(makeNegative(-292));
    }

    public static int makeNegative(int x) {
        if (x > 0) {
            return x * (-1);
        }
        else return x;
    }
}
