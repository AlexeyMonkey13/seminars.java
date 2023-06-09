import com.sun.source.tree.WhileLoopTree;

import java.awt.dnd.DragGestureListener;
import java.util.Random;
import java.util.random.RandomGenerator;
public class tasks {
    public static void main(String[] args) {
//1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        Random rand = new Random();
        int i = rand.nextInt(0, 2000);
        System.out.println(i);
        // Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

        int n = Integer.toBinaryString(i).length() - 1;
        System.out.println("Номер старшего значения бита n =  " + n);

        // Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        short count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++){
            if ( j % n == 0) {
                count++;
            }
        }
        System.out.println("длина массива m1 =  "+ count);
        int[] m1 = new int [count];
        count = 0;

        for (int j = i; j < Short.MAX_VALUE; j++){
            if (j % n == 0) {
                m1[count++] = j;
            }
        }

        count = 0;
        //второй массив;
        for (int j = Short.MIN_VALUE; j < i; j++){
            if ( j % n != 0) {
                count++;
            }
        }
        System.out.println("длина массива m2 =  "+ count);
        int[] m2 = new int [count];
        count = 0;

        for (int j = Short.MIN_VALUE; j < i; j++){
            if (j % n != 0) {
                m2[count++] = j;
            }
        }
    }
}
