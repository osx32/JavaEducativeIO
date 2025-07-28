import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class AtomicClasses2 {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicInt = new AtomicInteger(1);
        ExecutorService executor = Executors.newFixedThreadPool(4);
        IntStream.range(0, 10).forEach(i -> {
            Runnable task = () -> atomicInt.updateAndGet(n -> n * 2);
            executor.submit(task);
        });
        Thread.sleep(2000);
        System.out.println(atomicInt.get()); //1024
    }
}
