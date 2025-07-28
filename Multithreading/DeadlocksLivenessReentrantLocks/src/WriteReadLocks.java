import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class WriteReadLocks {


    public static void main(String[] args) throws InterruptedException {

        List<String> list = new ArrayList<>();
        ReadWriteLock locker = new ReentrantReadWriteLock();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable writeTask = () -> {
            locker.writeLock().lock();
            try{
                list.add("Geek");
                Thread.sleep(2000);
            }
            catch (InterruptedException e) { }
            finally{
                locker.writeLock().unlock();
            }

        };

        Runnable readTask = () -> {
            locker.readLock().lock();
            try{
                System.out.println(list.get(0));
                Thread.sleep(2000);
            }
            catch(InterruptedException e){ }
            finally{
                locker.readLock().unlock();
            }
        };

        executor.submit(writeTask);
        executor.submit(readTask);
        executor.submit(readTask);
    }
}
