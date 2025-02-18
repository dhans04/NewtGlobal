package org.studyeasy.Multithreading;
class Bracket1{
    //Even though we use synchronized keyword it will not getting synchronized perfectly so we need to use static
    synchronized public static void generate() throws InterruptedException {
         for (int i = 1; i <= 20; i++) {
                if (i <= 10) {
                    Thread.sleep(5);
                    System.out.print("[");
                } else {
                    System.out.print("]");
                }

            }
            System.out.println();

        for (int i=0;i<10;i++){
            Thread.sleep(10);
        }
    }
}

public class StaticSynchronization1 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime=System.currentTimeMillis();
                for (int i=0;i<5;i++){
                    try {
                        Bracket1.generate();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                long endTime=System.currentTimeMillis();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime=System.currentTimeMillis();
                for (int i=0;i<5;i++){
                    try {
                        Bracket1.generate();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                long endTime=System.currentTimeMillis();
            }
        }).start();
    }
}
