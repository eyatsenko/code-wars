/*Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

Ваше завдання — відсортувати заданий рядок. Кожне слово в рядку міститиме одне число. Це число є позицією слова в результаті.
Примітка. Числа можуть бути від 1 до 9. Отже, 1 буде першим словом (а не 0).
Якщо вхідний рядок порожній, поверніть порожній рядок. Слова у вхідному рядку міститимуть лише дійсні послідовні числа.

Examples
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""
*/

public class YourOrderPlease {
    public static void main(String[] args) {
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
        System.out.println(order("is2 Thi1s T4est 3a"));
        System.out.println(order(""));
    }

    public static String order(String words) {
        if (words.isBlank()) return "";

        StringBuilder sb = new StringBuilder();
        String[] wordsA = words.split(" ");
        for (int i = 1; i <= 9; i++) {
            for (String word : wordsA) {
                if (containsDigit(word, i)) {
                    sb.append(word).append(" ");
                }
            }
        }
        return sb.toString().trim();
    }

    private static boolean containsDigit(String word, int digit) {
        // Перевірка, чи слово містить цифру, рівну digit
        for (char c : word.toCharArray()) {
            if (Character.isDigit(c) && Character.getNumericValue(c) == digit) {
                return true;
            }
        }
        return false;
    }
}
