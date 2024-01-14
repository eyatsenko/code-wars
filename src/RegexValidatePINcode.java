public class RegexValidatePINcode {
    public static void main(String[] args) {
        System.out.println(validatePin("0000.0"));

    }

    public static boolean validatePin(String pin) {
        String pinTrimmed = pin.replaceAll("[^0-9]", "");
        return pinTrimmed.equals(pin) && (pinTrimmed.length() == 4 || pinTrimmed.length() == 6);
    }

    public static boolean validatePin2(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }
}
