/*
Given a string s, write a method (function) that will return true if its a valid single integer or floating number or false if its not.

Valid examples, should return true:

isDigit("3")
isDigit("  3  ")
isDigit("-3.23")
should return false:

isDigit("3-4")
isDigit("  3   5")
isDigit("3 5")
isDigit("zero")
*/

public class IsItANumber {
    public static void main(String[] args) {
        System.out.println(isDigit("5f"));
    }

    public static boolean isDigit(String s) {
        boolean result;
        try {
            Float.parseFloat(s);
            result = true;
        } catch (Exception e) {
            try {
                Integer.parseInt(s);
                result = true;
            } catch (Exception ex) {
                result = false;
            }
        }
        return result;
    }
}
