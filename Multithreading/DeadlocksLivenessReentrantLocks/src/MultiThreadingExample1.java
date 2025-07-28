import java.util.Scanner;

public class MultiThreadingExample1 {
    public static void main(String[] args) {
        //Threading = Allow a program to run multiple tasks simultanesously
        //Helps improve performance with time-consuming operations
        //(File I/O, network communications, or any background tasks)

        //How to create a Thread
        //Option 1. Extend the Thread class(simpler)
        //Option 2. Implement the Runnable interface (better)

        Scanner sc = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("You have 5 seconds to enter your name");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        sc.close();
    }
}
