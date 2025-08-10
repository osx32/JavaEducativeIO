import java.time.Duration;
import java.time.LocalTime;

public class FindingDifferenceBetweenTwoValues {
    public static void main(String[] args) {
        Duration duration = Duration.between(LocalTime.parse("12:14"), LocalTime.parse("13:15"));

        System.out.println("The difference is " + duration.getSeconds() + " Seconds");
    }
}
