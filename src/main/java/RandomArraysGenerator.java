import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Random;

/**
 * Класс, позволяющий получить массив из псевдослучайных значений Integer или Double.
 * Требуется для генерации входных данных в нескольких тестах.
 */

public class RandomArraysGenerator {

    public static int[] getRandomArrayInts(int size) {
        int[] array = new int[size];
        Random random = new Random();
        OptionalInt temp;

        for (int i = 0; i < size; i++) {
            temp = random.ints(0, Integer.MAX_VALUE).findFirst();
            if (temp.isPresent()) {
                array[i] = temp.getAsInt();
            } else {
                --i;
            }

        }
        return array;
    }

    public static long[] getRandomArrayLongs(int size) {
        long[] array = new long[size];
        Random random = new Random();
        OptionalLong temp;

        for (int i = 0; i < size; i++) {
            temp = random.longs(0, Long.MAX_VALUE).findFirst();
            if (temp.isPresent()) {
                array[i] = temp.getAsLong();
            } else {
                --i;
            }
        }
        return array;
    }
}
