import java.util.*;

public class printLargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number A = ");
        int A = sc.nextInt();
        System.out.println("Enter number B = ");
        int B = sc.nextInt();
        System.out.println("Enter number C = ");
        int C = sc.nextInt();
        if ((A > B) && (A > C)) {
            System.out.println("The largest num. is A = " + A);
        }
        else if ((A < B) && (B > C)) {
            System.out.println("The largest num. is B = " + B);
        }
        else if ((A < C) && (B < C)) {
            System.out.println("The largest num. is C = " + C);
        }
        else {
            System.out.println("ALL ARE EQUAL \n" + A + " = " + B + " = " + C);
        }
        sc.close();
    }
}
