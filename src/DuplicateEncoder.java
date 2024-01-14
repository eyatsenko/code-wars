import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    public static void main(String[] args) {
        System.out.println(DuplicateEncoder.encode("aaadbbb"));
    }

    static String encode(String word) {
        char[] letters = word.toLowerCase().toCharArray();

        HashMap<Character, Integer> counter = new HashMap<>();
        for (char letter : letters) {
            if (!counter.containsKey(letter)) {
                counter.put(letter, 1);
            } else {
                int count = counter.get(letter);
                counter.put(letter, count + 1);
            }
        }

        System.out.println(counter);

        StringBuilder sb = new StringBuilder();
        for (char letter : letters) {
            if (counter.get(letter) > 1) {
                sb.append(")");
            } else {
                sb.append("(");
            }
        }
        return sb.toString();
    }
}

/*
public class DuplicateEncoder {
    static String encode(String word){
        word = word.toLowerCase();
        String result = "";
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
        }
        return result;
    }
}*/
