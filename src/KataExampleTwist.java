import java.util.Arrays;

public class KataExampleTwist {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(kataExampleTwist()));
    }

    public static String[] kataExampleTwist() {
        String[] websites = new String[1000];
        String codeWars = "codewars";
        for (int i = 0; i < websites.length; i++) {
            websites[i] = codeWars;
        }
        return websites;
    }
}
