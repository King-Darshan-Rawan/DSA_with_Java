import java.util.*;
public class BinarySearch {
    public static void SortArray(int [] arr){
        Arrays.sort(arr);
    }
    public static void InputArray(int [] arr){
        Scanner sc = new Scanner(System.in);
        for (int idx = 0; idx < arr.length; idx++) {
           arr[idx] = sc.nextInt(); 
        }
    }
    public static int ReturnIndex(int []arr, int n){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int avg = (start + end) / 2;  // Moved inside the loop
        
            if (arr[avg] == n) {
                return avg;
            } else if (arr[avg] < n) {
                start = avg + 1;
            } else {
                end = avg - 1;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int [] arr = new int[10];
        InputArray(arr);
        SortArray(arr);
        int n = 11;
        int existance = ReturnIndex(arr, n);
        
        if(existance <= -1){
            System.out.println("value does not exist");
        }
        else {
            System.out.println("The value is at " + (existance + 1));
        }
    }
}
