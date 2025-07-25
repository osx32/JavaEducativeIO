//import java.util.concurrent.locks.ReentrantLock;
//
//public class ReentrantLockExample {
//    private int counter = 0;
//    private final ReentrantLock locker = new ReentrantLock(); // our mutex
//
//    public void increment(){
//        locker.lock(); // acquire the lock
//        try{
//            counter++;
//        }
//        finally {
//            locker.unlock();
//        }
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        ReentrantLockExample example = new ReentrantLockExample();
//
//        Thread t1 = new Thread(() -> {
//            for(int i = 0; i < 1000; i++){
//                example.increment();
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++){
//                example.increment();
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println("Final Counter: " + example.counter);
//    }
//}


import java.util.concurrent.locks.ReentrantLock;
public class ReentrantLockExample {
    public static void main(String[] args) throws InterruptedException {
        NonReentrantLock nreLock = new NonReentrantLock();

        //First locking would be sucessful
        nreLock.lock();
        System.out.println("Acquired first lock");

        //Second locking results in a self deadlock
        System.out.println("Trying to acquire second lock");
        nreLock.lock();
        System.out.println("Acquired second lock");
    }
}

class NonReentrantLock {
    boolean isLocked;

    public NonReentrantLock() {
        isLocked = false;
    }

    public synchronized void lock() throws InterruptedException{
        while(isLocked){
            wait();
        }
        isLocked = true;
    }

    public synchronized void unlock(){
        isLocked = false;
        notify();
    }
}