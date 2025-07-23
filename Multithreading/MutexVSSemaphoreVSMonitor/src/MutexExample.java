public class MutexExample {
    private int counter = 0;

    //Method protected by implicit mutex (synchronized)
    public synchronized void increment() {
        counter++;
    }

    public int getCounter(){
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {
        MutexExample example = new MutexExample();

        //Thread 1 - increments counter 1000 times
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                example.increment();
            }
        });

        //Thread 2 - also increments counter 1000 times
        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                example.increment();
            }
        });

        //Start both treads
        t1.start();
        t2.start();

        //Wait for both threads to finish
        t1.join();
        t2.join();

        //Output the final counter value
        System.out.println("Final Counter: "+ example.getCounter());
    }

}
