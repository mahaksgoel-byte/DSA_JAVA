class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length, minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
        int min_idx = -1, max_idx = -1;

        for(int i = 0; i < n; i++){
            if(minVal > nums[i]){
                minVal = nums[i];
                min_idx = i;
            }

            if(maxVal < nums[i]){
                maxVal = nums[i];
                max_idx = i;
            }
        }

        int min = Math.min(min_idx, max_idx), max = Math.max(min_idx, max_idx);

        int front = max + 1;
        int back = n - min;
        int both = (min + 1) + (n - max);

        return Math.min(front, Math.min(back, both));
    }
}
