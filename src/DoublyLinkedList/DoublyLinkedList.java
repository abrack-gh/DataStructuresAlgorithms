package DoublyLinkedList;

class Node{
    Node prev;
    int data;
    Node next;
}

public class DoublyLinkedList {

    Node head;

    public static void main(String[] args) {
        Node head, middle, last;

        head = new Node();
        middle = new Node();
        last = new Node();

        head.data = 10;
        middle.data = 20;
        last.data = 30;

        head.prev = null;
        head.next = middle;
        middle.prev = head;
        middle.next = last;
        last.prev = middle;
        last.next = null;

        Node temp = head;

        System.out.println("Forward traversal");
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

        temp = last;
        System.out.println("Backward traversal");
        while(temp !=null){
            System.out.println(temp.data);
            temp = temp.prev;
        }

    }
}
