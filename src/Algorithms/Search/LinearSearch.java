package Algorithms.Search;

public class LinearSearch {

    public int linearSearch(int arr[], int size, int key) {
        int i;

        for (i = 0; i < size; i++)
            if (arr[i] == key)
                return 1;

        return 0;
    }

    public static void main(String args[]){
        int arr[] = {80, 20, 54, 245, 58, 26, 50, 0, 3};
        int key = 50;

        LinearSearch obj = new LinearSearch();

        System.out.println("Searching for element: " + key);

        if(obj.linearSearch(arr, arr.length,key) == 1)
            System.out.println("Object found");
        else
            System.out.println("Object not found");
        }




}
