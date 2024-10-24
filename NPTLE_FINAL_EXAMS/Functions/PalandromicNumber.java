import java.util.*;
public class PalandromicNumber {
    public static boolean Palandrom(int n){
        boolean isPalandrom = false;
        int x = 0;
        int org = n;
        while (n != 0) { 
            int lastdigit = n % 10;
            x = x * 10+ lastdigit; 
            n = n/10; 
        }
        if (x == org) {
            isPalandrom = true;
        }
        System.out.println(x);
        return isPalandrom;
    }
    public static void main(String[] args) {
        int n = 214;
            System.out.println("Palandromic? = " + Palandrom(n));
    }
}
