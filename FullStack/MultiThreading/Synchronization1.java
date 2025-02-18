package org.studyeasy.Multithreading;

public class Synchronization1 {
    //If we are having the single common resource for multi threads means there issue will occur
    // Those issues canbe fixed by using synchronization
    public static int counter=0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=10000;i++){
                    Synchronization1.counter++;
                }
                System.out.println("The loop in thread1 is completed");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=100000;i++){
                    Synchronization1.counter++;
                }
                System.out.println("The loop in thread2 is completed");
            }
        }).start();
        Thread.sleep(200);
        System.out.println(counter);
    }
}
