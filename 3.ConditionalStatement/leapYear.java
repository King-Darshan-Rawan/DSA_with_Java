import java.util.*;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr an Year = ");
        int year = sc.nextInt();
        String leap = (year % 4 == 0 && year % 100 ==0 && year % 400 == 0)? "leap" : "not a leap";
        System.out.println("its " + leap + " year.");
        sc.close();
    }
}
