class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;

        int[] result = {-1, -1};
        if(n == 0) return result;

        int left = 0, right = n - 1;

        while(left < right){
            int mid = left + (right - left) / 2;

            if(nums[mid] < target) left = mid + 1;
            else right = mid;
        }

        if(left < n && nums[left] == target) result[0] = left;

        left = 0;
        right = n - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] <= target) left = mid + 1;
            else right = mid - 1;
        }

        if(right >= 0 && nums[right] == target) result[1] = right;

        return result;
    }
}
