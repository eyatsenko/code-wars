public class NoZerosForHeros {
    public static void main(String[] args) {
        System.out.println(noBoringZeros(-443040400));
    }

    public static int noBoringZeros(int n) {
        String ns = String.valueOf(n);
        while (true) {
            if (ns.charAt(ns.length()-1) != '0'){
                break;
            } else if (n == 0) {
                return 0;
            } else
            if (ns.charAt(ns.length()-1) == '0'){
                n /= 10;
                ns = String.valueOf(n);
            }
        }
        return n;
    }
}