package Merge;


public class MergeSort {

    //Merge sort is a divide and conquer algorithm.
    //Pass an array as an argument to a merge sort function. This will divide array into 2 sets. (L/R array)
    //This is 2 sub arrays and the original array will be split into these 2 sub arrays.
    // recursive function. At the end of the function, call MergeSort again.
    //Time complexity: O(n log n) - quasilinear time.

    public static void main(String[] args) {
        int[] array = {8, 2, 5, 2, 0, 8, 6};

        mergeSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void mergeSort(int[] array) {

        int length = array.length;
        if (length <= 1) return; // base case. Divides array into 2 each time until array has only one case.

        int middle = length / 2;

        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; //left array
        int j = 0; // right array

        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);

    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; //indices

        // check condition for merging

        while (l < leftSize && r < rightSize) {
            if(leftArray[l] < rightArray[r]){ //compare left number to right number
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                array[i] = rightArray[r];
                i++;
                r++;
            }

        }
        while(l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }

    }
}
