import java.time.LocalTime;

public class GettingCurrentTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
    }
}