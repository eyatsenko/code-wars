/*
Complete the function, which calculates how much you need to tip based on the total amount of the bill and the service.

You need to consider the following ratings:
    Terrible: tip 0%
    Poor: tip 5%
    Good: tip 10%
    Great: tip 15%
    Excellent: tip 20%

The rating is case insensitive (so "great" = "GREAT"). If an unrecognised rating is received, then you need to return:
    "Rating not recognised" in Javascript, Python and Ruby...
    ...or null in Java
    ...or -1 in C#

Because you're a nice person, you always round up the tip, regardless of the service.
*/

public class TipCalculator {
    public static void main(String[] args) {
        System.out.println(calculateTip(100, "sdfsdf"));
    }

    public static Integer calculateTip(double amount, String rating) {
        Integer resultI = 0;
        double tip = 1.0;
        rating = rating.toLowerCase();

        switch (rating) {
            case "terrible":
                tip = 0;
                break;
            case "poor":
                tip = 0.05;
                break;
            case "good":
                tip = 0.1;
                break;
            case "great":
                tip = 0.15;
                break;
            case "excellent":
                tip = 0.2;
                break;
            default:
                resultI = null;
        }

        double result = amount * tip;

        if (resultI != null && (result % (int) result >= 0.5 && amount >=1) || amount % (int)amount >= 0.5) {
            resultI = (int) result + 1;
        } else if (resultI != null && result % (int) result < 0.5) {
            resultI = (int) result;
        }
        return resultI;
    }

}

