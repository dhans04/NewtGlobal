package org.studyeasy.Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock1 {
    public static int counter=0;
    static Lock lock=new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(new Runnable() {
            //Instead of using Synchronized(this) to make a block of code in synchronized
            //      We can go for Reentrant lock method for locking and unlocking
            @Override
            public void run() {
                lock.lock();
                for(int i=0;i<100000;i++){
                    ReentrantLock1.counter++;
                }
                lock.unlock();

            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                for(int i=0;i<100000;i++){
                    ReentrantLock1.counter++;
                }
                lock.unlock();

            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter);
    }
}
