class Solution {
    public int maxArea(int[] height) {
        int leftMax = -1, rightMax = -1;
        int left = 0, right = height.length - 1, curr = 0, maxWater = Integer.MIN_VALUE;

        while(left < right){
            if(leftMax == -1 || height[left] > height[leftMax]) leftMax = left;
            if(rightMax == -1 || height[right] > height[rightMax]) rightMax = right;

            if(height[leftMax] < height[rightMax]) 
                curr = height[leftMax] * (right - leftMax);
            else 
                curr = height[rightMax] * (rightMax - left);

            maxWater = Math.max(curr, maxWater);

            left++;
            right--;
        }

        return maxWater;
    }
}
