class Solution {
    public boolean isMonotonic(int[] nums) {
        int inc = -1;

        for(int i = 0; i < nums.length - 1; i++){
            if(inc == -1){
                if(nums[i] < nums[i + 1]) inc = 1;
                else if(nums[i] > nums[i + 1]) inc = 0;
            }

            else if((inc == 1 && nums[i] > nums[i + 1]) || (inc == 0) && nums[i] < nums[i + 1])
                return false;
        }

        return true;
    }
}
