import java.util.*;
public class feaver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your body temp. = ");
        double temp = sc.nextDouble();
        String feaver = (temp >=100) ? "have" : "Dont Have";
        System.out.println("You " + feaver + " Feaver" );
        sc.close();

    }
}