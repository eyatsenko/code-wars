import java.util.Arrays;

public class CountTheMonkeys {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(monkeyCount(4)));
    }

    public static int[] monkeyCount(final int n){
        int [] result = new int[n];

        if (n != 0) {

            for (int i = 0; i < result.length; i ++) {
                result[i] = i + 1;
            }

        } else result = new int[] {0};

        return result;
    }
}
