package Algorithms;

import java.util.Collections;

import static java.util.Collections.swap;

public class SelectionSort {

    public int selectionSort(int arr[], int size) {
        int i, j;

        for (i = 0; i < size - 1; i++) {
            for (j = i + 1; j < size; j++) {
                if (arr[i] > arr[j])
                    swap(Collections.singletonList(arr), i, j);
            }
        }

        return i;

    }
}
