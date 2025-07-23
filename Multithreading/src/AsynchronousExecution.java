public class AsynchronousExecution {
    static void downloadFile(String fileName){
        System.out.println("Downloading " + fileName + " on " + Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){}
        System.out.println(fileName + " downloaded");

    }
}
