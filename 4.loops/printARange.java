import java.util.*;
public class printARange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range \n Starting = ");
        int counter = sc.nextInt();
        System.out.println("Ending = ");
        int n = sc.nextInt();
        while (counter <= n) {
            System.out.println(counter);
            counter ++;
        }
        sc.close();

    }
}
