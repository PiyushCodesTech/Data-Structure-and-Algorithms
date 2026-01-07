public class searchInSortedRotatedArray {

    public static int targetIndex(int [] arr, int si, int ei ,int target){

        if (si>ei){
            return -1;
        }

        //Find the mid
        int mid = si + (ei-si)/2;

        if (arr[mid] == target){
            return mid;
        }

        // If the left part is sorted
        if (arr[si] <= arr[mid]){

            if (arr[si] <= target && target <= arr[mid]){
                return targetIndex(arr, si, mid-1, target);
            } else {
                return targetIndex(arr, mid+1, ei, target);
            }

        }  else {
            if (arr[mid] <= target && target <= arr[ei]){
                return targetIndex(arr, mid+1, ei, target);
            } else {
                return targetIndex(arr, si, mid-1, target);
            }
        }
    }

    public static void main(String[] args){
        int [] arr = {4,5,6,7,0,1,2};
        int target = 0;

        int res = targetIndex(arr, 0, arr.length-1, target);
        System.out.println(res);
    }
}
