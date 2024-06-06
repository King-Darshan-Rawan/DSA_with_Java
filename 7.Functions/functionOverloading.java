// import java.util.*;
public class functionOverloading {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    public static void main(String[] args) {
        System.out.println(sum(5, 10));
        System.out.println(sum(5, 10, 20));
        System.out.println(sum(5, 1, 3, 7));
    }
}
