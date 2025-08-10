import java.time.LocalTime;
import java.time.Period;

public class CreatingPeriod {
    public static void main(String[] args) {
        Period period = Period.ofDays(5); //Period of 5 days
        System.out.println(period.getDays());

        period = Period.ofMonths(3); //Period of 3 days
        System.out.println(period.getMonths());

        period = Period.ofYears(2); //Period of 2 Years
        System.out.println(period.getYears());

        period = Period.of(2,5,12); //Period of 2 Years, 5 Month and 12 Days

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}