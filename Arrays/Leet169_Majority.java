//Boyer–Moore majority voting algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0], count = 1;

        for(int i = 1; i < nums.length; i++){
            if(count == 0 || nums[i] == candidate){
                candidate = nums[i];
                count++;
            }

            else count--;
        }

        return candidate;
    }
}
