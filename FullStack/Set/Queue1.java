package org.studyeasy.Set;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<>(5);
        try {
            //add = offer(no try catch for offer bcz it won't through exception

            queue.add(1);
            queue.offer(2);
            queue.offer(3);
            queue.offer(4);
            queue.add(5);
            //poll = remove
            queue.remove();
            queue.poll();
            //return 1st value
            queue.peek();
            System.out.println(queue);
        }catch (Exception e){
            System.out.println("Something went wrong");
        }



    }
}
