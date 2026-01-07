import java.util.Arrays;

public class BubbleSort {
    // In bubble sort we move the largest element to edn by swapping after comparing it to other elements
    public static void bubbleSort(int [] arr){
        int n = arr.length;
        for(int turn = 0; turn<n-1; turn++){
            for(int j = 0; j<n-1-turn; j++){
                if(arr[j] > arr[j+1] ){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] arr = {5,4,1,3,2};
        bubbleSort(arr);
    }
}
