import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnesAndZeros {

    public static void main(String[] args) {
        System.out.println(OnesAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 0, 0, 1))));
        System.out.println(OnesAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 1, 1, 1))));
        System.out.println(OnesAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 1, 1, 0))));
        System.out.println(OnesAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 0, 0, 1))));
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int pwd = binary.size();
        int result = 0;
        for (int i = 0; i < binary.size(); i++) {
            result += (int) (binary.get(i) * Math.pow(2, (pwd - 1)));
            pwd--;
        }
        return result;
    }
}
