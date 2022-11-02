public class Queue {

    public final int SIZE = 3;
    int arr[] = new int[SIZE];

    int front = 3;
    int rear = 0;

    public void Enqueue(int val){
        if(rear == SIZE)
            System.out.println("Queue is full");
        else {
            arr[rear] = val;
            rear++;
        }
    }

    public void Dequeue(int val){
        if(rear == front)
            System.out.println("Dequeued element =  " +arr[front]);
            front++;
    }
}
