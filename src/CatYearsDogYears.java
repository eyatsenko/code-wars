/*
I have a cat and a dog.
I got them at the same time as kitten/puppy. That was humanYears years ago.
Return their respective ages now as [humanYears,catYears,dogYears]

NOTES:
humanYears >= 1
humanYears are whole numbers only
Cat Years
15 cat years for first year
+9 cat years for second year
+4 cat years for each year after that
Dog Years
15 dog years for first year
+9 dog years for second year
+5 dog years for each year after that

*/

import java.util.Arrays;

public class CatYearsDogYears {
    public static void main(String[] args) {
        int [] array = humanYearsCatYearsDogYears(3);
        for (int number : array) {
            System.out.println(number);
        }
    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int[] result = new int[]{0, 0, 0};
        int catYears = 15;
        int dogYears = 15;

        if (humanYears < 1) {
            result = new int[]{0, 0, 0};
        } else {
            if (humanYears == 1) {
                result [0] = humanYears;
                result [1] = catYears;
                result [2] = dogYears;
            } else if (humanYears == 2) {
                result [0] = humanYears;
                result [1] = catYears + 9;
                result [2] = dogYears + 9;
            } else {
                result [0] = humanYears;
                result [1] = catYears + 9;
                for (int i = 2; i < humanYears; i++) {
                    result [1] += 4;
                }
                result [2] = dogYears + 9;
                for (int i = 2; i < humanYears; i++) {
                    result [2] += 5;
                }
            }
        }
        return result;
    }
}
