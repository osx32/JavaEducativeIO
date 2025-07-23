public class MainIOandCPUbound {
    public static void main(String[] args) {
            int count = 0;
            for(int i = 2; i < 1000000; i++){
                if(PrimeNumberCalculator.isPrime(i)){
                    count++;
                }
            }
            System.out.println("Total prime numbers found: " + count);
        }
}
