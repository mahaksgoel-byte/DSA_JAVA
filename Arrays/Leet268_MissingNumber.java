class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum = 0, expectedSum = n * (n + 1) / 2;

        for(int i : nums) actualSum += i;

        return expectedSum - actualSum;
    }
}
