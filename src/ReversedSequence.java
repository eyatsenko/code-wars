import java.util.Arrays;

public class ReversedSequence {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(5)));
    }

    public static int[] reverse(int n){
        int [] ints = new int[n];
        int c = 0;
        for (int i = n; i > 0 ; i--) {
            ints[c] = i;
            c ++;
        }
        return ints;
    }
}
