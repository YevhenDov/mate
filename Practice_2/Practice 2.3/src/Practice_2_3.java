import java.util.Random;

public class Practice_2_3 {

    Random random = new Random();
    int[] array = new int[createArray().length];

    public int[] createArray() {
        int[] arr = new int[100000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        return arr;
    }

    public void printArray(int[] arr) {
        System.out.println("\n===============");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] BubbleSort(int[] arr) {
        int[] array = new int[arr.length];
        System.arraycopy(arr, 0, array, 0, arr.length);

        int bubble;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    bubble = array[i];
                    array[i] = array[j];
                    array[j] = bubble;
                }
            }
        }
        return array;
    }

    public static void QuickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int middle = start + (end - start) / 2;
        int foundation = array[middle];

        int i = start;
        int j = end;

        while (i <= j) {
            while (array[i] < foundation) {
                i++;
            }
            while (array[j] > foundation) {
                j--;
            }

            if (i <= j) {
                int bubble = array[i];
                array[i] = array[j];
                array[j] = bubble;
                i++;
                j--;
            }
        }

        if (start < j) {
            QuickSort(array, start, j);
        }
        if (end > i) {
            QuickSort(array, i, end);
        }
    }

    public static void SelectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                int bubble = array[i];
                array[i] = array[minIndex];
                array[minIndex] = bubble;
            }
        }
    }

    public static void InsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; (j >= 0) && (array[i] < array[j]); j--) {
                array[j + 1] = array[j];
            }
        }
    }

    public static void CountSort(int[] array, int length) {
        int[] counter = new int[length];
        int index = 0;

        for (int i : array) {
            counter[i]++;
        }

        for (int i = 0; i < counter.length; i++) {
            while (counter[i] > 0) {
                array[index] = i;
                index++;
                counter[i]--;

            }
        }

    }

    public static void main(String[] args) {
        Practice_2_3 practice = new Practice_2_3();
        long startTime;
        long endTime;

        practice.printArray(array);
        startTime = System.currentTimeMillis();
        practice.QuickSort(practice.array, 0, practice.array.length - 1);
        endTime = System.currentTimeMillis();
        practice.printArray();
        System.out.println("\n\nquickSort time: " + (endTime - startTime));

        practice.printArray();
        startTime = System.currentTimeMillis();
        practice.BubbleSort(practice.array);
        endTime = System.currentTimeMillis();
        practice.printArray();
        System.out.println("\n\nbubbleSort time: " + (endTime - startTime));

        practice.createArray();
        practice.printArray();
        startTime = System.currentTimeMillis();
        practice.SelectionSort(practice.array);
        endTime = System.currentTimeMillis();
        practice.printArray();
        System.out.println("\n\nselectionSort time: " + (endTime - startTime));

        practice.createArray();
        practice.printArray();
        startTime = System.currentTimeMillis();
        practice.InsertionSort(practice.array);
        endTime = System.currentTimeMillis();
        practice.printArray();
        System.out.println("\n\ninsertionSort time: " + (endTime - startTime));

        practice.createArray();
        practice.printArray();
        startTime = System.currentTimeMillis();
        practice.CountSort(practice.array, practice.array.length);
        endTime = System.currentTimeMillis();
        practice.printArray();
        System.out.println("\n\ncountSort time: " + (endTime - startTime));
    }
}
