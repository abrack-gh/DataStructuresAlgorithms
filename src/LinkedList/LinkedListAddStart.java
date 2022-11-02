package LinkedList;

class Node_add
{
    int data;
    Node next;
}

public class LinkedListAddStart
{
    Node head;

    public void addFirst(int val)
    {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = head;

        head = newNode;
    }

    public void print()
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String args[])
    {

        LinkedListAddStart list = new LinkedListAddStart();

        System.out.println("Inserting Element: "+10);
        list.addFirst(10);
        System.out.println("Inserting Element: "+20);
        list.addFirst(20);
        System.out.println("Inserting Element: "+30);
        list.addFirst(30);
        System.out.println("Inserting Element: "+40);
        list.addFirst(40);

        System.out.println("The LinkedList Elements Are:");
        list.print();
    }
}
