import java.util.*;

public class Area{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int r = sc.nextInt();
        double area = 3.14 * r * r;
        double cir = 3.14 * 2 * r; 
        System.out.print("Area = ");
        System.out.println(area);
        System.out.print("circumference = ");
        System.out.println(cir);
    }
}