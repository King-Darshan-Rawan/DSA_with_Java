import java.util.*;
public class factorialFunction {
    public static void factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("factorial = " + fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num = ");
        int n = sc.nextInt();
        factorial(n);
        sc.close();
    }
}
