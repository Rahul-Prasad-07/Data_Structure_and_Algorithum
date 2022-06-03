package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class ReverseUsingLinkList {
    public static void main(String[] args) {
        ReverseUsingLinkList obj = new ReverseUsingLinkList();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 0; i < n; i++) {
            obj.push( in .next().charAt(0));

        }

        obj.display(obj.top);
        System.out.println(" ");
        // reverse
        Node temp = obj.reverse();
        obj.display(temp);


    }
    class Node {
        char data;
        Node next;
        public Node(char new_data) {
            data = new_data;
            next = null;
        }
    }
    Node top;
    public void push(char new_data) {

        Node new_node = new Node(new_data);
        if (top == null) {

            top = new_node;
        } else {
            new_node.next = top;
            top = new_node;


        }
    }
    public Node pop() {
        Node node = top;
        top = top.next;
        return node;
    }

    // prints contents of stack
    public void display(Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Reverses the stack using simple
    // linked list reversal logic.
    public Node reverse() {
        // Write your code here.
      
        Stack<Node > stk = new Stack<Node> ();

        // Push the elements of list to stack 
        Node head = null;
        Node ptr = head;
        while (ptr.next != null)
        {
            stk.push(ptr);
            ptr = ptr.next;
        }

        // Pop from stack and replace 
        // current nodes value'
        head = ptr;
        while (!stk.isEmpty())
        {
            ptr.next = stk.peek();
            ptr = ptr.next;
            stk.pop();
        }
        ptr.next = null;

        return head;
    }

}
