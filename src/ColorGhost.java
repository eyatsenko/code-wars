import java.util.Random;

public class ColorGhost {
    public static void main(String[] args) {

    }

    public class Ghost {
        private String color;
        private final Random random = new Random();

        public Ghost() {
            int colorNumber = random.nextInt(4);
            switch (colorNumber) {
                case 0:
                    color = "white";
                    break;
                case 1:
                    color = "red";
                    break;
                case 2:
                    color = "purple";
                    break;
                case 3:
                    color = "yellow";
                    break;
            }
        }

        public String getColor() {
            return color;
        }
    }
}
