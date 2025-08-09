import java.util.concurrent.*;

public class ThenRunProcessing {
    public static void main(String[] args){
        // Create a future which returns an integer
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try{
                TimeUnit.SECONDS.sleep(1);
                System.out.println(Thread.currentThread().getName());
            }
            catch (InterruptedException e){
                throw new IllegalStateException(e);
            }
            return 50;
        });

        // Calling thenApply() whşch takes a Function as parameter
        // It takes a number as input and returns double of number
        future.thenRun(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Hello");
        });
    }

}
