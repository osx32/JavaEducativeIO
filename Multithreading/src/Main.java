public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new CreateThread());
        thread.start();

        CreateThreadViaInheritance t1 = new CreateThreadViaInheritance();
        t1.start();

        MyThread t2 = new MyThread();
        t2.start();  // starts the thread

        Thread t3 = new Thread(new MyRunnable());
        t3.start();

        Task1 t4 = new Task1();
        Task2 t5 = new Task2();

        t4.start(); // run Task1 in parallel
        t5.start(); // run Task2 in parallel

        CheckingIsAlive threadCheck = new CheckingIsAlive();
        threadCheck.start();
        //Wait for the thread to finish
        while(threadCheck.isAlive()){
            System.out.println("Waiting....");
        }
        //Update amount and print its value
        System.out.println("Main: " + CheckingIsAlive.amount);
        CheckingIsAlive.amount++;
        System.out.println("Main: " + CheckingIsAlive.amount);



    }
}