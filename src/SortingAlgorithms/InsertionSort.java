package SortingAlgorithms;

//Begin at index 1, take value within index 1 and place in temp storage to hold it.
//        Examine elements to the left. If any element is larger than what is within temp.
//If the element is larger than the left, shift it to the right. If its less than what is in temp,
// place it in open index.

// if element at index 1 < index 0, place index 1 in index 0.

public class InsertionSort {

    public static void main(String[] args){

        int array [] = {4, 5, 1, 9, 8, 3};

        insertionSort(array);

        for(int i : array){
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] array) {

        for(int i = 0; i < array.length; i++){

            int temp = array[i];
            int j = i - 1;

            while(j >= i && array[j] > temp ){
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = temp;
        }

    }
}
