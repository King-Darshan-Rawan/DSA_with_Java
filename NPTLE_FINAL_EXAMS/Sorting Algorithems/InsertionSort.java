public class InsertionSort {
    public static void InsertionSortArray(int [] arr){
        for(int i = 0; i< arr.length; i++){
            int curr = arr[i];
            int prev = i - 1;
            while(prev >= 0 && arr[prev] > curr ){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1 ] = curr;
        }
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx]);
        }
        System.out.println();
    }
    public static void main (String [] args){
        int [] arr = {1,9,7,0,2,6,3};
        InsertionSortArray(arr);
    }
}
