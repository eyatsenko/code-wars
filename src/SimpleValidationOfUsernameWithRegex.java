public class SimpleValidationOfUsernameWithRegex {
    public static void main(String[] args) {
        System.out.println(validateUsr("__"));
    }

    public static boolean validateUsr(String s) {
        boolean result = false;
        if (s.length() >= 4 && s.length() <= 16){
            String words = s.replaceAll("[^a-z0123456789_]", "");
            result =  s.equals(words);
        }
        return result;
    }
}
