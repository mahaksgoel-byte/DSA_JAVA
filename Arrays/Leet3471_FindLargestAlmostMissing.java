class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        if(k == 1){
            HashMap<Integer, Integer> map = new HashMap<>();
            int max = -1;

            for(int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);

            for(int i : nums){
                if(map.get(i) == 1 && max < i) max = i;
            }

            return max;
        }

        else if(k > 1 && k < n){
            int first = nums[0], last = nums[n - 1];

            for(int i = 0; i < n; i++){
                if(i > 0 && nums[i] == first) first = -1;
                if(i < n - 1 && nums[i] == last) last = -1;
            }

            return Math.max(first, last);
        }

        else{
            int max = -1;
            for(int i : nums) max = Math.max(max, i);

            return max;
        }
    }
}
