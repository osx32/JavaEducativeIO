public class SynchrounousExecution {
    static void downloadFile(String fileName){
        System.out.println("Downloading: " + fileName + "....");
        try{
            Thread.sleep(1000); //Simulate download time
        }
        catch(InterruptedException e){}

        System.out.println(fileName + " downloaded.");
    }
}
