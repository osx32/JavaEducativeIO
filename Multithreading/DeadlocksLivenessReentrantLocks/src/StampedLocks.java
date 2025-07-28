import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.StampedLock;


public class StampedLocks {
    public static void  main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>();
        StampedLock locker = new StampedLock();
        ExecutorService executor = Executors.newFixedThreadPool(10);

        Runnable writeTask = () -> {
            long stamp = locker.writeLock();
            try{
                list.add("Geek");
                Thread.sleep(2000);
            }
            catch (InterruptedException e){ }
            finally {
                locker.unlockWrite(stamp);
            }
        };

        Runnable readTask = () -> {
            long stamp = locker.readLock();
            try{
                System.out.println(list.get(0));
                Thread.sleep(2000);
            }
            catch(InterruptedException e){ }
            finally{
                locker.unlockRead(stamp);
            }
        };

        executor.submit(writeTask);
        executor.submit(readTask);
        executor.submit(readTask);
    }

}