import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator2 {
    public static void main(String[] args) {
        List<Vehicle4> list = new ArrayList<>();
        list.add(new Vehicle4("Volkswagen", 2010));
        list.add(new Vehicle4("Audi", 2009));
        list.add(new Vehicle4("Ford", 2001));
        list.add(new Vehicle4("BMW", 2015));


        System.out.println("Sorting by brand name");
        Collections.sort(list, new Comparator<Vehicle4>(){
            @Override
            public int compare(Vehicle4 o1, Vehicle4 o2){
                return o1.brand.compareTo(o2.brand);
            }
        });

        for(Vehicle4 vehicle4 : list){
            System.out.println("Vehicle Brand: " + vehicle4.brand + ", Vehicle Make: " + vehicle4.makeYear);
        }

        System.out.println("Sorting by make year");
        Collections.sort(list, new Comparator<Vehicle4>(){
            @Override
            public int compare(Vehicle4 o1, Vehicle4 o2){
                return o1.makeYear.compareTo(o2.makeYear);
            }
        });

        for(Vehicle4 vehicle4 : list){
            System.out.println("Vehicle Brand: " + vehicle4.brand + ", Vehicle Make: " + vehicle4.makeYear);
        }

    }
}

class Vehicle4{
    String brand;
    Integer makeYear;

    public Vehicle4(String brand, Integer makeYear){
        super();
        this.brand = brand;
        this.makeYear = makeYear;
    }
}