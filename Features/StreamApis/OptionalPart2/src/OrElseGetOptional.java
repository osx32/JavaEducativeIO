import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OrElseGetOptional {
    public static String getDefaultValue(){
        return "default";
    }

    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        //This will return the default value
        System.out.println(optional.orElseGet(OrElseGetOptional::getDefaultValue));
    }

}
