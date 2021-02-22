public class Main {

    public static void main(String[] args) {

        long[] array = new long[]{54, 42, 8, 41, 34, 53, 14, 24, 53, 42, 0, 87, 55, 36, 42};

        ThanosSort.sort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
