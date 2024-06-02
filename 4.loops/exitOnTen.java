import java.util.*;
public class exitOnTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers ");
        do {
            int n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println("I am out");
                break;
            }
            System.out.println(" " + n);

        } while (true);
        sc.close();
    }
}
