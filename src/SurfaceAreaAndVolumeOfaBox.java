// Write a function that returns the total surface area and volume of a box as an array: [area, volume]

import java.util.Arrays;

public class SurfaceAreaAndVolumeOfaBox {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSize(10, 5, 15)));
    }

    public static int[] getSize(int w, int h, int d) {
        int[] result = new int[2];
        result[0] = 2 * (w * h + h * d + w * d);
        result[1] = w * h * d;
        return result;
    }
}
