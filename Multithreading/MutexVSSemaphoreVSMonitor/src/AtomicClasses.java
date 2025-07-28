import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ExecutorService;
import java.util.stream.IntStream;

public class AtomicClasses {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicInt = new AtomicInteger(0);
        ExecutorService executor = Executors.newFixedThreadPool(4);
        IntStream.range(0,1000).
                forEach(i -> executor.submit(atomicInt::incrementAndGet));

        Thread.sleep(2000);
        System.out.println(atomicInt.get());
    }

}