class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];

        int maxFreq = Integer.MIN_VALUE, count = 0;

        for(int i = 0; i < nums.length; i++){
            freq[nums[i]]++;

            if(freq[nums[i]] > maxFreq){
                maxFreq = freq[nums[i]];
                count = 1;
            }

            else if(freq[nums[i]] == maxFreq) count++;
        }

        return count * maxFreq;
    }
}
