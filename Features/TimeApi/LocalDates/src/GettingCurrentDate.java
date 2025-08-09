import java.time.LocalDate;

public class GettingCurrentDate {
    public static void main(String[] args) {
        // now() method will return the current date
        LocalDate date  = LocalDate.now();
        System.out.println(date);
    }
}