package BST;
import java.util.*;

class Node02 {
    int data;
    Node02 left, right;

    Node02(int value) {
        data = value;
        left = right = null;
    }
}

class BinaryTree {
    Node02 root;

    BinaryTree() {
        root = null;
    }

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
    //Function to print nodes that dont have a sibling
    void printSingles(Node02 node) {
        // complete this function
        if (node == null)
            return;

        // If this is an internal node, recur for left
        // and right subtrees
        if (node.left != null && node.right != null)
        {
            printSingles(node.left);
            printSingles(node.right);
        }
        // If left child is NULL and right
        // is not, print right child
        // and recur for right child
        else if (node.right != null)
        {
            System.out.print(node.right.data + " ");
            printSingles(node.right);
        }

        // If right child is NULL and left
        // is not, print left child
        // and recur for left child
        else if (node.left != null)
        {
            System.out.print( node.left.data + " ");
            printSingles(node.left);
        }
    }
}



        public class NodesNotHaveSibling {
            public static void main(String args[]) {
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
                    tree.printSingles(tree.root);
                }
            }
        }

