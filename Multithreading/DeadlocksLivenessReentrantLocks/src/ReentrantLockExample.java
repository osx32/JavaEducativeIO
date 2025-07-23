import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    private int counter = 0;
    private final ReentrantLock locker = new ReentrantLock(); // our mutex

    public void increment(){
        locker.lock(); // acquire the lock
        try{
            counter++;
        }
        finally {
            locker.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantLockExample example = new ReentrantLockExample();

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                example.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                example.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Counter: " + example.counter);
    }
}
