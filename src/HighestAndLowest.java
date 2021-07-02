import java.util.Arrays;

public class HighestAndLowest {
    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    public static String highAndLow(String numbers) {
        String[] split = numbers.split(" ");
        Integer [] integers = new Integer[split.length];

        for (int i = 0; i < split.length; i++) {
            integers[i] = Integer.parseInt(split[i]);
        }

        Arrays.sort(integers);

        return integers[integers.length - 1] + " " + integers[0];
    }
}
