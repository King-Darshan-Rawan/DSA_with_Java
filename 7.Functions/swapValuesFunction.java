import java.util.*;
public class swapValuesFunction {

    public static void swapFunction(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("----------SWAP-----------");
        System.out.println("a = " + num1);;
        System.out.println("b = " + num2);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        swapFunction(a, b);
        sc.close();
    }
}
