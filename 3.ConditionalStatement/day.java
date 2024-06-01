import java.util.*;
public class day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the day number = ");
        int daynum = sc.nextInt();
        switch (daynum) {
            case 1:System.out.println("Monday");
                break;
            case 2:System.out.println("Tuesday");
                break;
            case 3:System.out.println("Wed");
                break;
            case 4:System.out.println("Thu");
                break;
            case 5:System.out.println("Fri");
                break;
            case 6:System.out.println("Sat");
                break;
            case 7:System.out.println("sun");
                break;
        
            default:System.out.println("please enter a valid day");
                break;
        }
        sc.close();
    }
}