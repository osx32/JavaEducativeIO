import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample2 {
    public static void main(String[] args) {
        ReentrantLock locker = new ReentrantLock();
        Executors.newSingleThreadExecutor().submit(() -> {
            locker.lock();
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e) { throw new RuntimeException(e);}

            finally{ locker.unlock();}
        });
        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(() -> {
            System.out.println("Locked: " + locker.isLocked());
            System.out.println("Held by this thread: " + locker.isHeldByCurrentThread());
            boolean lockedState = locker.tryLock();
            System.out.println("Lock acquired: " + lockedState);
        }, 0, 1, TimeUnit.SECONDS);
    }
}
