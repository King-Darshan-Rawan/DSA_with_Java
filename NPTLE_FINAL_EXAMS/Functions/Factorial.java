public class Factorial {
    public static int fact(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }
    public static void main(String[] args) {
        int z = 5;
        int result = fact(z);
        System.out.println(result);
    }
}
