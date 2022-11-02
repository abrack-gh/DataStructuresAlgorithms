package LinkedList;

class Node_search {

    int data;
    Node next;
}

public class LinkedListSearch {

    Node head;

    public boolean search(int key){
        Node temp = head;
        while(temp != null)
        {
            if(temp.data == key)
                return true;
            temp = temp.next;
            }
        return false;
        }
    }

