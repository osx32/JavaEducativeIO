import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class FindingDifferenceBetweenTwoDates {
    public static void main(String[] args){
        Period period = Period.between(LocalDate.parse("2020-05-18"), LocalDate.parse("2017-04-17"));
        System.out.println(period);
    }


}
