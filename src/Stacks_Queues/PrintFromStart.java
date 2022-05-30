package Stacks_Queues;

import java.util.Scanner;
import java.util.Stack;

public class PrintFromStart {

        public static void main(String args[]) {
            Stack<Integer> stack = new Stack<>();
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            while (n-- > 0)
                stack.push(s.nextInt());
            printFifthElementFromStart(stack);
        }

        // Method to print the fifth element from the bottom of the stack
        static void printFifthElementFromStart(Stack<Integer> stack) {
            int n = stack.size();
            // If the stack doesn't have enough elements
            if (n < 5)
                System.out.println("There are not enough elements in the stack");
            else {
                while (stack.size() > 5){
                    stack.pop();
                }
                System.out.println(stack.peek());
            }
        }
    }


