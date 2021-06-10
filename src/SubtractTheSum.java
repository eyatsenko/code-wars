/*Subtract the sum
Complete the function which get an input number n such that n >= 10 and n < 10000, then:
Sum all the digits of n.
Subtract the sum from n, and it is your new n.
If the new n is in the list below return the associated fruit, otherwise return back to task 1.
Example
n = 325
sum = 3+2+5 = 10
n = 325-10 = 315 (not in the list)
sum = 3+1+5 = 9
n = 315-9 = 306 (not in the list)
sum = 3+0+6 = 9
n =306-9 = 297 (not in the list)
...until you find the first n in the list below.
*/

public class SubtractTheSum {
    public static void main(String[] args) {
        System.out.println(subtractSum(4545));
    }

    static int sum = 0;
    static String result = "";

    public static String subtractSum(int n) {
        if (n >= 10 && n <= 10000) {
            int tmp = n;
            String number = String.valueOf(tmp);
            int[] array = new int[number.length()];
            for (int i = 0; i < number.length(); i++) {
                array[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
            }
            // если n входит в диапазон от 1 до 100
            if (n <= 100) {
                // получаю сумму цифр и отнимаю её от числа
                for (int in : array) {
                    sum += in;
                }
                tmp -= sum;
                // ищу есть ли среди диапазоно такое число и переписываем резалт, если есть
                switch (tmp) {
                    case 1:
                    case 3:
                    case 24:
                    case 26:
                    case 47:
                    case 49:
                    case 68:
                    case 70:
                    case 91:
                    case 93:
                        result = "kiwi";
                        break;
                    case 2:
                    case 21:
                    case 23:
                    case 42:
                    case 44:
                    case 46:
                    case 65:
                    case 67:
                    case 69:
                    case 88:
                        result = "pear";
                        break;
                    case 4:
                    case 6:
                    case 25:
                    case 29:
                    case 48:
                    case 50:
                    case 71:
                    case 73:
                    case 92:
                    case 94:
                    case 96:
                        result = "banana";
                        break;
                    case 5:
                    case 7:
                    case 28:
                    case 30:
                    case 32:
                    case 51:
                    case 53:
                    case 74:
                    case 76:
                    case 95:
                    case 97:
                        result = "melon";
                        break;
                    case 8:
                    case 10:
                    case 12:
                    case 31:
                    case 33:
                    case 52:
                    case 56:
                    case 75:
                    case 77:
                    case 79:
                    case 98:
                    case 100:
                        result = "pineapple";
                        break;
                    case 9:
                    case 18:
                    case 27:
                    case 36:
                    case 45:
                    case 54:
                    case 63:
                    case 72:
                    case 81:
                    case 90:
                    case 99:
                        result = "apple";
                        break;
                    case 11:
                    case 13:
                    case 34:
                    case 55:
                    case 57:
                    case 59:
                    case 78:
                    case 80:
                        result = "cucumber";
                        break;
                    case 14:
                    case 16:
                    case 35:
                    case 37:
                    case 39:
                    case 58:
                    case 60:
                    case 83:
                        result = "orange";
                        break;
                    case 15:
                    case 17:
                    case 19:
                    case 38:
                    case 40:
                    case 61:
                    case 82:
                    case 84:
                    case 86:
                        result = "grape";
                        break;
                    case 20:
                    case 22:
                    case 41:
                    case 43:
                    case 62:
                    case 64:
                    case 66:
                    case 85:
                    case 87:
                    case 89:
                        result = "cherry";
                        break;
                }
            } else {
                while (tmp > 0) {
                    String number2 = String.valueOf(tmp);
                    int[] array2 = new int[number2.length()];

                    for (int i = 0; i < number2.length(); i++) {
                        array2[i] = Integer.parseInt(String.valueOf(number2.charAt(i)));
                    }
                    sum = 0;
                    for (int in : array2) {
                        sum += in;
                    }
                    tmp -= sum;
                    if (tmp <= 100) {
                        switch (tmp) {
                            case 1:
                            case 3:
                            case 24:
                            case 26:
                            case 47:
                            case 49:
                            case 68:
                            case 70:
                            case 91:
                            case 93:
                                result = "kiwi";
                                break;
                            case 2:
                            case 21:
                            case 23:
                            case 42:
                            case 44:
                            case 46:
                            case 65:
                            case 67:
                            case 69:
                            case 88:
                                result = "pear";
                                break;
                            case 4:
                            case 6:
                            case 25:
                            case 29:
                            case 48:
                            case 50:
                            case 71:
                            case 73:
                            case 92:
                            case 94:
                            case 96:
                                result = "banana";
                                break;
                            case 5:
                            case 7:
                            case 28:
                            case 30:
                            case 32:
                            case 51:
                            case 53:
                            case 74:
                            case 76:
                            case 95:
                            case 97:
                                result = "melon";
                                break;
                            case 8:
                            case 10:
                            case 12:
                            case 31:
                            case 33:
                            case 52:
                            case 56:
                            case 75:
                            case 77:
                            case 79:
                            case 98:
                            case 100:
                                result = "pineapple";
                                break;
                            case 9:
                            case 18:
                            case 27:
                            case 36:
                            case 45:
                            case 54:
                            case 63:
                            case 72:
                            case 81:
                            case 90:
                            case 99:
                                result = "apple";
                                break;
                            case 11:
                            case 13:
                            case 34:
                            case 55:
                            case 57:
                            case 59:
                            case 78:
                            case 80:
                                result = "cucumber";
                                break;
                            case 14:
                            case 16:
                            case 35:
                            case 37:
                            case 39:
                            case 58:
                            case 60:
                            case 83:
                                result = "orange";
                                break;
                            case 15:
                            case 17:
                            case 19:
                            case 38:
                            case 40:
                            case 61:
                            case 82:
                            case 84:
                            case 86:
                                result = "grape";
                                break;
                            case 20:
                            case 22:
                            case 41:
                            case 43:
                            case 62:
                            case 64:
                            case 66:
                            case 85:
                            case 87:
                            case 89:
                                result = "cherry";
                                break;
                        }
                    }
                }
            }
        }
        return result;
    }
}
