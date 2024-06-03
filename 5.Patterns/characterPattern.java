import java.util.*;

public class characterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length");
        //1st logic
        /*
        char n = sc.next().charAt(0);
        for (char i = 'A'; i <= n; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
         */
        //2d logic
        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
