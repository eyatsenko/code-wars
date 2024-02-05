/*
Your job is to write a function which increments a string, to create a new string.
If the string already ends with a number, the number should be incremented by 1.
If the string does not end with a number. the number 1 should be appended to the new string.
Examples:
foo -> foo1
foobar23 -> foobar24
foo0042 -> foo0043
foo9 -> foo10
foo099 -> foo100
Attention: If the number has leading zeros the amount of digits should be considered.
*/

import java.math.BigInteger;

public class StringIncrementer {
    public static void main(String[] args) {
        System.out.println(incrementString("foo"));
        System.out.println(incrementString("foobar23"));
        System.out.println(incrementString("foo0042"));
        System.out.println(incrementString("foo9"));
        System.out.println(incrementString("foo077"));
        System.out.println(incrementString("foo099"));
        System.out.println(incrementString("foobar001"));
        System.out.println(incrementString("foobar000"));
        System.out.println(incrementString("150279608677893634469809"));

    }

    public static String incrementString(String str) {
        // Знаходимо позицію останньої літери в рядку
        int index = str.length() - 1;
        while (index >= 0 && Character.isDigit(str.charAt(index))) {
            index--;
        }

        // Виділяємо частину рядка, яка є числом
        String numberStr = str.substring(index + 1);
        // Якщо такої частини немає або вона порожня, додаємо число 1
        if (numberStr.isEmpty()) {
            return str + "1";
        }

        // Знаходимо кількість ведучих нулів
        int leadingZeros = 0;
        while (leadingZeros < numberStr.length() && numberStr.charAt(leadingZeros) == '0') {
            leadingZeros++;
        }

        // Збільшуємо число на 1
        BigInteger number = new BigInteger(numberStr);
        number = number.add(BigInteger.ONE);

        // Форматуємо число з врахуванням ведучих нулів
        String incrementedNumberStr = String.format("%0" + Math.max(numberStr.length(), leadingZeros) + "d", number);

        // Повертаємо результат
        return str.substring(0, index + 1) + incrementedNumberStr;
    }
}
