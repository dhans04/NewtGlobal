package org.studyeasy.Multithreading;

import java.util.concurrent.CountDownLatch;

class SomeThreads extends Thread{
    private CountDownLatch latch;
    public SomeThreads(CountDownLatch latch) {
        this.latch = latch;
    }


    @Override
    public void run() {
        System.out.println("Started thread: "+Thread.currentThread().getName());
        System.out.println("Ended thread: "+Thread.currentThread().getName());
        System.out.println("**********************************************************");
        latch.countDown();
    }
}
public class CountDownLatch1 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch=new CountDownLatch(3);
        SomeThreads thread1=new SomeThreads(latch);
        SomeThreads thread2=new SomeThreads(latch);
        SomeThreads thread3=new SomeThreads(latch);
        SomeThreads thread4=new SomeThreads(latch);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();



        latch.await();
        //For latch we need to release or else the program won't get stopped
        // we passed the latch as 4 so we need to release that 4 times
        System.out.println("Main thread: "+Thread.currentThread().getName());
    }

}
