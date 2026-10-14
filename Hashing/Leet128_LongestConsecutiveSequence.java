class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0 || n == 1) return n;

        Set<Integer> set = new HashSet<>();
        int maxLen = 1;

        for(int i = 0; i < n; i++) set.add(nums[i]);

        for(int num : set){
            if(!set.contains(num - 1)){
                int curr = num, len = 1;

                while(set.contains(curr + 1)){
                    curr++;
                    len++;
                }

                if(len > maxLen) maxLen = len;
            }
        }

        return maxLen;
    }
}
