/*
Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
Examples
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldway !
*/

import java.util.ArrayList;

public class PigLatin {
    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
        System.out.println(pigIt("Hello world !"));
        System.out.println(pigIt("O tempora o mores"));
    }

    public static String pigIt(String str) {
        StringBuilder sb = new StringBuilder();
        String[] chunks = str.split(" ");
        for (int i = 0; i < chunks.length; i++) {
            if (chunks[i].length() > 1) {
                // Перенесення першої літери в кінець рядка
                chunks[i] = chunks[i].substring(1) + chunks[i].charAt(0);
                sb.append(chunks[i]);
                sb.append("ay");
                sb.append(" ");

            }

            if (chunks[i].length() == 1 && !Character.isJavaLetterOrDigit(chunks[i].charAt(0))) {
                sb.append(chunks[i]);
            }

            if (chunks[i].length() == 1 && Character.isJavaLetterOrDigit(chunks[i].charAt(0))) {
                sb.append(chunks[i]);
                sb.append("ay");
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}
