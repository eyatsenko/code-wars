/*
Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
which is the number of times you must multiply the digits in num until you reach a single digit.
For example (Input --> Output):
39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
4 --> 0 (because 4 is already a one-digit number)

Напишіть функцію persistence,
яка приймає додатний параметр num і повертає його мультиплікативну стійкість,
тобто кількість разів, які ви повинні помножити цифри в num, доки не досягнете однієї цифри.
*/

public class PersistentBugger {
    static int counter = 0;
    public static void main(String[] args) {
        System.out.println(persistence(39L));
//        System.out.println(persistence(999L));
//        System.out.println(persistence(4L));
    }

    public static int persistence(long n) {
        int sss = count(n);
        do {
            ++counter;
        } while (String.valueOf(sss).length() != 1);

        return counter - 1;
    }

    public static int count(long n) {
        if (String.valueOf(n).length() == 1) {
            return (int) n;
        } else {
            return persistence(multOfDigits(n));
        }
    }

    private static int multOfDigits(long number) {
        int mult = 1;
        char[] chars = String.valueOf(number).toCharArray();
        for (char aChar : chars) {
            mult *= Character.getNumericValue(aChar);
        }
        return mult;
    }
}
