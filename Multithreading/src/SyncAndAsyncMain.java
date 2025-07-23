import java.util.concurrent.*;

public class SyncAndAsyncMain extends Thread{
    public static void main(String[] args){
//        SynchrounousExecution.downloadFile("File1");
//        SynchrounousExecution.downloadFile("File2");
//        SynchrounousExecution.downloadFile("File3");

//        Thread t1 = new Thread(() -> AsynchronousExecution.downloadFile("File1"));
//        Thread t2 = new Thread(() -> AsynchronousExecution.downloadFile("File2"));
//        Thread t3 = new Thread(() -> AsynchronousExecution.downloadFile("File3"));
//
//        t1.start();
//        t2.start();
//        t3.start();

        CompletableFuture.runAsync(() -> {
            try{
                Thread.sleep(1000);
                System.out.println("Async task done");
            }
            catch(InterruptedException e){}
            });
            System.out.println("Main thread continues...");
    }
}
