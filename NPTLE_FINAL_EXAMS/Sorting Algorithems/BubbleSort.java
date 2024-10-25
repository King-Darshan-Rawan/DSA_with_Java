
public class BubbleSort {

    public static void BubblelyArr(int[] arr) {
        for (int turns = 0; turns <= arr.length - 2; turns++) {
            for (int i = 0; i <= arr.length - 2 - turns; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 3, 4, 0};
        BubblelyArr(arr);
    }
}
