public class SentenceSmash {
    public static void main(String[] args) {
        System.out.println(smash(new String[] { "Bilal", "Djaghout" }));
    }
    public static String smash(String... words) {
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result += words[i] + " ";
        }
        return result.strip();
    }
}
