import java.util.concurrent.*;

public class ThenApplyAsyncProcessing {
    public static void main(String[] args){
        // Create a future which returns an integer
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try{
                TimeUnit.SECONDS.sleep(1);
                System.out.println(Thread.currentThread().getName());
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            return 50;
        });

        // Calling thenApply() which takes a Function as parameter
        // It takes a number as input and returns double of number
        CompletableFuture<Integer> resultFuture = future.thenApplyAsync(num -> {
            System.out.println(Thread.currentThread().getName());
            return num * 2;
        });

        try{
            System.out.println(resultFuture.get());
        }
        catch (ExecutionException | InterruptedException e){
            e.printStackTrace();
        }
    }

}
