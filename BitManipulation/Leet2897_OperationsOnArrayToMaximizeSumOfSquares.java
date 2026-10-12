class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int[] bits = new int[31];

        for(int num : nums){
            for(int b = 0; b < 31; b++){
                if((num & (1 << b)) != 0){
                    bits[b]++;
                }
            }
        }

        long sum = 0;
        long mod = 1000000007;

        for(int i = 0; i < k; i++){
            long val = 0;

            for(int b = 30; b >= 0; b--){
                if(bits[b] > 0){
                    val |= (1L << b);
                    bits[b]--;
                }
            }

            sum = (sum + val * val) % mod;
        }

        return (int) sum;
    }
}
