class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;

        int i = 0, sum = 0;

        for(int j = 0; j < nums.length; j++){
            sum += nums[j];

            while(sum >= target){
                int len = j - i + 1;
                minLength = Math.min(minLength, len);

                sum -= nums[i++];
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
