package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class debugger {
    public static void main(String[] args) {
        Stack<Character> new_stack = new Stack<>();
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        for (int k = 0; k < inputString.length(); k++) {
            if (inputString.charAt(k) == ')') {
                new_stack.push(inputString.charAt(k));
            }
            if (inputString.charAt(k) == '(') {
                if (new_stack.isEmpty()) {
                    break;  // this statement breaks the control and make it go out of loop
                } else {
                    new_stack.pop();
                }
            }
        }
        if (new_stack.isEmpty())
            System.out.println("balanced");
        else
            System.out.println("unbalanced");
    }

    }
