public class CountOddNumbersBelowN {
    public static void main(String[] args) {
        System.out.println(oddCount(7));
    }

    public static int oddCount(int n) {
        int count = 0;
        for (int i = n; i > 1; i -= 2) {
            count++;
        }
        return count;
    }
}
