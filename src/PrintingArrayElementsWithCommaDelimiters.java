public class PrintingArrayElementsWithCommaDelimiters {
    public static void main(String[] args) {
        System.out.println(printArray(new Integer[]{2, 4, 5, 2}));
    }

    public static String printArray(Integer array[]) {
        String result = "";

        String[] arrayString = new String[array.length];
        for (int j = 0; j < array.length; j++) {
            arrayString[j] = array[j].toString();
        }

        for (int i = 0; i < arrayString.length; i++) {
            if (i == arrayString.length - 1) {
                result += arrayString[i];
                break;
            }
            result += array[i] + ",";
        }

        return result;
    }
}
