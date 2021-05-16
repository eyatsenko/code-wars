/*
Your goal is to return multiplication table for number that is always an integer from 1 to 10.
For example, a multiplication table (string) for number == 5 looks like below:

1 * 5 = 5
2 * 5 = 10
3 * 5 = 15
4 * 5 = 20
5 * 5 = 25
6 * 5 = 30
7 * 5 = 35
8 * 5 = 40
9 * 5 = 45
10 * 5 = 50
P. S. You can use \n in string to jump to the next line.

Note: newlines should be added between rows, but there should be no trailing newline at the end.
 */



public class MultiplicationTableForNumber {
    public static void main(String[] args) {
        System.out.println(multiTable(5));
    }

    public static String multiTable(int num) {
        int result;
        String resultLine = "";
        for (int i = 1; i <= 10; i++) {
            result = i * num;
            resultLine += i + " * " + num + " = " + result;

            if (i != 10) {
                resultLine += "\n";
            }
        }
        return resultLine;
    }
}
