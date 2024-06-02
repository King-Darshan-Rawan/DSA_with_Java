import java.util.*;
public class findFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Want to find factorial of = ");
        int n = sc.nextInt();
        int mult = 1;
        for (int i = 1; i <= n; i++) {
            mult = mult * i;
        }
        System.out.println("factorial of " + n + " is " + mult);
        sc.close();
    }
    
}