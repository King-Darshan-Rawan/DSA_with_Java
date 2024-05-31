import java.util.*;

public class TaxCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the income in lacks = ");
        int income = sc.nextInt();
        double tax;
        if (income <= 5) {
            tax = 0;
            System.out.println("you dont have to pay tax");
        }
        else if (income > 5 && income < 10) {
            tax = 0.20 * income;
            System.out.println("you have to pay tax = " + tax + "L");
        }
        else if (income >= 10) {
            tax = 0.30 * income;
            System.out.println("you have to pay tax = " + tax + "L");
        }
        sc.close();
    }
}
