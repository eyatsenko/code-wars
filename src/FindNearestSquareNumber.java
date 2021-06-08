public class FindNearestSquareNumber {
    public static void main(String[] args) {
        System.out.println(nearestSq(10));
    }

    public static int nearestSq(final int n){
        int result = 0;
        int tmp = n;
        int next = tmp;
        int prev = tmp;

        if (Math.sqrt(tmp) - (int) Math.sqrt(tmp) == 0) {
            result = n;
        } else {
            while (Math.sqrt(tmp) - (int) Math.sqrt(tmp) != 0){
                tmp ++;
                next = tmp;
                if (Math.sqrt(tmp) - (int) Math.sqrt(tmp) == 0){
                    tmp = n;
                    break;
                }
            }
            while (Math.sqrt(tmp) - (int) Math.sqrt(tmp) != 0){
                tmp --;
                prev = tmp;
                if (Math.sqrt(tmp) - (int) Math.sqrt(tmp) == 0){
                    break;
                }
            }

            if (Math.abs(next) - Math.abs(n) < Math.abs(n) - Math.abs(prev)) {
                result = next;
            } else result = prev;
        }
        return result;
    }
}
