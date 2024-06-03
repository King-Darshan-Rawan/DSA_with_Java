import java.util.*;
public class sumOfOddAndEvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a range");
        System.out.print("Start = ");
        int startRange = sc.nextInt(); 
        System.out.print("End = ");
        int endRange = sc.nextInt();
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = startRange; i <= endRange; i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            }
            else{
                sumOdd = sumOdd + i;
            }
        }
        System.out.println("The sum of even numbers = " + sumEven);
        System.out.println("The sum of odd numbers = " + sumOdd);
        sc.close();
    }
}
