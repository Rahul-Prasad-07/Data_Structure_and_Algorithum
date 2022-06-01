package Stacks;

import java.util.EmptyStackException;

public class StackUsingArray <T>{
    T[] arr ;
    int capacity;
    int index;

    public StackUsingArray(int capacity){
        this.capacity=capacity;
        arr = (T[]) new Object[capacity];  // initialized  value the capacity of the given array which is the underlying storage layer for array.
        index =-1;
    }

    public boolean isEmpty(){
        return index==-1;
    }
    public boolean isFull(){
        return index == this.capacity-1;
    }

    public void push(T data ){
        if(isFull()){
            throw new StackOverflowError("Stack is already full");
        }
        this.arr[++index] = data;
    }
    public T pop (){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return this.arr[index--];
    }

    public static void main(String[] args) {
        StackUsingArray<String> stackUsingArray = new StackUsingArray<>(5);

        System.out.println("is empty : " + stackUsingArray.isEmpty());
        stackUsingArray.push("vishwa");
        stackUsingArray.push("Moahan");

        System.out.println("is Empty :" + stackUsingArray.isEmpty());
        System.out.println(stackUsingArray.pop());
        System.out.println(stackUsingArray.pop());

    }
}
