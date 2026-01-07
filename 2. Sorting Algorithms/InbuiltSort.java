// In java there is an inbuilt sorting method that can help in sorting the array in O(log n ) Time complexity

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void printArr(int [] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int [] arr = {12,65,85,74,20,22,30,41,59};

        // To sort in ascending order
        Arrays.sort(arr);
        printArr(arr);
        // We can also pass index if we want to sort the array at any specific indices
        // Arrays.sort(arr, 1, 4); --> We have told the start index and the end index here

        // To sort index in descending order
        // Arrays.sort(arr, Collections.reverseOrder());  --> This will give error for int type because .reverseOrder() works only on object types therefore, we need to change the int[] type to Integer [] arr,


    }
}
