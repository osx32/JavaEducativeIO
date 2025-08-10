import java.time.LocalDateTime;

public class GettingSpecificDateTimeUsingParse {
    public static void main(String[] args){
        //parse(CharSequence text)
        LocalDateTime date = LocalDateTime.parse("2020-06-20T07:54:00");
        System.out.println(date);
    }

}
