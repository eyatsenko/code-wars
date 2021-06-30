/*
For every good kata idea there seem to be quite a few bad ones!
In this kata you need to check the provided array (x) for good ideas 'good' and bad ideas 'bad'.
If there are one or two good ideas, return 'Publish!', if there are more than 2 return 'I smell a series!'.
If there are no good ideas, as is often the case, return 'Fail!'.*/

public class WellOfIdeasEasyVersion {
    public static void main(String[] args) {
        System.out.println(well(new String[] {"good", "good", "good"}));
    }

    public static String well(String[] x) {

        int goodCount = 0;
        String result = "";

        for (int i = 0; i < x.length; i++) {
            if (x[i].equals("good")){
                goodCount ++;
            }
        }

        if (goodCount >= 1 && goodCount <= 2) {
            result = "Publish!";
        } else if (goodCount > 2) {
            result = "I smell a series!";
        } else result = "Fail!";

        return result;
    }
}
