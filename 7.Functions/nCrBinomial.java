import java.util.Scanner;

public class nCrBinomial {
    public static void expantion(int n, int r) {
        int factn = 1;
        int factr = 1;
        int factnr = 1;
        for (int i = 1; i <= n; i++) {
            factn = factn * i;
        }
        for (int i = 1; i <= r; i++) {
            factr = factr * i;
        }
        for (int i = 1; i <= (n - r); i++) {
            factnr = factnr * i;
        }
        double ans = factn / (factnr * factr);
        // System.out.println(factn + " " + factr + " " + factnr);
        System.out.print("Combination = " + ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("to find binomial combination");
        System.out.print("Enter n = ");
        int n = sc.nextInt();
        System.out.print("Enter r = ");
        int r = sc.nextInt();
        expantion(n, r);
        sc.close();
    }
}
