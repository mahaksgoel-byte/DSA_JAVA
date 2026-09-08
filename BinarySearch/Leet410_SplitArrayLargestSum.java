class Solution {
    public boolean canSplit(int[] nums, int sum, int k){
        int splits = 1, curr = 0;

        for(int num : nums){
            curr += num;

            if(curr > sum){
                splits++;
                curr = num;
            }
        }

        return splits <= k;
    }
    
    public int splitArray(int[] nums, int k) {
        int left = 0, right = 0;

        for(int i : nums){
            if(left < i) left = i;
            right += i;
        }

        while(left < right){
            int mid = left + (right - left) / 2;

            if(canSplit(nums, mid, k))
                right = mid;
            else 
                left = mid + 1;
        }

        return left;
    }
}
