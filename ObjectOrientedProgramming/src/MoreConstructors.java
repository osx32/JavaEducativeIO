class Date2{
    private int day;
    private int month;
    private int year;
    private String event;

    //Default constructor
    public Date2(){
        // We must define the default values for day, month, and year
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }

    //Paramaterized constructor
    public Date2(int day, int month, int year){
        //The arguments are used as values
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Parameterized constructor
    public Date2(int day, int month, int year, String event){
        this(day, month, year); // calling the contstructor
        this.event = event;

    }

    //A simple print function
    public void printDate(){
        if(event != null){
            System.out.println("Date: " + day + " / " + month + " / " + year + " / " + event);
            return ;
        }
        System.out.println("Date: " + day + " / " + month + " / " + year);
    }

}


public class MoreConstructors {
    public static void main(String[] args){
        // Call the date constructor to create its object;
        Date2 date2 = new Date2(1,8,2018); // Object created with specified values   ||  Object created with default values
        date2.printDate();

        Date2 date3 = new Date2(24,10,2024,"Birthday");
        date3.printDate();
    }
}
