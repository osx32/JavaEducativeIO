import java.time.DayOfWeek;
import java.time.Month;
import java.time.ZonedDateTime;

public class FetchingDateTimeZonedDateTime {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        int year = zonedDateTime.getYear();
        System.out.println("Year is: " + year);

        Month month = zonedDateTime.getMonth();
        System.out.println("Month is: " + month);

        int dayOfMonth = zonedDateTime.getDayOfMonth();
        System.out.println("DayOfMonth is: " + year);

        DayOfWeek dayOfWeek = zonedDateTime.getDayOfWeek();
        System.out.println("Day of week is: " + dayOfWeek);

        int dayOfYear = zonedDateTime.getDayOfYear();
        System.out.println("Day of year is: " + dayOfYear);

        int hour = zonedDateTime.getHour();
        System.out.println("Hour is: " + hour);

        int minute = zonedDateTime.getMinute();
        System.out.println("Minute is: " + minute);

        int second = zonedDateTime.getSecond();
        System.out.println("Second is: " + second);

        int nano = zonedDateTime.getNano();
        System.out.println("Nano is: " + nano);

    }

}
