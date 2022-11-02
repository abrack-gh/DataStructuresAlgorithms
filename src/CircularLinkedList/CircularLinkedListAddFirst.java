package CircularLinkedList;


class Node
{
    int data;
    Node next;
}

public class CircularLinkedListAddFirst
{
    Node head;

    public void addFirst(int val)
    {
        Node newNode = new Node();
        newNode.data = val;

        if(head == null)
        {
            newNode.next = newNode;
            head = newNode;
        }
        else
        {
            Node last = head;

            while(last.next != head)
            {
                last = last.next;
            }

            last.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int val){
        Node newNode = new Node();
        newNode.data = val;

        if(head == null){
            newNode.next = newNode;
            head = newNode;
        } else {
            Node last = head;
            while(last.next != head){
                last = last.next;
            }
            last.next = newNode;
            newNode.next = head;
        }
    }

    public void print()
    {
        if(head == null)
            return;

        Node temp = head;

        do
        {
            System.out.println(temp.data);
            temp = temp.next;
        }while(temp != head);
    }

   // SEARCH
    /* public boolean search(int key){
        if(head == null)
            return false;

        Node temp = head;

        do {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }while(temp != head);

        return false;
        }
    } */

    //delete key

    /* public void delete(int key){
        if(head == null)
            return;
        if(head.data == key && head.next == head)
        {
            head = null;
        }
        else if(head.data == key)
        {
            Node last = head;
            while(last.next != head)
            {
                last = last.next;
            }
            last.next = head.next;
            head = head.next;
        } else
        {
            {
                Node current = head;
                while(current.next != head)
                {
                    if(current.next.data == key)
                    {
                        current.next = current.next.next;
                        break;
                    }
                    current = current.next;
                }
            }
        }
    }

    */
    public static void main(String args[])
    {

        CircularLinkedList list = new CircularLinkedList();

        System.out.println("Inserting Element: "+10);
       //  list.addFirst(10);
        // list.addLast(10);
        System.out.println("Inserting Element: "+20);
       // list.addFirst(20);
        // list.addLast(20);
        System.out.println("Inserting Element: "+30);
       // list.addFirst(30);
        // list.addLast(30);

        System.out.println("Circular Linked List Elements Are:");
        list.print();
    }
}