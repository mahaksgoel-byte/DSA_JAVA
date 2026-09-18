class Solution {
    public int jump(int[] nums) {
        int n = nums.length, jumps = 0, i = 0, j = 0;

        while(i < n - 1){
            int maxReach = 0;

            for(int k = j; k <= i; k++){
                if(maxReach < k + nums[k]) maxReach = k + nums[k];
            }

            j = i + 1;
            i = maxReach;
            jumps++;
        }

        return jumps;
    }
}
