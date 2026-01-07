public class TrappingRainWater {
    public static int rainwaterTrapping(int [] height){
        int n = height.length;

        // Calculate the left max boundary for the height of the bars
        int [] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // Calculate the right max boundary
        int [] rightMax = new int[n]; 
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        // Traverse through the height of the bars to count the trapped water
        int trappedWater = 0;
        for(int i = 0; i<n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int [] arr = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(rainwaterTrapping(arr));
    }
}
