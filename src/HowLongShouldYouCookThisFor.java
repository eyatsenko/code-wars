/*
You've purchased a ready-meal from the supermarket.

The packaging says that you should microwave it for 4 minutes and 20 seconds, based on a 600W microwave.

Oh no, your microwave is 800W! How long should you cook this for?!

Input
You'll be given 4 arguments:

1. needed power
The power of the needed microwave.
Example: "600W"

2. minutes
The number of minutes shown on the package.
Example: 4

3. seconds
The number of seconds shown on the package.
Example: 20

4. power
The power of your microwave.
Example: "800W"

Output
The amount of time you should cook the meal for formatted as a string.
Example: "3 minutes 15 seconds"

Note: the result should be rounded up.

59.2 sec  -->  60 sec  -->  return "1 minutes 0 seconds"
*/

public class HowLongShouldYouCookThisFor {
    public static void main(String[] args) {
        System.out.println(getTime("600W", 4, 20, "800W"));
        System.out.println(getTime("800W", 3, 0, "1200W"));
        System.out.println(getTime("100W", 8, 45, "50W"));
        System.out.println(getTime("7500W", 0, 5, "600W"));
        System.out.println(getTime("450W", 3, 25, "950W"));
        System.out.println(getTime("21W", 64, 88, "25W"));
        System.out.println(getTime("83W", 61, 80, "26W"));
        System.out.println(getTime("38W", 95, 22, "12W"));
    }

    public static String getTime(String neededPower, int minutes, int seconds, String power) {
        int secNeed = minutes * 60 + seconds;
        double index = Double.parseDouble(parseWatts(neededPower)) / Double.parseDouble(parseWatts(power));
        double res = secNeed * index;
        double[] rounded = roundRes(res / 60.0, Math.ceil(res % 60.0));

        return (int) rounded[0] + " minutes " + (int) rounded[1] + " seconds"; // Do your magic!
    }

    public static String parseWatts(String watts) {
        if (!watts.contains("W")) {
            return watts;
        } else {
            return watts.replaceAll("\\D", "");
        }
    }

    public static double[] roundRes(double min, double sec) {
        double resMin = min;
        double resSec = sec;
        double[] result = new double[2];
        if (Math.ceil(resSec) >= 60) {
            resMin++;
            resSec = 0;
        }
        result[0] = resMin;
        result[1] = resSec;
        return result;
    }
}
