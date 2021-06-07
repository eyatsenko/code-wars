/*
Add two logs with base X, with the value of A and B. Example log A + log B where the base is X.
*/
import static java.lang.Math.*;

public class EasyLogs {
    public static void main(String[] args) {
        System.out.println(logs(10,2,3));
    }
    public static double logs(double x, double a, double b) {
        return log(a) / log(x) + log(b) / log(x);
    }
}
