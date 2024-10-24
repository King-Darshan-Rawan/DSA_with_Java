public class PrimeNumber {

    // public static boolean IsPrime(int n){
    //     boolean isPrime = true;
    //     for (int i = 2; i < n; i++) {
    //         if (n % i == 0){
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }
    public static boolean IsPrime(int n){
        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main (String [] args){
        int n = 5;
        System.out.println("Its a prime number ? " + IsPrime(n));
    }
}
