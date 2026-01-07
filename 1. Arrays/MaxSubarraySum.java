
// We will be using the prefix array sum to solve this problem which have better time complexity than the brute force method

import java.util.Arrays;

public class MaxSubarraySum {
    public static void maxSubarraySum(int [] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        // Calculate prefix array
        for(int i = 1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        // Calculate maximum sum of the prefix array
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int [] arr= {1, -2,6, -1, 3};
        maxSubarraySum(arr);
    }

}
