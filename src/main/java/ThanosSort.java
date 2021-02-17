public class ThanosSort {

    public static void sort(long[] array, int leftBorder, int rightBorder) {

        if (leftBorder < rightBorder) {
            int border = split(array, leftBorder, rightBorder);
            if (border > leftBorder && border <= rightBorder) {
                sort(array, leftBorder, border - 1);
                sort(array, border, rightBorder);
            }
        }
    }

    public static int split(long[] array, int leftBorder, int rightBorder) {

        double average = 0;
        for (int i = leftBorder; i <= rightBorder; i++) {
            average += array[i];
        }
        average /= (rightBorder - leftBorder + 1);

        long[] tempArray = new long[rightBorder - leftBorder + 1];
        int leftIndex = 0;
        int rightIndex = tempArray.length - 1;
        int border = leftBorder;

        for (int i = leftBorder; i <= rightBorder; i++) {
            if (array[i] <= average) {
                tempArray[leftIndex] = array[i];
                ++leftIndex;
                ++border;
            } else {
                tempArray[rightIndex] = array[i];
                --rightIndex;
            }
        }

        leftIndex = 0;
        for (int i = leftBorder; i <= rightBorder; i++) {
            array[i] = tempArray[leftIndex];
            ++leftIndex;
        }

        return border;
    }
}
