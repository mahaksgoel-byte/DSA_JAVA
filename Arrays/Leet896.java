class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length == 1) return true;

        int flag = 0;

        if(nums[0] < nums[1]) flag = 1;

        for(int i = 0; i < nums.length - 1; i++)
            if((flag == 1 && nums[i] > nums[i + 1]) || (flag == 0 && nums[i] < nums[i + 1]))
                return false;

        return true;
    }
}
