public class SelectionSort {
    public static void Selection(int [] arr){
        
        for (int i = 0; i<= arr.length - 1; i++){
            int min = i;
            for(int j = i + 1 ; j<= arr.length - 1; j++ ){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr [i];
            arr[i] = temp;
            }
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    }
    public static void main(String [] args){
        int [] arr = {7,2,34,79,0,3};
        Selection(arr);
    }
}
