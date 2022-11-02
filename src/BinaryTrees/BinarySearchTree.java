package BinaryTrees;

class Node{
    int key;
    Node left;
    Node right;

    Node(int val){
        key = val;
        left = null;
        right = null;
    }
}

public class BinarySearchTree {

    Node root;

    public Node insert(Node root, int val){
        if(root==null)
            return new Node(val);
        else if(root.key < val)
            root.right = insert(root.right,val);
        else if(root.key > val)
            root.left = insert(root.left,val);
        return root;
    }

    public void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.println(root.key+ " ");
        inorder(root.right);
    }

    public static void main (String args[]){
        BinarySearchTree bst = new BinarySearchTree();

        System.out.println("Inserting element: "+100);
        bst.root = bst.insert(bst.root, 100);
        System.out.println("Inserting element: "+500);
        bst.root = bst.insert(bst.root, 500);
        System.out.println("Inserting element: "+30);
        bst.root = bst.insert(bst.root, 30);
        System.out.println("Inserting element: "+252);
        bst.root = bst.insert(bst.root, 252);
        System.out.println("Inserting element: "+3);
        bst.root = bst.insert(bst.root, 3);
        System.out.println("Inserting element: "+54);
        bst.root = bst.insert(bst.root, 54);

        System.out.println("Inorder traversal of above BST");
        bst.inorder(bst.root);


    }

}
