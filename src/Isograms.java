public class Isograms {
    public static void main(String[] args) {
        System.out.println(isIsogram("moOse"));
    }

    public static boolean  isIsogram(String str) {
        int count = 0;

        String low = str.toLowerCase();
        char [] chars = low.toCharArray();

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < chars.length; j++) {
                if (String.valueOf(chars[i]).equals(String.valueOf(chars[j]))) {
                    count ++;
                }
            }
        }

        return count <= 0;
    }
}
