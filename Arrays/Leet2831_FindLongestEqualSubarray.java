class Solution {
    public int longestEqualSubarray(List<Integer> nums, int k) {
        int n = nums.size(), left = 0, maxFreq = 0;
        int[] count = new int[n + 1];

        for(int right = 0; right < n; right++){
            int num = nums.get(right);

            count[num]++;
            maxFreq = Math.max(maxFreq, count[num]);

            if((right - left + 1) - maxFreq > k){
                count[nums.get(left)]--;
                left++;
            }
        }

        return maxFreq;
    }
}
