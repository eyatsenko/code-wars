public class CharProblem {
    public static void main(String[] args) {
        System.out.println(howOld("5 years old"));
    }

    public static int howOld(final String herOld) {
        String s = String.valueOf(herOld.charAt(0));
        return Integer.parseInt(s);
    }
}
