import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
There is an array with some numbers. All numbers are equal except for one. Try to find it!

Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
It’s guaranteed that array contains at least 3 numbers.

The tests contain some very huge arrays, so think about performance.
*/

public class FindTheUniqueNumber {
    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
        System.out.println(findUniq(new double[]{0, 0, 0.55, 0, 0}));
    }

    public static double findUniq(double[] arr) {
        HashMap<Double, Integer> numbersAndTheirCount = new HashMap<>();

        for (double v : arr) {
            if (!numbersAndTheirCount.containsKey(v)) {
                numbersAndTheirCount.put(v, 1);
            } else {
                for (Map.Entry<Double, Integer> entry : numbersAndTheirCount.entrySet()) {
                    Integer value = entry.getValue();
                    numbersAndTheirCount.replace(v, value, value + 1);
                }
            }
        }

        Double result = 0.0;
        for (Map.Entry<Double, Integer> entry : numbersAndTheirCount.entrySet()) {
            Double key = entry.getKey();
            Integer value = entry.getValue();
            if (value == 1) {
                result = key;
            }
        }
        return result;
    }

    public static double findUniq2(double[] arr) {
        HashMap<Double, Integer> doubleMap = new HashMap<>();
        //Put all array element in a hashmap
        for (double i : arr) {
            if (doubleMap.get(i) == null) {
                doubleMap.put(i, 1);
                continue;
            }
            doubleMap.put(i, doubleMap.get(i) + 1);
        }
        //Find the matching element
        for (Map.Entry<Double, Integer> i : doubleMap.entrySet()) {
            if (i.getValue() == 1)
                return i.getKey();
        }
        throw new RuntimeException("no unique number found");
    }

    public static double findUniq3(double arr[]) {
        Arrays.sort(arr);
        if (arr[0] == arr[1])
            return arr[arr.length-1];
        else
            return arr[0];
    }
}
