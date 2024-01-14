public class SumOfDigitsDigitalRoot {
    public static void main(String[] args) {
        System.out.println(digital_root(343242));
    }

    public static int digital_root(int n) {
        if (String.valueOf(n).length() == 1) {
            return n;
        } else {
            return digital_root(sumOfDigits(n));
        }
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        char[] chars = String.valueOf(number).toCharArray();
        for (char aChar : chars) {
            sum += Character.getNumericValue(aChar);
        }
        return sum;
    }


/*    public class DRoot {
        public static int digital_root(int n) {

            if (String.valueOf(n).length() > 1) {
                int digitSum = 0;
                String numAsString = String.valueOf(n);

                for (int i = 0; i < numAsString.length(); i++) {
                    int digit = Character.getNumericValue(numAsString.charAt(i));
                    digitSum += digit;
                }
                return digital_root(digitSum);
            }

            else  {
                return n;
            }
        }
    }*/
}
