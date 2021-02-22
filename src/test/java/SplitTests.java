import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Класс содержит набор сцентариев для тестирования метода, отвечающего за перераспределение элементов в массиве
 * в зависимости от среднего арифметического. Метод является частью алгоритма сортировки Таноса.
 * Входные данные формируются прямой инициализацией массива значениями.
 */

public class SplitTests {

    @Test
    public void simpleTest() {
        long[] array = new long[]{ 42, 8, 41, 34, 53, 144, 24, 53, 42, 0, 87, 55, 42};
        int border = ThanosSort.split(array, 0, array.length - 1);
        Assertions.assertEquals(8, border);
    }

    @Test
    public void singleNumberTest() {
        long[] array = new long[]{42};
        int border = ThanosSort.split(array, 0, array.length - 1);
        Assertions.assertEquals(1, border);
    }

    @Test
    public void equalNumbersTest() {
        long[] array = new long[]{42, 42, 42, 42, 42};
        int border = ThanosSort.split(array, 0, array.length - 1);
        Assertions.assertEquals(5, border);
    }

    @Test
    public void zeroTest() {
        long[] array = new long[]{0};
        int border = ThanosSort.split(array, 0, array.length - 1);
        Assertions.assertEquals(1, border);
    }

    @Test
    public void zeroesTest() {
        long[] array = new long[]{0, 0, 0, 0, 0, 0};
        int border = ThanosSort.split(array, 0, array.length - 1);
        Assertions.assertEquals(6, border);
    }

    @Test
    public void maxIntTest() {
        long[] array = new long[]{2147483647, 6984564, 4534, 2147483647, 2147483647, 2147483644};
        int border = ThanosSort.split(array, 0, array.length - 1);
        Assertions.assertEquals(2, border);
    }

    @Test
    public void maxLongTest() {
        long[] array = new long[]{9223372036853775807L, 698658114564L, 45367856854L, 9223372036854775807L,
                9223720364775807L, 9223372036854775807L, 2147483644L};
        int border = ThanosSort.split(array, 0, array.length - 1);
        Assertions.assertEquals(4, border);
    }

    @Test
    public void intAndLongTest() {
        long[] array = new long[]{922337, 69864584564L, 45, 9223372036854775807L, 1673, 214753483644L, 2147483647};
        int border = ThanosSort.split(array, 0, array.length - 1);
        Assertions.assertEquals(6, border);
    }

    @Test
    public void emptyArrayTest() {
        long[] array = new long[]{};
        int border = ThanosSort.split(array, 0, array.length - 1);
        Assertions.assertEquals(0, border);
    }
}
