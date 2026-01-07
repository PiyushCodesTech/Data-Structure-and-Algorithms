public class SearchRotated {
    public static int searchInRotatedArray(int [] nums, int target){
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int target = 3;

        System.out.println(searchInRotatedArray(arr, target));
    }
}
