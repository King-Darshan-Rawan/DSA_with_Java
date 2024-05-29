import java.util.*;

public class inputfromuser{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String structure = sc.next();
        System.out.println(structure);


        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
        int mult = a*b;
        System.out.println(mult);
    }
}