package org.studyeasy.Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockPrevention {
    static Lock lock1=new ReentrantLock();
    static Lock lock2=new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {


        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                lock1.lock();
                System.out.println("Thread1, Lock1");
                lock2.lock();
                System.out.println("Thread1, Lock2");
                lock2.unlock();
                lock1.unlock();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                lock2.lock();
                System.out.println("Thread2, Lock2");
                lock1.lock();
                System.out.println("Thread2, Lock1");
                lock1.unlock();
                lock2.unlock();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Main Thread");

    }
}
