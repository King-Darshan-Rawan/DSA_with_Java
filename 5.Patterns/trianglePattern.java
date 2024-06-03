import java.util.*;
public class trianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the side = ");
        int n = sc.nextInt();
        // lowerbottom
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");    
            }
            System.out.println();
        }    
        System.out.println("\n-----triangle-----\n");
        // upper bottom
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print(" * ");    
            }
            System.out.println();
        } 
        sc.close();
    }
}
