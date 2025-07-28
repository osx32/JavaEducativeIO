import java.util.concurrent.Semaphore;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SemaphoreExample2 {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(5);
        ExecutorService executor = Executors.newFixedThreadPool(10);

        Runnable task = () -> {
            boolean permit = false;
            try{
                permit = semaphore.tryAcquire(1, TimeUnit.SECONDS);
                if(permit){
                    System.out.println("Semaphore acquired");
                    Thread.sleep(5000);
                }

                else{
                    System.out.println("Could not acquire semaphore");
                }
            }
            catch (InterruptedException e){}
            finally{
                if(permit) semaphore.release();
            }
        };
        IntStream.range(0, 10).forEach(i -> executor.submit(task));
    }
}
