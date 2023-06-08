import java.util.Random;
import java.util.random.RandomGenerator;
public class tasks {
    public static void main(String[] args) {
//1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        Random rand = new Random();
        int i = rand.nextInt(0, 2000);
        System.out.println(i);
    }
}
