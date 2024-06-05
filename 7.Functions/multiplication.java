import java.util.*;
public class multiplication {
    public static void mult(int num1,int num2) {
        int mult = num1 * num2 ;
        System.out.println(num1 + " x " + num2 + " = " + mult);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        mult(a, b);
        sc.close();
    }
}
