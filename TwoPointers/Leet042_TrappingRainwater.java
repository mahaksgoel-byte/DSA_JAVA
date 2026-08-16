class Solution {
    public int trap(int[] height) {
        int n = height.length;

        if(n < 3) return 0;

        int left = 0, right = n - 1;
        int leftMax = Integer.MIN_VALUE, rightMax = Integer.MIN_VALUE;
        int water = 0;

        while(left < right){
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            int curr = 0;

            if(leftMax < rightMax) curr = leftMax - height[left++];
            else curr = rightMax - height[right--];

            water += curr;
        }

        return water;
    }
}
