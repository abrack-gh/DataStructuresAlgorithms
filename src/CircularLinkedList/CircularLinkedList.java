package CircularLinkedList;

class Node
{
    int data;
    Node next;
}

public class CircularLinkedList
{

    public static void main(String args[])
    {


        Node head, middle, last;

        head = new Node();
        middle = new Node();
        last = new Node();

        head.data = 10;
        middle.data = 20;
        last.data = 30;

        head.next = middle;
        middle.next = last;
        last.next = head;

        System.out.println("Circular Linked List Elements Are:");
        Node temp = head;
        do
        {
            System.out.println(temp.data);
            temp = temp.next;
        }while(temp != head);
    }
}


