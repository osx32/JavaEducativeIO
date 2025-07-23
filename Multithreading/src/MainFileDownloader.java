public class MainFileDownloader {
    public static void main(String[] args) {
        //FileDownloader
        //Create donwload tasks
        Thread t6 = new Thread(new FileDownloader("file1.mp4"));
        Thread t7 = new Thread(new FileDownloader("file2.pdf"));
        Thread t8 = new Thread(new FileDownloader("file3.zip"));

        //Start all threads
        t6.start();
        t7.start();
        t8.start();

        try{
            // MAin thread waits for all downloads to complete
            t6.join();
            t7.join();
            t8.join();
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrıpted");
        }
        System.out.println("All downloads completed. Exiting program.");
    }

}
