public class FileDownloader implements Runnable{
    private String fileName;

    FileDownloader(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void run(){
        System.out.println("Download started: " + fileName);
        for(int i  = 0; i <= 10; i++){
            try{
                Thread.sleep(300);
            }
            catch(InterruptedException e){
                System.out.println(fileName + " download interrupted");
            }
            System.out.println("[" + fileName + "] " + (i * 10) + "% downloaded");
        }
        System.out.println("Download complete: " + fileName + "\n");
    }

}

