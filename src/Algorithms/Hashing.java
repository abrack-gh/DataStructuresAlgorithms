package Algorithms;

public class Hashing {

    public final int SIZE = 5;
    int arr[] = new int[SIZE];

    public void Hashtable() {
        int i = 0;
        for (i = 0; i < SIZE; i++)
            arr[i] = -1;
    }

    int insert(int value) {
        int key = value % SIZE;
        int index = key;

        while (arr[index] != -1) {
            index = (index + 1) % SIZE;

            if (index == key) {
                System.out.println("Hash table full");
            }
        }

        arr[index] = value;
        return 1;
    }

    public static void main(String args[]) {
        int value = 10;

        Hashing obj = new Hashing();

    }

    int del(int value) {
        int key = value % SIZE;
        int index = key;

        while (arr[index] != value) {
            index = (index + 1) % SIZE;

            if (index == key)
                return 0;

            arr[index] = -1;

            return 1;
        }
        return key;
    }



    int search(int value){
        int key = value % SIZE;
        int index = key;

        while(arr[index] != value) {
            index = (index + 1) % SIZE;

            if (index == key)
                return 0;
        }
        return 1;
        }

}

