import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.IntStream;

public class AtomicClasses3 {
    public static void main(String[] args) throws InterruptedException {
        LongAdder adder = new LongAdder();
        ExecutorService executor = Executors.newFixedThreadPool(4);
        IntStream.range(0, 100).forEach(i -> executor.submit(adder::increment));
        Thread.sleep(2000);
        System.out.println(adder.sumThenReset());
    }
}
