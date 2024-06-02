import java.util.*;
public class newMultiplicatonTableOfIniger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("You want the table of number ? ");
        int n = sc.nextInt();
        System.out.println("-----Table-----");
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        System.out.println("---------------");
        sc.close();
    }
    
}
