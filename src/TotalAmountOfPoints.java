/*
Our football team finished the championship. The result of each match look like "x:y". Results of all matches are recorded in the collection.

For example: ["3:1", "2:2", "0:1", ...]

Write a function that takes such collection and counts the points of our team in the championship. Rules for counting points for each match:
    if x>y - 3 points
    if x<y - 0 point
    if x=y - 1 point

Notes:
    there are 10 matches in the championship
    0 <= x <= 4
    0 <= y <= 4

*/


public class TotalAmountOfPoints {
    public static void main(String[] args) {
        System.out.println(points(new String[] {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"}));
    }

    public static int points(String[] games) {
        int [] leftNumber = new int[games.length];
        int [] rightNumber = new int[games.length];
        int count = 0;
        String [] games2 = new String[games.length];

        for (int i = 0; i < games.length; i++) {
            games2[i] = games[i].replaceAll(":","");
        }

        for (int i = 0; i < games.length; i++) {
            leftNumber[i] = Integer.parseInt(games2[i])/10;
            rightNumber[i] = Integer.parseInt(games2[i])%10;
        }

        for (int k = 0; k < games2.length; k++) {
            if (leftNumber[k] > rightNumber[k]) {
                count += 3;
            } else if (leftNumber[k] < rightNumber[k]) {
                count += 0;
            } else if (leftNumber[k] == rightNumber[k]) {
                count += 1;
            }
        }
        return count;
    }
}
