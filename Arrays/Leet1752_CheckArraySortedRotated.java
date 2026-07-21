class Solution {
    public boolean check(int[] nums) {
        int pivot = -1, n = nums.length;

        for(int i = 0; i < n - 1; i++){
            if(nums[i] > nums[i + 1]){
                pivot = i;
                break;
            }
        }

        if(pivot != -1){
            for(int i = pivot + 1; i < n - 1; i++){
                if(nums[i] > nums[i + 1]) return false;
            }

            if(nums[n - 1] > nums[0]) return false;
        }

        return true;
    }
}
