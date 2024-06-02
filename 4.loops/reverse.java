import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number = ");
        int n = sc.nextInt();
        int num = n;
        int count = 0;
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
        sc.close();
    }
}
