public class DuckDuckGoose {
    public static void main(String[] args) {
        System.out.println(duckDuckGoose(new String[]{"a", "b", "c"}, 10));
    }

    public static String duckDuckGoose(String[] players, int goose) {
        if (goose <= players.length) {
            return players[goose - 1];
        } else {
            while (goose > players.length) {
                goose -= players.length;
            }
            return players[goose - 1];
        }
    }
}
