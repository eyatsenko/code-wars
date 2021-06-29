public class YouOnlyNeedOneBeginner {
    public static void main(String[] args) {
        System.out.println(check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45));
        System.out.println(check(new Object[] {"what", "a", "great", "kata", "ddd"}, "kata"));
        System.out.println(check(new Object[] {2.2, 3.6, 5.0}, 3.6));
        System.out.println(check(new Object[] {true, false}, false));
        System.out.println(check(new Object[] {'c', 'r', 'h'}, 'r'));
    }

    public static boolean check(Object[] a, Object x) {

        boolean result = false;

        for (Object o : a) {
            if (o.toString().equals(x.toString())) {
                result = true;
                break;
            }
        }

        return result;
    }
}
