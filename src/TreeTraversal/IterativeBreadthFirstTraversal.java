package TreeTraversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IterativeBreadthFirstTraversal {
    static class Node {
        int data;
        Node left, right;

        public Node(int value) {
            data = value;
            left = right = null;
        }
    }
    static class BinaryTree {

        Node root;

        BinaryTree() {
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

        // Method to find the largest value in the tree
        public int findMax(Node node) {
            //Write your code here.
            Queue<Node> queue = new LinkedList<Node>();
            queue.add(root);
            int max = 0;

            while (!queue.isEmpty()) {
                Node temp = queue.peek();
                queue.remove();

                if (temp.data > max) {
                    max = temp.data;
                }

                if (temp.left != null) {
                    queue.add(temp.left);
                }

                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }

            return max;
        }

        public static void main(String[] x) {
            BinaryTree tree = new BinaryTree();

            int size;
            Scanner sc = new Scanner(System.in);
            size = sc.nextInt();

            if (size == 0) {
                System.out.println("-1");
            } else if (size < 0) {
                System.out.println("Size should be a positive integer");
            } else {
                int[] elementsArr = new int[size];
                for (int i = 0; i < size; i++) {
                    elementsArr[i] = sc.nextInt();
                }

                tree.root = tree.insertNode(elementsArr, tree.root, 0);

                System.out.println(tree.findMax(tree.root));
            }
        }
    }

}
