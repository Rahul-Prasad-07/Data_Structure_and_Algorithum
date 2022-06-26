package BinaryTree;

import java.util.Scanner;

public class FindHeightofBinaryTree {
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }

    }

    static class Tree {
        Node root;

        Tree() {
            root = null;
        }


        // Method to construct a binary tree from the given array
        public Node insertNode(int[] elementsArr, Node node, int i) {
            if (i < elementsArr.length) {
                node = new Node(elementsArr[i]);
                node.left = insertNode(elementsArr, node.left, 2 * i + 1);
                node.right = insertNode(elementsArr, node.right, 2 * i + 2);
            }
            return node;
        }

        // Method to find the height of a binary tree
        public int findHeight(Node node) {
            // Write your code here
            if (root == null){
                return 0;
            }
            else {
                int leftHeight = 0, rightHeight = 0;

                //Calculate the height of left subtree
                if(node.left != null)
                    leftHeight = findHeight(node.left);

                //Calculate the height of right subtree
                if(node.right != null)
                    rightHeight = findHeight(node.right);

                //Compare height of left subtree and right subtree
                //and store maximum of two in variable max
                int max = (leftHeight > rightHeight) ? leftHeight : rightHeight;

                //Calculate the total height of tree by adding height of root
                return (max + 1);
            }
        }
    }


    public static void main(String[] args) {
        Tree tree = new Tree();

        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        if (size < 0){
            System.out.println("Size should be a positive integer");
        }

        else{
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++) {
                elementsArr[i] = sc.nextInt();
            }

            tree.root = tree.insertNode(elementsArr, tree.root, 0);

            System.out.println(tree.findHeight(tree.root));
            }

    }

}
