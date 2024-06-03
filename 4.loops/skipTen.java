import java.util.*;

public class skipTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers ");
        do {
            int n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println("skip multiple of 10");
                continue;
            }
            System.out.println(" " + n);
            sc.close();
        } while (true);
        
    }
}
