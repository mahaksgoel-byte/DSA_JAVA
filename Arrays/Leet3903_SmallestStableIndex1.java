class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] min = new int[n]; //suffix array for tracking min
        int maxVal = Integer.MIN_VALUE, minVal = Integer.MAX_VALUE;

        for(int i = n - 1; i >= 0; i--){
            if(minVal > nums[i]) minVal = nums[i];
            min[i] = minVal;
        }

        for(int i = 0; i < n; i++){
            if(maxVal < nums[i]) maxVal = nums[i];
            if(maxVal - min[i] <= k) return i;
        }

        return -1;
    }
}
