import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Vehicle implements Comparable<Vehicle> {
    String brand;
    Integer makeYear;

    public Vehicle(String brand, Integer makeYear){
        super();
        this.brand = brand;
        this.makeYear = makeYear;
    }

    @Override
    public int compareTo(Vehicle o){
        return this.makeYear - o.makeYear;
        //We can also use the compareTo() method of the Integer class.
        //return this.makeYear.compareTo(o.makeYear)
    }

}


public class CompareTo {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle("Volkswagen", 2010));
        list.add(new Vehicle("Audi", 2009));
        list.add(new Vehicle("Ford", 2001));
        list.add(new Vehicle("BMW", 2015));

        Collections.sort(list);
        for(Vehicle vehicle : list){
            System.out.println("Vehicle Brand: " + vehicle.brand + ", Vehicle Make: " + vehicle.makeYear);
        }
    }
}
