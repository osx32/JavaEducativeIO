import java.time.LocalTime;

public class GettingMinuteFromTime {
    public static void main(String[] args) {
        int minute = LocalTime.parse("07:45").getMinute();
        System.out.println(minute);
    }
}
