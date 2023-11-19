public class FirstClass {
    public static void main(String[] args) {
        byte z = 5;
        byte x = 6;
        System.out.println(sum(z, x));
    }

    public static byte sum (byte a, byte b) {
        int c = (int)a + (int)b;
        return (byte) c;
    }
}
