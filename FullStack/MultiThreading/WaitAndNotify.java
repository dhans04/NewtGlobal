package org.studyeasy.Multithreading;

public class WaitAndNotify {
    public static int balance=0;
    //While waiting we need to make the block as synchronized
    synchronized public void withdraw(int amount) {
        if(balance<=0){
            System.out.println("Waiting for amount to be updated");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("WithDrawal Interrupted");
                return;
            }
            // If we use wait() it will wait till we stop the program to run
            //Instead of using these two methods we can use notify() once it got completed in deposit.
        }
        if(balance-amount<0){
            System.out.println("Balance is too Low for withdrawal");
            return;
        }
        balance=balance-amount;
        System.out.println(balance);
    }
    public boolean deposit(int amount) {
        synchronized (this){
        if(amount>0){
            System.out.println("Depositing the amount into bank");
            balance = balance + amount;
            // waiting time some time may take longer than usual or smaller than the usual time
            notify();
            return true;
        }else{
            System.out.println("Invalid Deposit amount");
            return false;
        }
        }
    }

    public static void main(String[] args) {
        WaitAndNotify obj=new WaitAndNotify();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                obj.withdraw(3000);
            }
        });
        thread1.setName("Thread 1");
        thread1.start();

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if(obj.deposit(0)){
                    System.out.println("Transaction success for depositing the amount");
                }
                else{
                    System.out.println("Transachtion Failed for Depositing the amount");
                    thread1.interrupt();
                }
            }
        });
        thread2.setName("Thread 2");
        thread2.start();
        //System.out.println(balance);
    }
}
