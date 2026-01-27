package dsa.tree;

public class BinarySearchTree {

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root = null;

    
    public void insert(int data) {
        root = insertRec(root, data);
        System.out.println("Inserted: " + data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data)
            root.left = insertRec(root.left, data);
        else
            root.right = insertRec(root.right, data);

        return root;
    }

    
    public void inorder() {
        System.out.print("Inorder traversal: ");
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

   
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        bst.inorder();
    }
}
