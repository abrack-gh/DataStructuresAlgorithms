package Algorithms.Search;

// Binary Search considers a sorted array and divides it each time until the key is located.

public class BinarySearch {

    int BinarySearch(int arr[], int start, int end, int key){
        int mid;
        while(start <= end){
            mid = (start + end)/2;

            if(arr[mid] == key)
                return 1;
            if(arr[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return 0;
    }

    public static void main(String args[]){
        int arr[] = {10, 20, 24, 32, 39, 45, 50, 52, 58, 70};
        int key = 45;

        BinarySearch obj = new BinarySearch();

        System.out.println("Searching for element: "+key);

        if(obj.BinarySearch(arr, 0, arr.length - 1, key) == 1)
            System.out.println("Search found");
        else
            System.out.println("Search not found");

        key = 150;

        System.out.println("Searching for element: "+key);

        if(obj.BinarySearch(arr, 0, arr.length - 1, key) == 1)
            System.out.println("Search found");
        else
            System.out.println("Search not found");

    }

}
