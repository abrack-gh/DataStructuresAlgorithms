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

    public Node insert(Node root, int val) {
        if (root == null)
            return new Node(val);
        else if (root.key < val)
            root.right = insert(root.right, val);
        else if (root.key > val)
            root.left = insert(root.left, val);
        return root;
    }

    public Node removeNode(Node root, int val) {
        if (root == null)
            return null;
        if (root.key < val)
            root.right = removeNode(root.right, val);
        else if (root.key > val)
            root.left = removeNode(root.left, val);
        else {
            if (root.left == null && root.right == null)
                return null;
            else if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            else {
                int rightMin = getRightMin(root.right);
                root.key = rightMin;
                root.right = removeNode(root.right, rightMin);
            }
        }
        return root;
    }

    public int getRightMin(Node root) {
        Node temp = root;

        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.key;

    }


    public void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.println(root.key+ " ");
        inorder(root.right);
    }

    public boolean search(Node root, int key){
        if(root == null)
            return false;
        if(root.key == key)
            return true;
        if(root.key < key)
            return search(root.right,key);
        else
            return search(root.left,key);
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

        System.out.println("Searching for element: "+150);
        if(bst.search(bst.root,150) == true)
            System.out.println("Search found");
        else{
            System.out.println("Search not found");
        }
        System.out.println("Searching for element: "+500);
        if(bst.search(bst.root,500) == true)
            System.out.println("Search found");
        else{
            System.out.println("Search not found");
        }


        System.out.println("Before deletion: Inorder of traversal BST");
        bst.inorder(bst.root);

        int key = 100;
        System.out.println("Deleting element: "+key);
        bst.root = bst.removeNode(bst.root, key);

        System.out.println("After Deletion: Inorder Traversal of BST");
        bst.inorder(bst.root);

    }

}
