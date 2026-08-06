class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int min = 0, max = 0, minSum = Integer.MAX_VALUE, maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            min += nums[i];
            max += nums[i];

            minSum = Math.min(minSum, min);
            maxSum = Math.max(maxSum, max);

            if(min > 0) min = 0;
            if(max < 0) max = 0;
        }

        return Math.max(Math.abs(maxSum), Math.abs(minSum));
    }
}
