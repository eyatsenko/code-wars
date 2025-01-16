/**
 * A child is playing with a ball on the nth floor of a tall building.
 * The height of this floor above ground level, h, is known.
 * He drops the ball out of the window. The ball bounces (for example), to two-thirds of its height (a bounce of 0.66).
 * His mother looks out of a window 1.5 meters from the ground.
 * How many times will the mother see the ball pass in front of her window (including when it's falling and bouncing)?
 * <p>
 * Three conditions must be met for a valid experiment:
 * Float parameter "h" in meters must be greater than 0
 * Float parameter "bounce" must be greater than 0 and less than 1
 * Float parameter "window" must be less than h.
 * If all three conditions above are fulfilled, return a positive integer, otherwise return -1.
 * <p>
 * Note:
 * The ball can only be seen if the height of the rebounding ball is strictly greater than the window parameter.
 * <p>
 * Examples:
 * - h = 3, bounce = 0.66, window = 1.5, result is 3
 * - h = 3, bounce = 1, window = 1.5, result is -1
 * (Condition 2) not fulfilled.
 */

public class BouncingBalls {
    public static void main(String[] args) {
//      Primary tests
        System.out.println("Primary tests");

        System.out.println("The result is: " + bouncingBall(3.00, 0.66, 1.50));
        System.out.println("The result is: " + bouncingBall(30.00, 0.66, 1.50));

        System.out.println();

        // Additional tests
        System.out.println("Additional tests");
        System.out.println("The result is: " + bouncingBall(1.55, 0.99, 1.50));
        System.out.println("The result is: " + bouncingBall(3.00, 0.33, 1.50));
        System.out.println("The result is: " + bouncingBall(3.00, 0.5, 1.50));
        System.out.println("The result is: " + bouncingBall(3.00, 0.01, 1.50));
        System.out.println("The result is: " + bouncingBall(3.5, 0.5, 1.75));
        System.out.println("The result is: " + bouncingBall(2.0, 0.5, 1.0));

        System.out.println("The result is: " + bouncingBall(3.00, 1.00, 1.50));

        System.out.println();

//         Negative tests
        System.out.println("Negative tests:");

        System.out.println("The result is: " + bouncingBall(0.00, 0.66, 1.50));
        System.out.println("The result is: " + bouncingBall(3.00, 0.0, 1.50));
        System.out.println("The result is: " + bouncingBall(3.00, 1.2, 1.50));
        System.out.println("The result is: " + bouncingBall(3.00, 0.66, 5.50));

        System.out.println();

    }

    public static int bouncingBall(double h, double bounce, double window) {
        // your code
        int count = 0;
        double high = h;

        if (h <= 0) {
            return -1;
        }

        if (bounce <= 0 || bounce >= 1) {
            return -1;
        }

        if (window >= h) {
            return -1;
        }

        System.out.println("h = " + h + ", bounce = " + bounce + ", " + "window = " + window);

        while (high > window) {
            count += 1;
            high *= bounce;
            if (high > window) {
                count += 1;
            }
            System.out.println("The current high is: " + high);
        }

        return count;
    }
}
