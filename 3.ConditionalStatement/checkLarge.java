import java.util.Scanner;

public class checkLarge {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("enter the number A = ");
     int a = sc.nextInt();
     System.out.print("enter the number B = ");
     int b = sc.nextInt();
     if (a > b){
        System.out.println("A is greater then B");
     }
     if (a == b){
       }
     else{ if (a == b) {
        System.out.println("Both are equal");
     }
     else{
        System.out.println("A is less then B");
     }
    }
     sc.close();   
    }
}
