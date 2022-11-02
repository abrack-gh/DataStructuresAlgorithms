package LinkedList;

class Node_add_end
{
    int data;
    Node next;
}

public class LinkedListAddEnd {

    Node head;

    public void addLast(int val){

        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;

        if(head == null)
            head = newNode;
        else{
            Node lastNode = head;
            while(lastNode.next !=null)
            {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }
}
