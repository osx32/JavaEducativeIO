//import java.util.concurrent.Semaphore;
//public class SemaphoreExample {
//
//}
//
//class Philosophers extends Thread{
//    private Semaphore sem;
//
//    //Did the philosopher eat?
//    private boolean full = false;
//    private String name;
//
//    Philosophers(Semaphore sem, String name){
//        this.sem = sem;
//        this.name = name;
//    }
//
//    public void run(){
//        try{
//            //If the philosopher has not eaten
//            if(!full){
//                //Ask the semaphore for permission to run
//                sem.acquire();
//                System.out.println(name + " takes a seat at the table");
//
//                //The philosopher eats
//                sleep(300);
//                full = true;
//
//                System.out.println(name + " has eaten! He leaves the table");
//                sem.release();
//
//                //The philosopher leaves, making room for others
//                sleep(300);
//            }
//        }
//        catch (InterruptedException e) { System.out.println("Something went wrong.");}
//    }
//}

import java.util.concurrent.Semaphore;
public class SemaphoreExample {
    //Create a Semaphore with 2 permits (like 2 keys)
    private static final Semaphore semaphore = new Semaphore(2);

    public static void main(String[] args) throws InterruptedException {
        //Create and start 5 threads
        for(int i = 0; i <= 5; i++){
            Thread t = new Thread(new Worker(i));
            t.start();
        }
    }

    static class Worker implements Runnable{
        private final int id;

        public Worker(int id){
            this.id = id;
        }

        @Override
        public void run(){
            try{
                System.out.println("Thread " + id + " waiting for permit....");

                semaphore.acquire(); // Request to enter ( acquire a permit)

                System.out.println("Thread " + id + " acquired permmit and entered.");
                Thread.sleep(2000); // Simulate like it's working

                System.out.println("Thread " + id + " is releasing permit.");
                semaphore.release(); // Return the permit
            }
            catch (InterruptedException e){ System.out.println("Thread " + id + " was interrupted.");}
        }
    }
}

