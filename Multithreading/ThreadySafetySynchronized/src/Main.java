public class Main {
    public static void main(String[] args) throws InterruptedException {
        try {
            IncorrectSynchronization.runExample();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

