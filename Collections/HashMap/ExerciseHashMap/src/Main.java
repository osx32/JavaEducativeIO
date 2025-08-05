import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle", 56);
        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);
        stockPrice.put("Google", 421);
        stockPrice.put("Ford", 456);
        stockPrice.put("Novartis", 43);
        stockPrice.put("TCS", 23);


        //   #1
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for(Map.Entry<String, Integer> entry : stockPrice.entrySet()){
            if(entry.getValue() > maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        System.out.println("En yüksek puan: " + maxValue + " (" + maxKey + ")");


        //    #2
        int sum = 0;
        for(Integer i : stockPrice.values()){
            sum+=i;
        }
        System.out.println("Average stock price is : " + sum);




        //   #3
        stockPrice.entrySet()
                .removeIf(map -> map.getValue()<50);
        stockPrice.forEach( (k, v) -> { System.out.println(k + " -> " + v); } );

        Iterator<Entry<String, Integer>> itr = stockPrice.entrySet().iterator();
        while (itr.hasNext()){
            Entry<String, Integer> entry = itr.next();
            if(entry.getValue() < 50){
                itr.remove();
            }
        }
        System.out.println(stockPrice);
    }
}