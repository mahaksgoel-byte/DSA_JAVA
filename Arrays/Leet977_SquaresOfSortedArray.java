class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int left = 0, right = nums.length - 1, ptr = nums.length - 1;

        while(left <= right){
            if(Math.abs(nums[left]) < Math.abs(nums[right])){
                result[ptr] = nums[right] * nums[right];
                right--;
            }
            else{
                result[ptr] = nums[left] * nums[left];
                left++;
            }

            ptr--;
        }

        return result;
    }
}
