package Stacks_Queues;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class ImplementationOfMyStack<T> {
    public static void main(String[] args) {
        ImplementationOfMyStack stack = new ImplementationOfMyStack(); //stack of String

        stack.push("OOP");
        stack.push("Algorithm");
        stack.push("Data Structure");

        try {
            while (true) {
                System.out.println("popped" + stack.pop());

            }
        }catch (EmptyStackException e ){
            System.out.println("Done!");
        }
    }

    private LinkedList<T> list = new LinkedList<>();

    public  void push(T e) {
        this.list.add(e);
    }

    public T pop(){
        if(this.list.size()>0){
            T e = list.get(list.size()-1); //get the last element & place in variable e.
            list.remove(list.size()-1); // remove that last elemet & return e.
            return e;
        }
        throw new EmptyStackException(); //when size of list =0 --> throw epty stack exception.
    }

    public Boolean isEmpty(){
        return this.list.size()==0;
    }



}
