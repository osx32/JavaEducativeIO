import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class WriteReadLocks2 {
    public static void main(String[] args) throws InterruptedException {
//        StampedLocks lock3 = new StampedLocks();
//        ExecutorService executor2 = Executors.newFixedThreadPool(2);
//
//        executor2.submit(() -> {
//            long stamp = lock3.readLock();
//            try{
//                if(writeIsNeeded){
//                    stamp = lock3.tryConvertToWriteLock(stamp);
//                    if(stamp == 0L) stamp = lock3.writeLock();
//                }
//            }
//            finally {
//                lock3.unlock(stamp);
//            }
//        });
    }
}
