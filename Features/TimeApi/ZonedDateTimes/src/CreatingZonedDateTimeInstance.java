import java.time.ZoneId;
import java.time.ZonedDateTime;

public class CreatingZonedDateTimeInstance {
    public static void main(String[] args) {
        //Fetching the current TimeZone
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        //Fetching the ZoneId for Canada/Atlantic
        ZoneId zoneId = ZoneId.of("Canada/Atlantic");

        zonedDateTime =
                ZonedDateTime.of(2020,10,15,23,45,59,1234,zoneId);
        System.out.println(zonedDateTime);
    }

}
