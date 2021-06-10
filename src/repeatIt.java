/*
Create a function that takes a string and an integer (n).
The function should return a string that repeats the input string n number of times.
If anything other than a string is passed in you should return "Not a string"

Example
"Hi", 2 --> "HiHi"
1234, 5 --> "Not a string"
*/

public class repeatIt {
    public static void main(String[] args) {
        System.out.println(repeatString(6, 5));
    }

    public static String repeatString(final Object toRepeat, final int n) {
        String res = "";
        if (toRepeat instanceof String) {
            for (int i = 0; i < n; i++) {
                res += toRepeat.toString();
            }
        } else {
            res = "Not a string";
        }
        return res;
    }
}
