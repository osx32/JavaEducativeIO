import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AddingDaysMonthsGivenDate {
    public static void main(String[] args){
        // Adding 4 days to the given date
        LocalDate date = LocalDate.parse("2015-02-12").plusDays(4);
        System.out.println(date);

        // Adding 4 months to the given date
        date = LocalDate.parse("2015-02-12").plus(4, ChronoUnit.MONTHS);
        System.out.println(date);
    }

}
