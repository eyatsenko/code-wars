public class StringEndsWith {
    public static void main(String[] args) {

        System.out.println(solution("France", "nce"));

    }

    public static boolean solution(String str, String ending) {
        if (ending.length() > str.length()) {
            return false;
        }
        return str.endsWith(ending);
    }
}
