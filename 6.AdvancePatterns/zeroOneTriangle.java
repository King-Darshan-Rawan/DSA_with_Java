import java.util.*;
public class zeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length = ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                String str = (count%2 == 0) ? "1":"0";
                System.out.print(str);
                count++;
            }
            System.out.println();
        }
        sc.close();;
    }
}
