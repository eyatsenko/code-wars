public class ConvertABooleanToAString {
    public static void main(String[] args) {
        System.out.println(convert(true));
    }

    public static String convert(boolean b){
        if(b) {
            return "true";
        } else {
            return "false";
        }
    }
}
