import java.time.ZoneId;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Fetching the ZoneId for given Zone
        ZoneId zoneId = ZoneId.of("America/Marigot");
        System.out.println("Zone Id " + zoneId);

        //Fetching a Set of all Zoneids
        Set<String> zoneIdList = ZoneId.getAvailableZoneIds();

        for (String zone : zoneIdList){
            System.out.println(zone);
        }

    }
}
