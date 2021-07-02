/*
Let's play! You have to return which player won! In case of a draw return Draw!.
Examples:
rps('scissors','paper') // Player 1 won!
rps('scissors','rock') // Player 2 won!
rps('paper','paper') // Draw!

scissors - ножницы

 */
public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println(rps("paper", "rock"));
    }

    public static String rps(String p1, String p2) {
        String result = "Player ";

        if (p1.equals(p2)) {
            result = "Draw!";
        } else if (p1.equals("scissors") && p2.equals("paper")) {
            result += "1 won!";
        } else if (p1.equals("scissors") && p2.equals("rock")) {
            result += "2 won!";
        } else if (p1.equals("paper") && p2.equals("rock")) {
            result += "1 won!";
        } else if (p1.equals("paper") && p2.equals("scissors")) {
            result += "2 won!";
        } else if (p1.equals("rock") && p2.equals("scissors")){
            result += "1 won!";
        } else if (p1.equals("rock") && p2.equals("paper")){
            result += "2 won!";
        }

        return result;
    }
}
