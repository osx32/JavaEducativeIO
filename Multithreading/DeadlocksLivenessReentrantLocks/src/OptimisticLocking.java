import java.util.concurrent.locks.StampedLock;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;


public class OptimisticLocking {
    public static void main(String[] args) {
        StampedLock locker = new StampedLock();
        ExecutorService executors = Executors.newFixedThreadPool(2);

        executors.submit(() -> {
            long stamp = locker.tryOptimisticRead();
            try{
                System.out.println("Optimistic Lock Valid: " + locker.validate(stamp));
                Thread.sleep(2000);
                System.out.println("Optimistic Lock Valid: " + locker.validate(stamp));
                Thread.sleep(2000);
                System.out.println("Optimistic Lock Valid: " + locker.validate(stamp));
            }
            catch (InterruptedException e){ }
            finally{
                locker.unlock(stamp);
            }
        });

        executors.submit(() -> {
            long stamp = locker.writeLock();
            try{
                System.out.println("Write Lock Acquired");
                Thread.sleep(2000);
            }
            catch (InterruptedException e){ }
            finally{
                System.out.println("Write Done");
                locker.unlock(stamp);
            }
        });
    }

}
