import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class ThanosSortTests {

    @Test
    public void simpleTest() {
        long[] array = new long[]{5472, 42, 8, 41, 34, 53, 144, 24, 53, 42, 0, 87, 55, 36869, 42};
        long[] expected = new long[]{0, 8, 24, 34, 41, 42, 42, 42, 53, 53, 55, 87, 144, 5472, 36869};
        ThanosSort.sort(array, 0, array.length - 1);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void sortedArrayTest() {
        long[] array = new long[]{0, 8, 24, 34, 41, 42, 42, 42, 53, 53, 55, 87, 144, 5472, 36869};
        long[] expected = new long[]{0, 8, 24, 34, 41, 42, 42, 42, 53, 53, 55, 87, 144, 5472, 36869};
        ThanosSort.sort(array, 0, array.length - 1);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void singleNumberTest() {
        long[] array = new long[]{42};
        long[] expected = new long[]{42};
        ThanosSort.sort(array, 0, array.length - 1);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void equalNumbersTest() {
        long[] array = new long[]{42, 42, 42, 42, 42};
        long[] expected = new long[]{42, 42, 42, 42, 42};
        ThanosSort.sort(array, 0, array.length - 1);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void zeroTest() {
        long[] array = new long[]{0};
        long[] expected = new long[]{0};
        ThanosSort.sort(array, 0, array.length - 1);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void zeroesTest() {
        long[] array = new long[]{0, 0, 0, 0, 0, 0};
        long[] expected = new long[]{0, 0, 0, 0, 0, 0};
        ThanosSort.sort(array, 0, array.length - 1);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void maxIntTest() {
        long[] array = new long[]{2147483647, 6984564, 4534, 2147483647, 2147483647, 2147483644};
        long[] expected = new long[]{4534, 6984564, 2147483644, 2147483647, 2147483647, 2147483647};
        ThanosSort.sort(array, 0, array.length - 1);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void maxLongTest() {
        long[] array = new long[]{9223372036853775807L, 698658114564L, 45367856854L, 9223372036854775807L,
                9223720364775807L, 9223372036854775807L, 2147483644L};

        long[] expected = new long[]{2147483644L, 45367856854L, 698658114564L, 9223720364775807L,
                9223372036853775807L, 9223372036854775807L, 9223372036854775807L};

        ThanosSort.sort(array, 0, array.length - 1);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void intAndLongTest() {
        long[] array = new long[]{922337, 69864584564L, 45, 9223372036854775807L, 1673, 214753483644L, 2147483647};
        long[] expected = new long[]{45, 1673, 922337, 2147483647, 69864584564L, 214753483644L, 9223372036854775807L};
        ThanosSort.sort(array, 0, array.length - 1);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void normalTest() {
        long[] array = new long[]{54, 0, 54843, 42, 343682235238L, 2147483647, 46223, 0, 1, 1, 41,
                9223372036854775807L, 48494, 2636, 1351308532562L, 1, 34, 484846346, 53, 14, 4526, 24, 53,
                563485, 42, 0, 453, 3473452, 87, 345345464, 55, 36, 9223372036854775807L, 3462, 2147483647, 42};

        long[] expected = new long[]{0, 0, 0, 1, 1, 1, 14, 24, 34, 36, 41, 42, 42, 42, 53, 53, 54, 55, 87,
                453, 2636, 3462, 4526, 46223, 48494, 54843, 563485, 3473452, 345345464, 484846346, 2147483647,
                2147483647, 343682235238L, 1351308532562L, 9223372036854775807L, 9223372036854775807L};

        ThanosSort.sort(array, 0, array.length - 1);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void partOfArrayTest() {
        long[] array = new long[]{5472, 42, 8, 41, 34, 53, 144, 24, 53, 42, 0, 87, 55, 36869, 42};
        long[] expected = new long[]{5472, 42, 0, 8, 24, 34, 41, 42, 53, 53, 144, 87, 55, 36869, 42};
        ThanosSort.sort(array, 2, array.length - 5);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void bigArrayTest() {
        long[] array = RandomArraysGenerator.getRandomArrayLongs(10000000);
        long[] expected = array.clone();
        Arrays.sort(expected);
        ThanosSort.sort(array, 0, array.length - 1);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void emptyArrayTest() {
        long[] array = new long[]{};
        long[] expected = new long[]{};
        ThanosSort.sort(array, 0, array.length - 1);
        Assertions.assertArrayEquals(expected, array);
    }
}
