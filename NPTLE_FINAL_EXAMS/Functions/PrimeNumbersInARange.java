public class PrimeNumbersInARange {
    public static boolean IsPrime(int n){
        if (n <= 1) {  // Handle numbers less than or equal to 1
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {  // Correct the loop condition to check up to sqrt(n)
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int a = 1;
        int b = 12;
        for (int i = a; i <= b; i++) {
            if (IsPrime(i)) {
                System.out.println(i + " is prime");
            } 
        }
    }
}
