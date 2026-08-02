class Solution {
    public int maxArea(int[] height) {
        int maxWater = Integer.MIN_VALUE;
        int left = 0, right = height.length - 1;

        while(left < right){
            int h = Math.min(height[left], height[right]);
            int water = h * (right - left);
            maxWater = Math.max(maxWater, water);

            while(left < right && height[left] <= h) left++;
            while(left < right && height[right] <= h) right--;
        }

        return maxWater;
    }
}
