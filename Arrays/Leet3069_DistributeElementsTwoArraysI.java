class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] arr2 = new int[n];

        arr2[0] = nums[1];

        int i = 2, idx1 = 0, idx2 = 0;

        while(i < n){
            if(nums[idx1] > arr2[idx2]) nums[++idx1] = nums[i++];
            else arr2[++idx2] = nums[i++];
        }

        int j = 0;

        while(idx1 < n - 1){
            nums[++idx1] = arr2[j++];
        }

        return nums;
    }
}
