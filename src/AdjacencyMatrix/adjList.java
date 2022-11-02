package AdjacencyMatrix;

class Node{
    int data;
    Node next;
}

public class adjList {

    static final int V = 5;
    Node adjList[] = new Node[V];

    public void addEdge(int src, int dest) {
        Node newNode = new Node();
        newNode.data = dest;
        newNode.next = null;

        if (adjList[src] == null)
            adjList[src] = newNode;
        else {
            Node last = adjList[src];

            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }

    }


   /* void removeEdge(int src, int dest){
        if(adjList[src] == null)
            return;

        if(adjList[src].data == dest){
            adjList[src] = adjList[src].next;
        }
        else {
            Node current = adjList[src], temp;
            while(current.next != null){
                if(current.next.data == dest){
                    temp = current.next;
                    current.next = temp.next;
                    break;
                }
                else
                    current = current.next;
            }
        }

    }
*/
    public void printGraph(){
        int i;
        for(i = 0; i < V; i++){
            Node temp = adjList[i];
            System.out.println("adjList["+i+"]->");
            while(temp != null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String args[]){
        adjList obj = new adjList();

        obj.addEdge(0,1);
        obj.addEdge(0,2);
        obj.addEdge(0,3);
        obj.addEdge(1,3);
        obj.addEdge(1,4);
        obj.addEdge(2,3);
        obj.addEdge(3,4);

        System.out.println("Adjacency list representation of graph.");
        obj.printGraph();
    }
}
