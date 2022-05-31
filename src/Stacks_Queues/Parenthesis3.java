package Stacks_Queues;

import java.util.EmptyStackException;
import java.util.Stack;

public class Parenthesis3 {
    /*
   NOTE
   ----
   We implement the parenthesis matching algorithm using a stack.
 */

    private static Stack<Character> stack = new Stack<Character>();

    //  You could alternatively use a newly class called MyStack instead of using the inbuilt method
    //  private static MyStack<Character> stack = new MyStack<Character>();


    public static void main(String[] args) {
        try {
            System.out.println(match("()"));
            System.out.println(match("((((((()))))))"));
            System.out.println(match("(((((()))))))"));
            System.out.println(match("(((((()))))))"));
            System.out.println(match("(((()(((()))))))"));

            System.out.println(match("{}"));
            System.out.println(match("{{{{{{{}}}}}}}"));
            System.out.println(match("{{{{{{}}}}}}}"));
            System.out.println(match("{{{{{{}}}}}}}"));
            System.out.println(match("{{{{}{{{{}}}}}}}"));

            System.out.println(match("{{({}{{{{}}}})}}"));
            System.out.println(match("{{(})}"));
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean match(String parens) throws Exception {
        Stack<Character> stack = new Stack<Character>();

        //iterate through all char
        for(char c : parens.toCharArray()) {

            //push
            if(c == '(' || c == '{') {
                stack.push(c);
            }

            //pop
            else if(c == ')') {
                try {
                    char t = stack.pop();
                    if(t != '(') {
                        return false;
                    }
                }
                catch(EmptyStackException e) {
                    return false; // if empty
                }
            }

            //pop
            else if(c == '}') {
                try {
                    char t = stack.pop();
                    if(t != '{') {
                        return false;
                    }
                }
                catch(EmptyStackException e) {
                    return false;  // if empty
                }
            }
            else {
                throw new Exception("Unexpected character " + c);
            }
        }

        //if stack is empty return true
        if(stack.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}

/*

class MyStack<T> {
    private LinkedList<T> list = new LinkedList<T>();

    public void push(T e) {
        this.list.add(e);
    }

    public T pop() {
        if (this.list.size() > 0) {
            T e = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return e;
        }
        throw new EmptyStackException();
    }

    public Boolean isEmpty() {
        return this.list.size() == 0;
    }
}

*/
