public class Multiplication {
    public static int MultiplicationOfAAndB(int a, int b){
        int mul = a * b;
        return mul;
    }
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int printStm = MultiplicationOfAAndB(x, y);
        System.out.println(printStm);
    }
}
