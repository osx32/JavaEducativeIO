import java.util.concurrent.CompletableFuture;

public class GetCompletableFuture {
    public static void main(String[]args){
        CompletableFuture<String> completableFuture = CompletableFuture.completedFuture("Hello World");
        try{
            System.out.println(completableFuture.get());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
