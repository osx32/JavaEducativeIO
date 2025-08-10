import java.time.LocalDateTime;

public class GettingCurrentDateTime {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);
    }
}