import java.util.*;
public class primeInRange {
    public static void isprime(int n){
        
        for (int i = 2; i < n; i++) {
            boolean p = true;
            if (n%i == 0) {
                p = false;
                continue;
            }
            else if (n == 2) {
                p = true;
                break;
            }
            if (p = true) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting : ");
        int a = sc.nextInt();
        System.out.print("Enter the ending of range : ");
        int n = sc.nextInt();
        System.out.println("-----------Prime numbers-------------");
        for (int i = a; i <= n; i++) {
            isprime(i);
        }
        sc.close();
    }
}
