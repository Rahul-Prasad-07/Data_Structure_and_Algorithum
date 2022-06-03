package Queues;

/*
Sample Input:
(((a+1))+(b+1))

Sample output:
Input string contains duplicate parenthesis

tc = O(n)
sc = O(n)
 */

import java.util.Scanner;
import java.util.Stack;

public class DetectDuplicateParenthesis {
    public static boolean findDuplicateparenthesis(String s) {
        //write your code here
        // create a stack of characters
        Stack<Character> Stack = new Stack<>();

        // Iterate through the given expression
        char[] str = s.toCharArray();
        for (char ch : str) {
            // if current character is close parenthesis ')'
            if (ch == ')') {
                // pop character from the stack
                char top = Stack.peek();
                Stack.pop();

                // stores the number of characters between a
                // closing and opening parenthesis
                // if this count is less than or equal to 1
                // then the brackets are redundant else not
                int elementsInside = 0;
                while (top != '(') {
                    elementsInside++;
                    top = Stack.peek();
                    Stack.pop();
                }
                if (elementsInside < 1) {
                    return true;
                }
            } // push open parenthesis '(', operators and
            // operands to stack
            else {
                Stack.push(ch);
            }
        }

        // No duplicates found
        return false;


    }


    public static void main(String[] args){
        DetectDuplicateParenthesis obj = new DetectDuplicateParenthesis();
        String s = new String();
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        //System.out.println(obj.findDuplicateParenthesis(inputString));

        if (findDuplicateparenthesis(s)) {
            System.out.println("Input string contains duplicate parenthesis");
        } else {
            System.out.println("Input string does not contain duplicate parenthesis");
        }


    }

}
