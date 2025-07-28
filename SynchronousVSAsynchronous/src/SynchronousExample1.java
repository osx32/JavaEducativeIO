import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class SynchronousExample1 {
    private static int count = 0;
    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(4);
        IntStream.range(0, 1000)
                .forEach(i -> executor.submit(SynchronousExample1::increment));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(count);
    }

    static void increment(){
        count++;
    }
}
