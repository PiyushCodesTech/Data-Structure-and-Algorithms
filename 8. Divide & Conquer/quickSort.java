public class quickSort  {
    public static void printArr(int [] arr){
        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static void quick(int [] arr, int si, int ei){
        // Base Case
        if (si >= ei){
            return;
        }

        int pivotIdx = partition(arr, si, ei);
        quick(arr, si, pivotIdx-1);
        quick(arr, pivotIdx+1, ei);
    }

    public static int partition(int [] arr, int si, int ei ){
        int pivot = arr[ei]; // last element
        int i = si-1;

        for (int j = si; j<ei; j++){
            if (arr[j] <= pivot){
                i++;
                //Swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

}
