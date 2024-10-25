
public class CountingSort {

    public static void CounterSorter(int[] arr) {
        int n = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            n = Math.max(n, arr[i]);
        }
        int[] counter = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    counter[i] = counter[i] + 1;
                }
            }
        }
        for (int i = 0; i < n + 1; i++) {
            System.out.print(counter[i]);
        }
        int k = 0;
        for (int i = 0; i < counter.length ; i++) {
            while(counter[i]> 0){
                arr[k] = i;
                k++;
                counter[i]--;
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 1, 7, 8, 3, 4, 5, 3, 3, 1};
        CounterSorter(arr);
    }
}
