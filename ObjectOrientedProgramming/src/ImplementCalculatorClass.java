class CalculatorUsing{
    //Class fields
    private double num1;
    private double num2;

    //Default constructor
    public CalculatorUsing(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    //Addition method
    double add(){
        return this.num1 + this.num2;
    }

    //Subtraction method
    double subtract(){
        return this.num1 - this.num2;
    }

    //Multiplication method
    double multiply(){
        return this.num1 * this.num2;
    }

    //Division method
    double divide(){
        return this.num1 / this.num2;
    }

}


public class ImplementCalculatorClass {
    public static void main(String[] args) {
        CalculatorUsing calculate = new CalculatorUsing(5,6);
        System.out.println(calculate.add());
        System.out.println(calculate.subtract());
        System.out.println(calculate.multiply());
        System.out.println(calculate.divide());
    }
}
