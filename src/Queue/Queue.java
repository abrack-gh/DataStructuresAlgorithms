package Queue;


import java.util.Queue;

class queue {
    static final int SIZE = 3;
    int arr[] = new int[SIZE];

    int front = 0;
    int rear = 0;


    public void Enueue(int val) {

        if (rear == SIZE)
            System.out.println("Queue is full");
        else {
            arr[rear] = val;
            rear++;
        }

    }

    public void Dequeue() {
        if (front == rear)
            System.out.println("Queue is empty");
        else {
            System.out.println("Dequeued element= " + arr[front]);
            front++;
        }
    }
}


/*
public static void main(String args[])
    {
        Queue q = new Queue();

        System.out.println("Enqueuing element: "+10);
        q.enqueue(10);
        System.out.println("Enqueuing element: "+20);
        q.enqueue(20);
        System.out.println("Enqueuing element: "+30);
        q.enqueue(30);

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }


 */
