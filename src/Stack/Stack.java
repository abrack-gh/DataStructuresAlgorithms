package Stack;

public class Stack {

    static final int SIZE = 3;
    int arr[] = new int[SIZE];
    int top = -1;

    // this will add to stack if not full

    public void push(int val){

        if(top == SIZE - 1)
            System.out.println("Stack full");
        else{
            ++top;
            arr[top] = val;
        }
    }

    // this will remove from top of stack

    public void pop(){
        if(top == 1)
            System.out.println("Stack is empty");
        else {
            System.out.println("Popped element = " +arr[top]);
            top--;
        }
    }

}
