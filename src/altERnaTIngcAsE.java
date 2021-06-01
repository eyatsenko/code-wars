import java.util.Locale;

public class altERnaTIngcAsE {
    public static void main(String[] args) {
        System.out.println(toAlternativeString("altERnaTIngcAsE"));
    }

    public static String toAlternativeString(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            if (String.valueOf(string.charAt(i)).equals(String.valueOf(string.charAt(i)).toUpperCase())){
                result += String.valueOf(string.charAt(i)).toLowerCase();
            } else {
                result += String.valueOf(string.charAt(i)).toUpperCase();
            }
        }
        return result;
    }
}
