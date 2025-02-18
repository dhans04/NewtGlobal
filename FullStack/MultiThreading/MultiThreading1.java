package org.studyeasy.Multithreading;

import static java.lang.Thread.sleep;

class MyCounter1 extends Thread {
    private int threadNo;

    public MyCounter1(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        try {
            countMe();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void countMe() throws InterruptedException {
        for(int i=0;i<10;i++){
            //make the output 500 mili sec slower for each iteration
            sleep(500);
            System.out.println("Thread No: "+threadNo+" Operation No: "+i);
        }
    }

}
public class MultiThreading1 {
    public static void main(String[] args) throws InterruptedException {
        MyCounter1 counter1=new MyCounter1(1);
        MyCounter1 counter2=new MyCounter1(2);
        //get the current time in milli second
//        long startTime = System.currentTimeMillis();
//        counter1.run();
//        System.out.println("***********************");
//        counter2.run();
//        long endTime=System.currentTimeMillis();
//        System.out.println("Total time :"+(endTime-startTime));

        // MultiThreading run all the thread concurrently
        long startTime = System.currentTimeMillis();
        counter1.start();
        System.out.println("************************************");
        counter2.start();
        sleep(6000);
        long endTime=System.currentTimeMillis();

        System.out.println("Total time :"+(endTime-startTime));
    }
}
