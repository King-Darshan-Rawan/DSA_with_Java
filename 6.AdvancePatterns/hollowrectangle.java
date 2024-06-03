import java.util.Scanner;
public class hollowrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length = ");
        int a = sc.nextInt();
        System.out.println("enter the width = ");
        int b = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                // logic 1
                
                if ((i == 1 || i == a) || ( j == 1 || j == b)) {
                    System.out.print("*");    
                }
                else{
                    System.out.print(" ");
                }
                
                // logic 2
                
                String c = ((i == 1 || i == a) || ( j == 1 || j == b)) ? "*" : " ";
                System.out.print(c);
                
            }
            System.out.println();
        }
        sc.close();
    }
}
