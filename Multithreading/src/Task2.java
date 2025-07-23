public class Task2 extends Thread{
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Task2 - " + i);
        }
    }
}
