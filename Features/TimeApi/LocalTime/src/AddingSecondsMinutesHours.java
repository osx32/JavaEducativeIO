import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class AddingSecondsMinutesHours {
    public static void main(String[] args) {
        //Adding 4 seconds to the given time
        LocalTime time = LocalTime.parse("12:54:53").plusSeconds(4);
        System.out.println(time);

        //Adding 10 minutes to the given time
        time = LocalTime.parse("12:54:53").plusMinutes(10);
        System.out.println(time);

        //Adding 2 hours to the given time
        time = LocalTime.parse("12:54:53").plusHours(2);
        System.out.println(time);

        //Adding 4 minutes to the given time
        time = LocalTime.parse("12:54:53").plus(4, ChronoUnit.MINUTES);
        System.out.println(time);
    }

}
