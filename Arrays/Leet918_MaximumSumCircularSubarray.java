class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE;
        int min = 0, max = 0, total = 0;

        for(int i : nums){
            total += i;
            min += i;
            max += i;

            minSum = Math.min(minSum, min);
            maxSum = Math.max(maxSum, max);

            if(min > 0) min = 0;
            if(max < 0) max = 0;
        }

        if(maxSum < 0) return maxSum;
        
        return Math.max(maxSum, total - minSum);
    }
}
