package Stacks_Queues;

import java.util.Scanner;
import java.util.Stack;

//You are given a stack with n integers and you need to print the fifth element from the top of the stack.

public class PrintElement {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        printFifthElementFromEnd(stack);
    }

    // Method to print the fifth element from the top of the stack
    static void printFifthElementFromEnd(Stack<Integer> stack) {

        Integer pos = (Integer) stack.search(5);

        if(pos == -1)
            System.out.print( "There are not enough elements in the stack");
        else
            System.out.print( pos );
    }

}
