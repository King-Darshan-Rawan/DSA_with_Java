import java.util.Scanner;

public class isPrime {
    public static boolean prime(int n) {
        boolean p = true;
        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                p = false;
            }
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num = ");
        int n = sc.nextInt();
        System.out.println("Its a prime number: " + prime(n));
        sc.close();
    }
}
