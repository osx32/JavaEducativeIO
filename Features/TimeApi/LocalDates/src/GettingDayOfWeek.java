import java.time.DayOfWeek;
import java.time.LocalDate;

public class GettingDayOfWeek {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = LocalDate.parse("2017-04-06").getDayOfWeek();
        System.out.println(dayOfWeek);
    }

}
