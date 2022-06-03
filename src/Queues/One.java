package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class One {
    public static void main(String arg[]) {
        Queue<Integer> q = new LinkedList<Integer>();


        q.add(3); // Inserts the element passed as parameter to the end of the queue
        q.add(2);
        q.add(6);
        q.add(4);
        q.add(5);
        int val = q.peek(); //returns the element at the front of queue
        for (int i = 0; i < q.size(); i++) {
            int del = q.remove(); // returns and removes the element at the front of queue
            if (val < del) {
                val = del;
            }
            q.add(del);
        }
        //System.out.println(val);
    }
}
