/*
Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).
For example,
 [true,  true,  true,  false,
  true,  true,  true,  true ,
  true,  false, true,  false,
  true,  false, false, true ,
  true,  true,  true,  true ,
  false, false, true,  true]
The correct answer would be 17.

Hint: Don't forget to check for bad values like null/undefined
 */

public class CountingSheep {
    public static void main(String[] args) {
        Boolean[] array = new Boolean[]{true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};

        System.out.println(countSheeps(array));
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (Boolean isSheepPresent : arrayOfSheeps) {
            if (isSheepPresent != null && isSheepPresent == true) {
                count++;
            }
        }
        return count;
    }
}
