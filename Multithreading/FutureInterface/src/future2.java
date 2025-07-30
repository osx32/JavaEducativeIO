import java.util.concurrent.*;

public class future2 {
    static ExecutorService threadPool = Executors.newFixedThreadPool(2);

    public static void main(String[] args) throws Exception{
        System.out.println(" sum: " + findSumWithException(10));
        threadPool.shutdown();
    }

    static int findSumWithException(final int n) throws ExecutionException, InterruptedException {
        int result = -1;
        Callable<Integer> sumTask = new Callable<Integer>(){
            public Integer call() throws Exception{
                throw new RuntimeException("something bad happened");
            }
        };

        Future<Integer> f = threadPool.submit(sumTask);

        try{
            result = f.get();
        }
        catch (ExecutionException e){
            System.out.println("Something went wrong " + e.getCause());
        }
        return result;
    }
}
