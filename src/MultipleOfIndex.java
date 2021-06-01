import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Return a new array consisting of elements which are multiple of their own index in input array (length > 1).
Some cases:
[22, -6, 32, 82, 9, 25] =>  [-6, 32, 25]
[68, -1, 1, -7, 10, 10] => [-1, 10]
[-56,-85,72,-26,-14,76,-27,72,35,-21,-67,87,0,21,59,27,-92,68] => [-85, 72, 0, 68]

*/
public class MultipleOfIndex {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(multipleOfIndex(new int[]{-56,-85,72,-26,-14,76,-27,72,35,-21,-67,87,0,21,59,27,-92,68})));
    }

    public static int[] multipleOfIndex(int[] array) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= array.length; i++) {
            if (i-1 == 0) {
                continue;
            } else
            if (array[i -1]% (i-1) == 0){
                list.add(array[i-1]);
            }
        }

        int [] arrayR = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            arrayR[j] = list.get(j);
        }

        return arrayR;
    }
}
