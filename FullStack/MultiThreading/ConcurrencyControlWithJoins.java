package org.studyeasy.Multithreading;

public class ConcurrencyControlWithJoins {
    public static int counter1=0;
    public static int counter2=0;
    public static void main(String[] args) throws InterruptedException {
        //Joins are used when using multithreading for synchronization
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    counter1++;
                }
            }
        });
        thread1.start();
 /*       //Thread.sleep(1000);
        //we don't know how much time we need to give in sleep so we go for join
        thread1.join();
        //Some times it executes the last line before the 1st thread completes fo such scenarios we go for join
        // join will wait until that thread will gets completed
        System.out.println("Counter1: "+counter1);
*/
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    counter2++;
                }
            }
        });
        thread2.start();
        Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    //thread1.join();
//                    thread2.join();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }

                System.out.println("Thread1: "+counter1);
                System.out.println("Thread2: "+counter2);
            }
        });
        thread3.start();

        System.out.println("Main Thread: "+Thread.currentThread().getName());
    }
}
