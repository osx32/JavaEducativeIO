import java.util.Optional;

public class OrElseThrowOptional {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        //This will throw exception
        try{
            System.out.println(optional.orElseThrow(() -> new Exception("Resource not found")));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
