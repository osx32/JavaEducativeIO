public class RecursionExample {
    public static int factorial(int n){
        if(n == 0){ // base case
            return 1;
        }
        return n * factorial(n-1); // recursive call
    }
}
