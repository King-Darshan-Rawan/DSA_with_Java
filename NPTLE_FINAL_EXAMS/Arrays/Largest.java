import java.util.*;

public class Largest {
    public static void InputArray(int [] arr){
        Scanner sc = new Scanner(System.in);
        for (int idx = 0; idx < arr.length; idx++) {
           arr[idx] = sc.nextInt(); 
        }
    }
    public static int LargestNum(int [] arr){
        int sml = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > sml){
                sml = arr[i];
            }
        }
        return sml;
    }
    public static void main(String[] args) {
        int arr[] = new int[10];
        InputArray(arr);
        int lar = LargestNum(arr);
        System.out.println("largest value =" + lar);
    }
}
