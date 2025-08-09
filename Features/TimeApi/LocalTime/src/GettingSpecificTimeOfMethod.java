import java.time.LocalTime;

public class GettingSpecificTimeOfMethod {
    public static void main(String[] args){
        //of(int hour, int minute)
        LocalTime time = LocalTime.of(11,25);
        System.out.println(time);

        //of(int hour, int minute, int second)
        time = LocalTime.of(11,25,03);
        System.out.println(time);

        //of(int hour, int minute, int second, int nanoSecond)
        time = LocalTime.of(11,25,04,323);
        System.out.println(time);

    }
}
