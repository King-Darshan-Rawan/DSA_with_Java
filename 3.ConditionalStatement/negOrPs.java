import java.util.*;
public class negOrPs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        String type = (num > 0) ? "Possitive" : "Negetive";
        System.out.println("Its a " + type + " number");
        sc.close();
    }
}