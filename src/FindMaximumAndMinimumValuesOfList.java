import java.util.Arrays;

public class FindMaximumAndMinimumValuesOfList {
    public static void main(String[] args) {
        System.out.println(min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
    }

    public static int min(int[] list) {
        Arrays.sort(list);
        return list[0];
    }

    public static int max(int[] list) {
        Arrays.sort(list);
        return list[list.length-1];
    }
}
