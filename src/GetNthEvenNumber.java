/*
Return the Nth Even Number
Example(Input --> Output)
1 --> 0 (the first even number is 0)
3 --> 4 (the 3rd even number is 4 (0, 2, 4))
100 --> 198
1298734 --> 2597466
The input will not be 0.
*/

public class GetNthEvenNumber {
    public static void main(String[] args) {
        System.out.println(nthEven(1298734));
    }

    public static int nthEven(int n) {
        int evenNumber = 0;
        if (n == 1) {
            evenNumber = 0;
        } else if (n > 1) {
            for (int i = 1; i < n; i++) {
                evenNumber += 2;
            }
        }
        return evenNumber;
    }
}
