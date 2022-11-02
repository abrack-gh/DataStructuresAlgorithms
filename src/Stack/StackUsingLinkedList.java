package Stack;

class Node{
    int data;
    Node next;
}

public class StackUsingLinkedList {

    Node head = null;

    public void push(int val){
        Node newNode = new Node();
        newNode.data = val;

        newNode.next = head;
        head = newNode;
    }

    public void pop(){
        if(head == null)
            System.out.println("Stack is empty");
         else {
                System.out.println("Popped element= "+head.data);

                head = head.next;
            }
        }

}
