package org.studyeasy.Set;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class Dequeue1 {
    public static void main(String[] args) {
        Deque<Integer> queue=new LinkedBlockingDeque<>();
        queue.add(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.addFirst(5);
        queue.addFirst(6);
        queue.addLast(8);
        //poll = remove
        queue.remove();
        queue.removeFirst();
        queue.removeLast();
        queue.poll();
        //return 1st value
        queue.peek();


    }
}
