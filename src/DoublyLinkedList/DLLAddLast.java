package DoublyLinkedList;

class Node1{
    Node prev;
    int data;
    Node next;
}

public class DLLAddLast {

    Node head;

    public void addLast(int val){
        Node newNode = new Node();
        newNode.data = val;

        if(head == null)
        {
            newNode.prev = null;
            newNode.next = null;
            head = newNode;
        }
        else
        {
            Node last = head;

            while(last.next != null)
            {
                last = last.next;
            }
            last.next = newNode;
            newNode.prev = last;
            newNode.next = null;
        }
    }

    public void delete(int key) //delete a node at the head
    {
        if(head == null)
            return;

        Node temp = head;

        while(temp != null && temp.data != key)
        {
            temp = temp.next;
        }

        if(temp == null)
            System.out.println("Key Not Found");
        else if(temp == head)
        {
            head = head.next;
            head.prev = null;
        }
        else if(temp.next == null)
            temp.prev.next = null;
        else
        {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    public void print()
    {
        Node temp = head;
        Node last = null;

        System.out.println("Forward Traversal");
        while(temp != null)
        {
            System.out.println(temp.data);
            if(temp.next == null)
                last = temp;
            temp = temp.next;
        }

        System.out.println("Backward Traversal");
        temp = last;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }

    public boolean search(int key) //searches for key
    {
        Node temp = head;

        while(temp != null)
        {
            if(temp.data == key)
                return true;
            temp = temp.next;
        }

        return false;
    }

    public static void main(String args[])
    {

        DLLAddLast list = new DLLAddLast();

        System.out.println("Inserting Element: "+10);
        list.addLast(10);
        System.out.println("Inserting Element: "+20);
        list.addLast(20);
        System.out.println("Inserting Element: "+30);
        list.addLast(30);
        System.out.println("Inserting Element: "+40);
        list.addLast(40);
        System.out.println("Inserting element: "+500);
        list.addLast(500);

        list.print();
    }
}
