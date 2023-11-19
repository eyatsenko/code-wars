public class FirstClass {
    public static void main(String[] args) {
        byte z = 3;
        byte x = 4;
        System.out.println(sum(z, x));
    }

    public static byte sum (byte a, byte b) {
        int c = (int)a + (int)b;
        return (byte) c;
    }
}
