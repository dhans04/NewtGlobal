package org.studyeasy.Multithreading;

import static java.lang.Thread.sleep;

public class Volatile1 {
    //When on thread depend on other thread there may be a chance of getting catch for getting rid of that we can use volatile on the common dependent variable
    volatile public static int flag=0;
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i=0;
                while(true){
                    if(flag==0){
                        System.out.println(i+" : Running...");
                        i++;
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                flag=1;
                System.out.println("Flag values got updated");
            }
        }).start();
    }
}
