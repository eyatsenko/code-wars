public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
    }

    public static String reverseWords(final String original) {

        if (original.isBlank()) {
            return original;
        }

        String[] words = original.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i != words.length - 1) {
                stringBuilder.append(new StringBuilder(words[i]).reverse());
                stringBuilder.append(" ");
            } else {
                stringBuilder.append(new StringBuilder(words[i]).reverse());
            }
        }
        return stringBuilder.toString();
    }
}
