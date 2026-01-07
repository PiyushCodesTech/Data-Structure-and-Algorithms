import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {12, 31, 35, 65, 59};

        int start = 0;
        int end = arr.length-1;

        // Here we swap the elements of the array and reverse the array without using extra space
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
