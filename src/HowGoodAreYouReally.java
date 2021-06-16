/*
There was a test in your class and you passed it. Congratulations!
But you're an ambitious person. You want to know if you're better than the average student in your class.
You receive an array with your peers' test scores. Now calculate the average and compare your score!
Return True if you're better, else False!

Note:
Your points are not included in the array of your class's points. For calculating the average point you may add your point to the given array!
*/

import java.util.Arrays;

public class HowGoodAreYouReally {
    public static void main(String[] args) {
        System.out.println(betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 788));
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        boolean result;
        int averagePoint = 0;

        int [] commonPoints = new int[classPoints.length + 1];

        for (int i = 0; i < classPoints.length; i++) {
            commonPoints[i] = classPoints[i];
        }

        commonPoints[commonPoints.length - 1] = yourPoints;

        for (int commonPoint : commonPoints) {
            averagePoint += commonPoint;
        }

        averagePoint /= commonPoints.length;

        result = averagePoint < yourPoints;

        return result;
    }
}
