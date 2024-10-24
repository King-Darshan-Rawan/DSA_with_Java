public class BinomialCoefficient {
    public static int factorial(int n){
        int rus = 1;
        for (int i = 1; i<=n; i++){
            rus = rus * i;
        }
        return rus;
    }
    public static void main(String [] args){
        int n = 10;
        int r = 2;
        int numerator = factorial(n);
        int dinominator = (factorial(r) * factorial(n - r));
        float results = numerator / dinominator;
        System.out.println(results);
    }
}
