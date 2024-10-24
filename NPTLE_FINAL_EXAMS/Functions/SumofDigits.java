public class SumofDigits {
    public static int SumDigit(int n){
        int sum = 0;
        while(n != 0){
            int lastDigit = (n % 10);
            sum += lastDigit;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 1114;
        System.out.println("Sum = " + SumDigit(n));
        
    }
}
