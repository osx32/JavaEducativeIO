import java.util.concurrent.*;

public class ThenCombineCompletable {
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

        // Calling thenCompose() which takes a Function as parameter
        // It takes a number as input and returns a CompletableFuture of double of number
        CompletableFuture<Integer> resultFuture = future.thenCombine(
                CompletableFuture.supplyAsync(() -> 20), (num1, num2) -> num1 + num2);

        try{
            System.out.println(resultFuture.get());
        }
        catch(InterruptedException | ExecutionException e){
            e.printStackTrace();
        }

    }

}
