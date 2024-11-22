package laboratory3.ex5;

import java.util.Arrays;

// Class: Sort
public class Sort {
    // Generic swap method
    static <E> void swap(E[] array, int i, int j) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Generic Bubble Sort
    static <E extends Comparable<E>> void bubbleSort(E[] array) {
        boolean swapped;
        int n = array.length;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    // Generic Merge Sort
    static <E extends Comparable<E>> void mergeSort(E[] array) {
        if (array.length <= 1) return;

        int mid = array.length / 2;
        E[] left = Arrays.copyOfRange(array, 0, mid);
        E[] right = Arrays.copyOfRange(array, mid, array.length);

        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);
    }

    // Helper method for merging two arrays
    private static <E extends Comparable<E>> void merge(E[] array, E[] left, E[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}

// Class: Chocolate

// Class: Time (for simplicity, hours and minutes)

// Test Class

