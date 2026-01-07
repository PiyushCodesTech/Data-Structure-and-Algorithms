import java.util.Arrays;

public class CountingSort {
    public static void countSort(int [] arr){

        int largest = Integer.MIN_VALUE;
        // Finding the largest value in the original array
        for(int i =0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        // Counting the frequency of each element
        int [] count = new int[largest+1]; // We have use +1 because we start the index from 0
        for(int i = 0; i<arr.length; i++){
            count[arr[i]]++; // This will increase the count on the same index as the number it is occurring
        }

        // Sort the array
        int j = 0;
        for(int i =0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] arr = {1,2,6,5,5,3};
        countSort(arr);
    }
}
