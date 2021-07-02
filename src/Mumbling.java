import java.util.Locale;

public class Mumbling {
    public static void main(String[] args) {
        System.out.println(accum("ZpglnRxqenU"));
    }

    public static String accum(String s) {
        String low = s.toLowerCase();

        char[] chars = low.toCharArray();

        System.out.println(chars);
        String result = "";

        for (int i = 0; i < chars.length; i++) {
            String tmp = "";
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    tmp += String.valueOf(chars[i]).toUpperCase();
                } else
                    tmp += chars[i];
            }

            if (i != chars.length - 1) {
                result += tmp + "-";
            } else result += tmp;
        }

        return result;
    }
}
