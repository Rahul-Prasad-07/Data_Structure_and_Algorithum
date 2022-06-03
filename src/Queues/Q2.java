package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//tc = O(n)
//sc = O(n2)

public class Q2 {
    public void checkPalindrome(String inputString) {

        //Write your code here
        Queue queue = new LinkedList();

        for (int i = inputString.length() - 1; i >= 0; i--) {
            queue.add(inputString.charAt(i));
        }

        String reverseString = "";

        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.remove();
        }
        if (inputString.equals(reverseString))
            System.out.println(" The given input is a palindrome.");
        else
            System.out.println(" The given input is not a palindrome.");
    }
    public static void main(String[] args) {
        Q2 obj = new Q2();
        Scanner in = new Scanner(System.in);
        String inputString = in .nextLine();
        obj.checkPalindrome(inputString);

    }
}
