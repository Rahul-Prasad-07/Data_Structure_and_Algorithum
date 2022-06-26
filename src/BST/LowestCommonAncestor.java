package BST;

import java.util.Scanner;

class Node {
    int data;
    Node02 left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}
class BST {
    Node02 root;

    BST() {
        root = null;
    }

    // Method to construct a binary tree from the given array
    void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to insert a new key in BST
    Node02 insertRec(Node02 root, int key) {

        if (root == null) {
            root = new Node02(key);
            return root;
        }

        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);

        return root;
    }
    // Method to find the lowest common ancestor of two nodes - n1 and n2
    Node02 lca(Node02 node, int n1, int n2) {
        // cpmplete the code for this method
        if (node == null)
            return null;

        // If both n1 and n2 are smaller than root, then LCA lies in left
        if (node.data > n1 && node.data > n2)
            return lca(node.left, n1, n2);

        // If both n1 and n2 are greater than root, then LCA lies in right
        if (node.data < n1 && node.data < n2)
            return lca(node.right, n1, n2);

        return node;
    }
}


    public class LowestCommonAncestor {
        public static void main(String[] x) {
            BST bst = new BST();

            int size;
            Scanner sc = new Scanner(System.in);
            size = sc.nextInt();

            if(size>0){
                int[] elementsArr = new int[size];
                for(int i = 0; i < size; i++) {
                    elementsArr[i] = sc.nextInt();
                    bst.insert(elementsArr[i]);
                }

                int n1 = sc.nextInt();
                int n2 = sc.nextInt();

                Node02 lca = bst.lca(bst.root, n1, n2);
                System.out.print(lca.data);
            }
            else
                System.out.println("Size should be a positive integer");
        }
}
