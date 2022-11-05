package site.telion.algoritms;

import java.util.Arrays;

public class QuickSortRecoursing {
    public static void main(String[] args) {
        int[] unsortedArray = new int[]{9, 4, 6, 5, 3, 5};
        System.out.println("Arrays.toString(unsortedArray) = " + Arrays.toString(unsortedArray));
        runQuickSort(unsortedArray);
        System.out.println("Arrays.toString(unsortedArray) = " + Arrays.toString(unsortedArray));
    }

    private static void runQuickSort(int[] unsortedArray) {
        quickSort(unsortedArray, 0, unsortedArray.length - 1);
    }

    public static void quickSort(int[] array, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(array, begin, end);

            quickSort(array, begin, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, end);
        }
    }

    private static int partition(int[] array, int begin, int end) {
        int pivot = array[end];
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                swapElements(array, i, j);
            }
        }

        swapElements(array, i + 1, end);
        return i + 1;
    }

    private static void swapElements(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
