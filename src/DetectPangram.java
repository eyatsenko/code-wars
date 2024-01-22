/*
A pangram is a sentence that contains every single letter of the alphabet at least once. For example,
the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.

Панграма - це речення, яке містить кожну букву алфавіту принаймні один раз. Наприклад,
речення «The quick brown fox jumps over the lazy dog» є панграмою, оскільки в ньому принаймні один раз використовуються літери A-Z (регістр не має значення).
Дано рядок, визначити, чи є він панграмою. Повертає True, якщо так, False, якщо ні. Не звертайте уваги на цифри та знаки пунктуації.
*/


public class DetectPangram {
    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
        System.out.println(check("You shall not pass!"));
        System.out.println(check("Pack my box with five dozen liquor jugs."));
        System.out.println(check("Cwm fjord bank glyphs vext quiz"));
        System.out.println(check("111111"));
    }

    public static boolean check(String sentence) {
        char[] englishAlphabet = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };
        int counter = 0;
        for (char c : englishAlphabet) {
            if (sentence.toUpperCase().contains(String.valueOf(c))) {
                counter++;
            }
        }
        return counter == englishAlphabet.length;
    }

    public boolean check2(String sentence){
        for (char c = 'a'; c<='z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;

    }
}
