package BST;

import java.util.Scanner;

public class CountLeafNodes {
    public static class Node
    {
        int data;
        Node left, right;

        public Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

    public static class BinaryTree {
        Node root;

        BinaryTree() {
            root = null;
        }

        // Function to insert in the BST
        void insert(int key) {
            root = insertRec(root, key);
        }

        // A recursive function to insert a new key in BST
        Node insertRec(Node root, int key) {

            if (root == null) {
                root = new Node(key);
                return root;
            }

            if (key < root.data)
                root.left = insertRec(root.left, key);
            else if (key > root.data)
                root.right = insertRec(root.right, key);

            return root;
        }

        int getLeafCount() {
            return getLeafCount(root);
        }

        int getLeafCount(Node node) {
            // complete the code here
            if (node == null)
                return 0;
            if (node.left == null && node.right == null)
                return 1;
            else
                return getLeafCount(node.left) + getLeafCount(node.right);
        }
    }
    public static void main(String[] args)
    {

        BinaryTree tree = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();

        if(size<= 0){
            System.out.println("Size should be a positive integer");
        }

        else{
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++){
                elementsArr[i] = sc.nextInt();
                tree.insert(elementsArr[i]);
            }
            System.out.println(tree.getLeafCount());
        }
    }
}
