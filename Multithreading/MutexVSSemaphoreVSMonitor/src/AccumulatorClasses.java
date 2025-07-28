import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.function.LongBinaryOperator;
import java.util.stream.IntStream;

public class AccumulatorClasses {
    public static void main(String[] args) throws InterruptedException {
        LongBinaryOperator op = (x, y) -> x * y;
        LongAccumulator accumulator = new LongAccumulator(op, 1);
        ExecutorService executor = Executors.newFixedThreadPool(4);
        IntStream.range(1, 11).forEach(i -> {
            executor.submit(() -> accumulator.accumulate(i));
        });
        Thread.sleep(2000);
        System.out.println(accumulator.getThenReset());
    }
}
