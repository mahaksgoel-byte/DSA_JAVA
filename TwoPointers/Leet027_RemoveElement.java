class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0, k = 0;

        while(j < nums.length){
            if(nums[j] != val){
                nums[k++] = nums[j];
            }

            j++;
        }

        return k;
    }
}
