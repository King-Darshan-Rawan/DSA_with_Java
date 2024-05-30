import java.util.*;
public class practceQuestions {
    //Average of 3 numbers 
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print("The average is = ");
        System.out.println((double)((a+b+c)/3));
        sc.close(); 
    }
    */
    //Area of circule
    /*
    public static void main(String args[]){
        System.out.print("Enter the side of square = ");
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        double Area = side * side ;
        System.out.print("Area of square = ");
        System.out.println(Area);
        sc.close(); 
    }
     */

     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pen pencile and eraser respectively");
        float pen = sc.nextFloat();
        float pencile = sc.nextFloat();
        float eraser = sc.nextFloat();
        double GST = 0.18 * (pen + pencile + eraser);
        double price = pen + pencile + eraser + GST;
        System.out.print("You have done Shoping of rupees = ");
        System.out.println(price);
        System.out.println("ThankYou");

    }
}
