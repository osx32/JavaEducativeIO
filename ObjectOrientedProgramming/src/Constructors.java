class Date{
    private int day;
    private int month;
    private int year;

    //Default constructor
    public Date() {
        // We must define the default values for day, month, and year
        day = 0;
        month = 0;
        year = 0;
    }

    // Parameterized constructor
    public Date(int d, int m, int y){
        day = d;
        month = m;
        year = y;
    }

    // A simple print function
    public void printDate(){
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}


public class Constructors {
    public static void main(String[] args) {
        // Call the Date constructor to create its object;

        Date date = new Date(24,10,1998); // Object created with default values
        date.printDate();
    }

}
