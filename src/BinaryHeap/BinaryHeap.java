package BinaryHeap;


import static java.util.Arrays.swap;

class BinaryHeap
{
    public void BuildHeap(int arr[],int size)
    {
        int i = size / 2;
        for(; i >= 0; i--)
            Heapify(arr,i,size);
    }

    //Delete max element in heap

    void DeleteMax(int arr[], int index, int size){
        swap(arr[0],arr[size]);
        System.out.println("Max = "+arr[size]);
        size = size - 1;
        Heapify(arr,0,size);
    }

    void Heapify(int arr[],int index,int size)
    {
        int left = 2 * index + 1;
        int right = left + 1;
        int max = index;
        if(left <= size && arr[left] > arr[max])
            max = left;
        if(right <= size && arr[right] > arr[max])
            max = right;
        if(index != max)
        {
            int temp = arr[max];
            arr[max] = arr[index];
            arr[index] = temp;
            Heapify(arr, max, size);
        }
    }

    public void print(int arr[], int size){
    for(int i = 0; i < size; i++)
        System.out.println(arr[i]+" ");
    System.out.println();
    }


    public static void main(String args[]){
        BinaryHeap obj = new BinaryHeap();
        int arr[] = {10, 20, 40, 30, 80, 60, 50};
        System.out.println("Array elements: ");
        obj.print(arr, arr.length);
        System.out.println("Constructing heap...");
        obj.BuildHeap(arr, arr.length -1);
        System.out.println("Array elements are...");
        obj.print(arr, arr.length);
    }

}
