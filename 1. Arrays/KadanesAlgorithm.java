import java.sql.SQLOutput;

public class KadanesAlgorithm {
    public static boolean areAllNegative(int [] arr){
        // If even one of the array element is non negative then there is no need to handle the special case
        for(int num: arr){
            if(num >= 0){
                return false;
            }
        }
        return true;
    }

    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int num: arr){
            max = Math.max(max,num);
        }
        return max;
    }

    public static int kadanesAlgorithm(int[] nums) {
        //Check if all the array elements are not negative
        if(areAllNegative(nums)){
            int max = findMax(nums);
            return max;
        }

        // We are using Kadane's Algorithm
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length; i++){
            currSum += nums[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int [] arr= {1, -2,6, -1, 3};
        System.out.println(kadanesAlgorithm(arr));

    }
}
