import java.util.*;

public class conditionFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("Men");
        }
        else{
            System.out.println("kid");
        }
        sc.close();
    }
}
