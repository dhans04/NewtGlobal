package org.studyeasy.Multithreading;
class Bracket{
    private Object lock="Loc";
    //public void generate(){ - doesn't follow synchronized
    //for synchronization we need to use the synchronized keyword in it
    synchronized public void generate() throws InterruptedException {
      //for synchrinize this block of code
      // common way of using synchronization for a block of code
       // synchronized (this){
        // this will make the object hidden from the outside world
       synchronized (lock){
            for (int i = 1; i <= 20; i++) {
                if (i <= 10) {
                    Thread.sleep(5);
                    System.out.print("[");
                } else {
                    System.out.print("]");
                }

            }

            System.out.println();
        }
        for (int i=0;i<10;i++){
            Thread.sleep(10);
        }
    }
}
public class Synchronization2 {
    public static void main(String[] args) {
        Bracket bracket=new Bracket();
        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime=System.currentTimeMillis();
                for (int i=0;i<5;i++){
                    try {
                        bracket.generate();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                long endTime=System.currentTimeMillis();
                System.out.println("Total thread time taken by thread1: "+(endTime-startTime));

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime=System.currentTimeMillis();
                for (int i=0;i<5;i++){
                    try {
                        bracket.generate();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                long endTime=System.currentTimeMillis();
                System.out.println("Total thread time taken by thread2: "+(endTime-startTime));

            }
        }).start();
    }
}
