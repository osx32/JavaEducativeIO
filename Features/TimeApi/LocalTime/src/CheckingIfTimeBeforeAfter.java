import java.time.LocalTime;

public class CheckingIfTimeBeforeAfter {
    public static void main(String[] args) {
        boolean isBefore= LocalTime.parse("06:23")
                .isBefore(LocalTime.parse("07:50"));
        System.out.println(isBefore);

        boolean isAfter = LocalTime.parse("06:23")
                .isAfter(LocalTime.parse("07:50"));
        System.out.println(isAfter);

    }

}
