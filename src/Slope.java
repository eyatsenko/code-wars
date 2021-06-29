public class Slope {
    public static void main(String[] args) {
        int[] test1 = {19, 3, 20, 3};
        //System.out.println(slope(new int[]{10,50,0,150}));
        System.out.println(slope(test1));
    }

    public static String slope(int[] points) {

        int a = points[0];
        int b = points[1];
        int c = points[2];
        int d = points[3];

        int ca = c - a;

        if (ca == 0) return "undefined";

        return String.valueOf((d - b) / ca);
    }
}
