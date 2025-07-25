//DEADLOCK

//public class DeadLockExample {
//    static final Object lock1 = new Object();
//    static final Object lock2 = new Object();
//
//    public static void main(String[] args){
//        Thread t1 = new Thread (() -> {
//            synchronized (lock1){
//                System.out.println("Thread 1 : locked lock1");
//                try{Thread.sleep(100);} catch(Exception e){}
//
//                synchronized (lock2){
//                    System.out.println("Thread 1 : locked lock2");
//                }
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            synchronized (lock2){
//                System.out.println("Thread 2 : locked lock2");
//                try{Thread.sleep(100); } catch(Exception e){}
//
//                synchronized (lock1){
//                    System.out.println("Thread 2 : locked lock1");
//                }
//            }
//        });
//
//        t1.start();
//        t2.start();
//    }
//}



//import java.util.concurrent.locks.*;
//
//public class DeadLockExample {
//    static Lock lock1 = new ReentrantLock();
//    static Lock lock2 = new ReentrantLock();
//
//    public static void main(String[] args) throws InterruptedException {
//        Thread t1 = new Thread(() -> {
//            try {
//                if (lock1.tryLock()) {
//                    Thread.sleep(100);
//                    if (lock2.tryLock()) {
//                        System.out.println("Thread 1 acquired both locks");
//                        lock2.unlock();
//                    }
//                }
//                lock1.unlock();
//            }
//            catch (InterruptedException e){ }
//        });
//        Thread t2 = new Thread(() -> {
//            try{
//                if (lock2.tryLock()) {
//                    Thread.sleep(100);
//                    if (lock1.tryLock()) {
//                        System.out.println("Thread 2 acquired both locks");
//                        lock1.unlock();
//                    }
//                    lock2.unlock();
//            }
//        } catch(InterruptedException e){}
//        });
//        t1.start();
//        t2.start();
//
//    }
//}

import java.util.concurrent.locks.*;

public class DeadLockExample {
    public static void main(String[] args) {
        Deadlock deadlock = new Deadlock();
        try{
            deadlock.runTest();
        }
        catch (InterruptedException e){ }
    }
}

class Deadlock{
    private int counter = 0;
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    Runnable incrementer = new Runnable() {
        @Override
        public void run() {
            try{
                for(int i = 0; i <100; i++){
                    incrementCount();
                    System.out.println("Incrementing " + i);
                }
            }
            catch(InterruptedException e){ }
        }
    };

    Runnable decrementer = new Runnable() {
        @Override
        public void run() {
            try{
                for(int i = 0; i <100; i++){
                    decrementCounter();
                    System.out.println("Decrementing " + i);
                }
            }
            catch (InterruptedException e){ }
        }
    };

    public void runTest() throws InterruptedException{
        Thread thread1 = new Thread(incrementer);
        Thread thread2 = new Thread(decrementer);

        thread1.start();
        //sleep to make sure thread 1 gets a chance to acquire lock1
        Thread.sleep(100);
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Done: " + counter);
    }

    void incrementCount() throws InterruptedException{
        synchronized(lock1){
            System.out.println("Acquired lock1");
            Thread.sleep(100);

            synchronized(lock2){
                counter++;
            }
        }
    }

    void decrementCounter() throws InterruptedException{
        synchronized(lock2){
            System.out.println("Acquired lock2");

            Thread.sleep(100);
            synchronized(lock1){
                counter--;
            }
        }
    }
}