import java.util.*;
public class PlayWithButtons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Push a button from 1 - 3");
        int button = sc.nextInt();
        switch (button) {
            case 1: System.out.println("Samosa");
                break;
            case 2 : System.out.println("noodles");
                break;    
            case 3 : System.out.println("Ras Malai");
                break;

            default:System.out.println("Thankyou for the order but Dish not found");
        }
        sc.close();
        
    }
    
}
