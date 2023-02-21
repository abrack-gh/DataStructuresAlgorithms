package Algorithms;

public class OpenHashing {

    class Node {
        int data;
        Node next;
    }

    final int size = 7;
    Node chain[] = new Node[size];


    public void insert(int value) {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;

        int key = value % size;

        if (chain[key] == null)
            chain[key] = newNode;
        else {
            Node temp = chain[key];

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    public void print() {
        int i;

        for (i = 0; i < size; i++) {
            Node temp = chain[i];
            System.out.printf("chain[%d]-->", i);
            while (temp != null) {

                System.out.printf("%d -->", temp.data);
                temp = temp.next;
            }

            System.out.printf("null\n");
        }
    }

    int search(int value) {
        int key = value % size;
        Node temp = chain[key];
        while (temp) {
            if (temp.data == value)
                return 1;
            temp = temp.next;
        }
        return 0;

    }

    int delete(int value){
        int key = value % size;
        Node temp = chain[key];

        if(temp != null){
            if(temp.data == value) {
                temp = temp.next;
                chain[key] = temp;
                return 1;
            }
            else{
                while(temp.next != null){
                    if(temp.next.data == value){
                        temp.next = temp.next.next;
                        return 1;
                    } else
                        temp = temp.next;
                }
            }
        }
        return 0;



    }


}
