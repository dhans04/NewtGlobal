package org.studyeasy.Multithreading;

import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable{
    private ArrayBlockingQueue<Integer> queue;
    public Producer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
                queue.put(BlockingQueues1.counter);
                System.out.println("Value added in the queue: "+BlockingQueues1.counter);
                BlockingQueues1.counter++;
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
class Consumer implements Runnable{
    private ArrayBlockingQueue<Integer> queue;
    public Consumer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1500);
                queue.take();
                System.out.println("Value removed from the queue: "+BlockingQueues1.counter);
                BlockingQueues1.counter--;
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
public class BlockingQueues1 {
    public static int counter=1;

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue=new ArrayBlockingQueue<>(10);
        Thread thread1=new Thread(new Producer(queue));
        thread1.start();
        Thread thread2=new Thread(new Consumer(queue));
        thread2.start();



    }

}
