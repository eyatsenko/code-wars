/*
Write a function that takes in a string of one or more words, and returns the same string,
but with all words that have five or more letters reversed (Just like the name of this Kata).
Strings passed in will consist of only letters and spaces.
Spaces will be included only when more than one word is present.

Напишіть функцію, яка приймає рядок з одного або кількох слів і повертає той самий рядок, але з усіма словами, які мають п’ять або більше літер,
перевернутими (так само, як назва цього Ката).
Передані рядки складатимуться лише з літер і пробілів.
Пробіли будуть додані, лише якщо присутнє більше одного слова.
*/
public class StopGninnipSMySdroW {
    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
        System.out.println(spinWords("This is a test"));
        System.out.println(spinWords("This is rehtona test"));
    }

    public static String spinWords(String sentence) {
        if (sentence.isBlank()) {
            return sentence;
        }

        String[] words = sentence.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i != words.length - 1) {
                if (words[i].length() >= 5) {
                    stringBuilder.append(new StringBuilder(words[i]).reverse());
                    stringBuilder.append(" ");
                } else {
                    stringBuilder.append(new StringBuilder(words[i]));
                    stringBuilder.append(" ");
                }
            } else {
                if (words[i].length() >= 5) {
                    stringBuilder.append(new StringBuilder(words[i]).reverse());
                } else {
                    stringBuilder.append(new StringBuilder(words[i]));
                }
            }
        }
        return stringBuilder.toString();
    }
}
