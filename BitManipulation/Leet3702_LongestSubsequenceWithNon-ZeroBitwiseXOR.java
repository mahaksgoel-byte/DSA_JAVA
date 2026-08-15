class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length, xor = 0;

        for(int i : nums) xor ^= i;

        if(xor != 0) return n;

        for(int i : nums){
            if((xor ^= i) != 0) return n - 1;
        }

        return 0;
    }
}
