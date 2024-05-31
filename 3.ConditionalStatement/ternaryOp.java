import java.util.Scanner;

public class ternaryOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        String type = ((num%2) == 0) ? "Even" : "Odd";
        System.out.println("It is " + type);
        sc.close();
    }
}
