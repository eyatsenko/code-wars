public class Power {
    public static void main(String[] args) {
        System.out.println(toPower(3, 3));
    }

    public static int toPower(int num, int power) {
        for (int i = 1; i < power; i++) {
            num = num * num;
        }
        return num;
    }
}
