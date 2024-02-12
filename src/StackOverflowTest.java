public class StackOverflowTest {
    public static void main(String[] args) {
        recursiveMethod(0);
    }

    public static void recursiveMethod(int counter) {
        System.out.println("Counter: " + counter);
        recursiveMethod(counter + 1);
    }
}
