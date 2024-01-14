/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
Note: If the number is a multiple of both 3 and 5, only count it once.

Якщо ми перерахуємо всі натуральні числа нижче 10, кратні 3 або 5, то отримаємо 3, 5, 6 і 9. Сума цих кратних дорівнює 23.
Завершіть розв’язання так, щоб воно повертало суму всіх кратних 3 або 5 нижче переданого числа.
Примітка. Якщо число кратне 3 і 5, порахуйте його лише один раз.
*/

import java.util.LinkedList;

public class MultiplesOf3or5 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int number) {
        LinkedList<Integer> integersDividedBy3 = new LinkedList<>();
        LinkedList<Integer> integersDividedBy5 = new LinkedList<>();
        LinkedList<Integer> resultList = new LinkedList<>();

        for (int i = number - 1; i > 0; i--) {
            if (i % 3 == 0) {
                integersDividedBy3.add(i);
            }
            if (i % 5 == 0) {
                integersDividedBy5.add(i);
            }
        }
        for (Integer num : integersDividedBy3) {
            if (!resultList.contains(num)) {
                resultList.add(num);
            }
        }
        for (Integer num : integersDividedBy5) {
            if (!resultList.contains(num)) {
                resultList.add(num);
            }
        }
        int sum = resultList.stream()
                            .mapToInt(Integer::intValue)
                            .sum();

        System.out.println(resultList);
        return sum;
    }
}
