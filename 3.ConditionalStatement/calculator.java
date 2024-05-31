import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please make sure a is greater then b");
        System.out.print("Enter a number a = ");
        int a = sc.nextInt();
        System.out.print("Enter a number b = ");
        int b = sc.nextInt();
        System.out.println("enter a number respectively from 1 to 5\nFor the following operation you want to perform\n /,+,-,* and %");
        int operation = sc.nextInt();
        switch (operation) {
            case 1:System.out.println("Division is = " + (a / b));
                break;
            case 2:System.out.println("Addition is = " + (a + b));
                break;
            case 3:System.out.println("Substraction is = " + (a - b));
                break;
            case 4:System.out.println("Multipication is = " + (a * b));
                break;
            case 5:System.out.println("Remender is = " + (a % b));
                break;
        
            default: System.out.println("ThankYou");
                break;
        }
        sc.close();
    }
}
