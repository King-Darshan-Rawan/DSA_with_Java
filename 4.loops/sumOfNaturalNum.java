import java.util.*;

public class sumOfNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth natural number");
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        while (count < n) {
            sum = sum + count;
            count++;
        }
        System.out.println("the summation of first" + n + " natural num is " + sum);
        sc.close();
    }
}
