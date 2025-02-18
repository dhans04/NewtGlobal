package org.studyeasy.Multithreading;

import java.util.Random;

import static java.lang.Thread.sleep;

class MyCounter2 implements Runnable{
    private int threadNo;

    public MyCounter2(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            try {
                Random random=new Random();
                //waiting time will be 0 to 5000 anything
                sleep(random.nextInt(5000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread no: "+threadNo+" Iteration no: "+i);
        }
    }
}
public class MultiThreading2 {
    public static void main(String[] args) {
        Thread thread1=new Thread(new MyCounter2(1));
        Thread thread2=new Thread(new MyCounter2(2));
        thread1.start();
        thread2.start();
    }
}
