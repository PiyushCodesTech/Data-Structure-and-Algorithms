import java.util.Arrays;

public class SortingDecreasingOrder {
    public static void bubbleSort(int [] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int [] arr){
        for(int i = 1; i<arr.length; i++){
            int key = arr[i]; // Current element to insert
            int j = i-1; // Index to compare with

            // Shift the elements in the array greater than key one position ahead
            while(j >= 0 && arr[j] < key){
                arr[j+1] = arr[j];
                j--;
            }
            // Place the key to its correct position
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int [] arr){
        
    }

    public static void main(String[] args) {
        int arr[] = {5,3,9,4,8,2};
        insertionSort(arr);
    }
}
