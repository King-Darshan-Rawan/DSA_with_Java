import java.util.Scanner;

public class LinearSearch {

    // Method to input elements into the array
    public static void inputArray(int[] arr, Scanner sc) {
        System.out.println("Enter " + arr.length + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Method to search for a number and return its position
    public static int resultArray(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;  // Return index if element is found
            }
        }
        return -1;  // Return -1 if element is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int n = 4;  // The number to search for

        // Take input for the array
        inputArray(arr, sc);
        
        // Search for the number in the array
        int position = resultArray(arr, n);

        // Output the result
        if (position != -1) {
            System.out.println("Number is at position = " + position);
        } else {
            System.out.println("Number not found in the array.");
        }
        
        sc.close();  // Close the scanner in main
    }
}
