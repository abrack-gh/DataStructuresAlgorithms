package LinkedList;

class Node_remove{
    int data;
    Node next;
}

public class LinkedListRemove {


    Node head;

    public void delete(int key){
        if(head.data == key){
            head = (head).next;
        }
        else {
            Node temp = head;
            while(temp.next != null)
            {
                if(temp.next.data == key)
                {
                    temp.next = temp.next.next;
                    break;
                }
                else temp = temp.next;
                }
            }
        }

}
