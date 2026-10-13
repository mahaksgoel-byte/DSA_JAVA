class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(nums[i] < 0) nums[i] = -nums[i];
        }

        Arrays.sort(nums);

        int k = (n % 2 == 0) ? n / 2 : (n + 1) / 2, i;
        long sum = 0;

        for(i = n - 1; i > n - k - 1; i--){
            sum = sum + (long) nums[i] * nums[i];
        }

        while(i >= 0){
            sum = sum - (long) nums[i] * nums[i];
            i--;
        }

        return sum;
    }
}
