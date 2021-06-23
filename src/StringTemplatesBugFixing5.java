public class StringTemplatesBugFixing5 {
    public static void main(String[] args) {
//        System.out.println(buildString(new String[]{"Cheese", "Milk", "Chocolate"}));
        System.out.println(buildString(" ", "Vasya"));
    }

    public static String buildString(String... args) {
        String result = "I like ";
        for (int i = 0; i < args.length; i++) {

            if (args[0].isBlank()) {
                result += "";
            }
            if (i != 0 && i != args.length - 1) {
                result += args[i] + ", ";
            }
            if (i == args.length - 1) {
                result += args[args.length - 1] +  "!";
            }
        }
        return result;
    }
}
