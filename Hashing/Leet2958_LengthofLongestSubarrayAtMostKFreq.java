class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int i = 0, maxLen = 0;

        for(int j = 0; j < nums.length; j++){
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            if(map.get(nums[j]) > k){
                while(nums[i] != nums[j]){
                    map.put(nums[i], map.get(nums[i]) - 1);
                    i++;
                }
                
                map.put(nums[i], map.get(nums[i]) - 1);
                i++;
            }

            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;
    }
}
