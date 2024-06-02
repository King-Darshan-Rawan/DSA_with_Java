import java.util.*;

public class reverse {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number = ");
        int n = sc.nextInt();
        /* 
        int num = n;
        int count = 0;

        // normal logic
        
        while (num != 0) {
            num = num/10;
            count++;
        }
        System.out.print("the reverse is = ");
        for (int i = 0; i < count; i++) {
            System.out.print(n % 10);
            n = n / 10;
        }
        System.out.println();
        */
        
        // logic ++

        int rev = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            rev = (rev * 10) + rem; 
            n = n / 10;
        }
        System.out.println("the reverse is = " + rev);
        sc.close();
    }
}
