package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//graded q
public class Graded {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        sort(queue);
        System.out.println(queue);
    }
    static void sort(Queue<Integer> queue) {
        // Write your code here
        if (queue.isEmpty()){
            return;
        }
        int temp = queue.peek();
        queue.remove();
        sort(queue);
        pushInQueue(queue, temp, queue.size());
    }
    static void pushInQueue(Queue<Integer> q, int temp, int size){
        if (q.isEmpty() || size == 0){
            q.add(temp);
            return;
        } else if (temp <= q.peek()){
            q.add(temp);
            FrontToLast(q, size);
        } else {
            q.add(q.peek());
            q.remove();
            pushInQueue(q, temp, size - 1);
        }
    }
    static void FrontToLast(Queue<Integer> q, int qsize){
        if (qsize <= 0)
            return;
        q.add(q.peek());
        q.remove();
        FrontToLast(q, qsize-1);
    }
}
