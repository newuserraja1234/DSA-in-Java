/*
Q. Given n non-negative integers representing an elevation/height map where the width of each bar is 1, compute how much water it can trap after raining.
height = {4, 2, 0, 6, 3, 2, 5}
*/
public class trappingRainWater {
    public static int trappedRainWater(int []height) {
        //calcluate left max boundary array
        int n = height.length;
        int leftMax[] = new int[n];
        int i;
        // assigned first value of height in leftMax
        leftMax[0] = height[0]; 
        //->(It will start taking value from left side of an element.)
        for(i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // calculate right max boundary array
        int rightMax[] = new int[n];
        // assigned last value of height in rightMax.
        rightMax[n-1] = height[n-1]; 
        //-> (It will start taking value from right side of an element.)
        for(i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        //loop
        int trappedWater = 0;
        for(i = 0; i < n; i++) {
            //waterLevel = min(leftMax, rightMax)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            //trappedWater = WaterLevel - height[i];
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainWater(height));
    }
}