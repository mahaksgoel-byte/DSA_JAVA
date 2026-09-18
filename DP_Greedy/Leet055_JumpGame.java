class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;

        int j = n - 1, i = j - 1;

        while(j > 0 && i > -1){
            if(nums[i] >= j - i) j = i;

            i--;
        }

        return j == 0;
    }
}
