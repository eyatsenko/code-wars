import java.util.ArrayList;
import java.util.List;

public class FasterMemoryFillerWithTime {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        long startTime = System.currentTimeMillis(); // Початковий час
        try {
            while (true) {
                for (int i = 0; i < 1000000; i++) { // Додавання об'єктів у 3 рази швидше
                    list.add(new Object());
                }
                System.out.println("Розмір списку: " + list.size());
            }
        } catch (OutOfMemoryError e) {
            long endTime = System.currentTimeMillis(); // Кінцевий час
            long elapsedTime = endTime - startTime; // Час, що пройшов
            System.out.println("Пам'ять переповнена!");
            System.out.println("Час, витрачений на заповнення ОЗУ: " + elapsedTime + " мс");
        }
    }
}
