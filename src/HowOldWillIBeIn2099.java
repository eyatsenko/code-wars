public class HowOldWillIBeIn2099 {
    public static void main(String[] args) {
        System.out.println(CalculateAge(12, 13));
    }

    public static String CalculateAge(int birth, int yearTo) {
        String result = "";

        if (yearTo - birth == 1) {
            result = "You are " + (yearTo - birth) + " year old.";
        } else if (birth == yearTo) {
            result = "You were born this very year!";
        } else if (birth < yearTo) {
            result = "You are " + (yearTo - birth) + " years old.";
        } else if (birth - yearTo == 1) {
            result = "You will be born in " + (birth - yearTo) + " year.";
        } else result = "You will be born in " + (birth - yearTo) + " years.";

        return result;
    }
}
