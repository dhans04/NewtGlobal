package org.studyeasy.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class  SomeThread extends Thread{
    private String name;

    public SomeThread(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Started thread: "+name);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Ended Thread: "+name);
    }
}
public class ThreadPools1 {
    public static void main(String[] args) {
        //Some machines have the limit to run the number of threads at a time
        // for scheduling that we go for ExecuterService
        ExecutorService executorService= Executors.newFixedThreadPool(6);

        SomeThread thread01=new SomeThread("Thread01");
        SomeThread thread02=new SomeThread("Thread02");
        SomeThread thread03=new SomeThread("Thread03");
        SomeThread thread04=new SomeThread("Thread04");
        SomeThread thread05=new SomeThread("Thread05");
        SomeThread thread06=new SomeThread("Thread06");
        SomeThread thread07=new SomeThread("Thread07");
        SomeThread thread08=new SomeThread("Thread08");
        SomeThread thread09=new SomeThread("Thread09");
        SomeThread thread10=new SomeThread("Thread10");
        SomeThread thread11=new SomeThread("Thread11");
        SomeThread thread12=new SomeThread("Thread12");
        SomeThread thread13=new SomeThread("Thread13");
        SomeThread thread14=new SomeThread("Thread14");
        executorService.execute(thread01);
        executorService.execute(thread02);
        executorService.execute(thread03);
        executorService.execute(thread04);
        executorService.execute(thread05);
        executorService.execute(thread06);
        executorService.execute(thread07);
        executorService.execute(thread08);
        executorService.execute(thread09);
        executorService.execute(thread10);
        executorService.execute(thread11);
        executorService.execute(thread12);
        executorService.execute(thread13);
        executorService.execute(thread14);

        //To complete the process affter all the thread got executed we need to shutdown the executor
        executorService.shutdown();


    }
}
