import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class IOBound {
    public static void main(String[] args){
        String filePath = "C:\\Users\\Kaan\\Desktop\\onemillion.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                //Simulating processing of each line
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found: "+ filePath);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}


