/*
Complete the function that calculates the area of the red square, when the length of the circular arc A is given as the input.
Return the result rounded to two decimals.
Graph
Note: use the π value provided in your language (Math::PI, M_PI, math.pi, etc)
*/

public class AreaOfaSquare {
    public static void main(String[] args) {
        System.out.println(squareArea(256.20202));
    }
    static int i = 0;
    public static double squareArea(double A) {
        //P = 2 * Math.PI * r;
        if (A != 0) {
            double r = (A * 2) /( Math.PI);
            double result = r * r;
            String res = String.valueOf(result);
            StringBuilder sb = new StringBuilder();

            while (res.charAt(i) != '.') {
                sb.append(res.charAt(i));
                i++;
                if (res.charAt(i) == '.') {
                    sb.append('.');
                    i++;
                    break;
                }
            }
            for (int k = i; k <= i + 1; k++) {
                if (res.charAt(k) != 0) {
                    sb.append(res.charAt(k));
                    if (res.charAt(k) == 0) {
                        sb.append(res.charAt(k));
                        break;
                    }
                }

            }
            return Double.parseDouble(sb.toString());
        } else return 0.0;
    }
}
