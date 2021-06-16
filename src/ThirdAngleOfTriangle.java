public class ThirdAngleOfTriangle {
    public static void main(String[] args) {
        System.out.println(otherAngle(30, 30));
    }

    public static int otherAngle(int angle1, int angle2) {
        return 180 - (angle1 + angle2);
    }
}
