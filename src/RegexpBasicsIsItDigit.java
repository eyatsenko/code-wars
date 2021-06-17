public class RegexpBasicsIsItDigit {
    public static void main(String[] args) {
        System.out.println(isDigit("5"));
    }

    public static boolean isDigit(String s) {
        boolean result = false;
        if (!s.isEmpty() && !s.isBlank()) {
            String words = s.replaceAll("[^0-9]", "");
            result =  words.equals(s);
        }
        return result;
    }
}
