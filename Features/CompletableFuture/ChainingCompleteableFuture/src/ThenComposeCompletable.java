import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class ThenComposeCompletable {
    public static void main(String[] args) {
        // Create a future which returns an integer
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try{
                TimeUnit.SECONDS.sleep(1);
                System.out.println(Thread.currentThread().getName());
            }
            catch(InterruptedException e){
                throw new IllegalStateException(e);
            }
            return 50;
        });

        // Calling thenCompose() which takes a Function as parameter
        // It takes a number as input and returns a CompletableFuture of double of number
        CompletableFuture<Integer> resultFuture = future.thenCompose(num ->
                CompletableFuture.supplyAsync(() -> num * 2));

        try{
            System.out.println(resultFuture.get());
        }
        catch(InterruptedException | ExecutionException e){
            e.printStackTrace();
        }

    }
}