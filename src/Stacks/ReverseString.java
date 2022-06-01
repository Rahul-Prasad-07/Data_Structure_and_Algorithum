package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String arg[]) {
        Stack<Character> s = new Stack<Character>();
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        //write your code here
        data =reverse (data);
        System.out.println(data);

    }

    private static String reverse(String data) {

        // if string is null or empty
        if(data==null || data.equals("")){
            return data;
        }

        Stack<Character> stack = new Stack<Character>();

        //push every chr to given string into stack
        char[] ch = data.toCharArray(); //toCharArray --> used to convert a string into a char array
        for (int i=0; i<data.length(); i++){
            stack.push(ch[i]);
        }

        //start from index 0
        int k=0;

        //pop chr from stack until it's empty
        while (!stack.isEmpty()){
            ch[k++]=stack.pop();
        }
        return String.copyValueOf(ch);
    }
}

/*
steps :
1. create an empty stack of char
2. convert given string into char array using String.toCharArray() method
   and push each char of in to the stack.
3. remove char from stack until it becomes empty and assign them back to the
   char array.As stack follow filo order , char will be inserted in the reverse order.
4. finally , converted array into string using String,copyValueOf(char[])
   return the value the formed String.
 */
