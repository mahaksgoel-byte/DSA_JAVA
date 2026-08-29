class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        boolean[] multiples = new boolean[n + 2];

        for(int i : nums){
            if(i % k == 0){
                if(i / k <= (n + 1))
                    multiples[i / k] = true;
            }
        }

        for(int i = 1; i <= n + 1; i++){
            if(multiples[i] == false) return i * k;
        }

        return -1;
    }
}
