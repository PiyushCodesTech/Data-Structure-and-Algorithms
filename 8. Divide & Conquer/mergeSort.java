
public class mergeSort {
    public static void printArr(int [] arr){
        for (int j : arr) {
            System.out.print(j+" ");
        }
    }
    public static void sortMerge(int [] arr, int si, int ei){

        // Base Case
        if(si >= ei){
            return;
        }

        // Divide the problem
        int mid = si + (ei-si)/2; // Find the mid-index

        sortMerge(arr, si, mid); // Left part
        sortMerge(arr, mid+1, ei); // Right Part

        // Merge
        merge(arr, si, ei, mid);

    }

    public static void merge(int [] arr, int si, int ei, int mid){

        int [] temp = new int[ei-si+1];
        int leftIterator = si;
        int rightIterator = mid+1;
        int tempIterator = 0;

        //Sort the both sides
        while (leftIterator <= mid && rightIterator <=ei){
            if (arr[leftIterator] < arr[rightIterator]){
                temp[tempIterator] = arr[leftIterator];
                leftIterator++;
            } else {
                temp[tempIterator] = arr[rightIterator];
                rightIterator++;
            }
            tempIterator++;
        }

        //If left sie elements are left
        while (leftIterator <= mid){
            temp[tempIterator++] = arr[leftIterator++];
        }

        // If right side elements are left
        while(rightIterator <= ei){
            temp[tempIterator++] = arr[rightIterator++];
        }

        // Copy elements
        for (tempIterator = 0, leftIterator = si; tempIterator < temp.length; tempIterator++,leftIterator++){
            arr[leftIterator] = temp[tempIterator];
        }

    }

    static void main() {
        int [] arr = {3,2,5,6,9,8,1,3};
        sortMerge(arr, 0, arr.length-1);
        printArr(arr);
    }
}
