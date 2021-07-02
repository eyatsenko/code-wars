import java.util.Arrays;

public class ToSquareRootOrNotToSquareRoot {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareOrSquareRoot(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
    }

    public static int[] squareOrSquareRoot(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < newArray.length; i++) {
            int elem = array[i];

            if (elem % Math.sqrt(elem) == 0) {
                newArray[i] = (int) Math.sqrt(elem);
            } else {
                newArray[i] = elem * elem;
            }
        }

        return newArray;
    }
}
