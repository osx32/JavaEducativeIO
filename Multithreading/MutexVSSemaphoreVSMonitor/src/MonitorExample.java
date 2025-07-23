class MessageBox{
    private String message;
    private boolean hasMessage = false;


    //synchronized method to receive message (consumer)
    public synchronized String receive(){
        while (!hasMessage){
            try{
                wait(); // Wait if no message available
            }
            catch (InterruptedException e){ e.printStackTrace();}
        }
        hasMessage = false;
        notify(); // Notify producer that space is available
        return message;
    }

    //synchronized method to send message (Producer)
    public synchronized void send(String msg){
        while(hasMessage){
            try{
                wait(); // Wait if previous message not yet consumed
            }
            catch(InterruptedException e){e.printStackTrace();}
        }

        this.message = msg;
        hasMessage = true;
        notify(); // Notify consumer that message is ready
    }
}

public class MonitorExample {
    public static void main(String[] args){
        MessageBox box = new MessageBox();

        //Producer Thread
        Thread producer = new Thread(() -> {
            String[] messages = {"Hello","World","from","Java","Monitor!"};
            for(String msg: messages){
                box.send(msg);
                System.out.println("Sent: " + msg);
                try{
                    Thread.sleep(1000); // Simulate delay
                }
                catch (InterruptedException e){ e.printStackTrace();}
            }
        });

        //Consumer Thread
        Thread consumer = new Thread(() -> {
            for(int i = 0; i < 5; i++){
                String msg = box.receive();
                System.out.println("Received: " + msg);
                try{
                    Thread.sleep(1500); // Simulate processing time
                }
                catch(InterruptedException e){ e.printStackTrace();}
            }
        });
        producer.start();
        consumer.start();
    }
}
