class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long k = (long) k1 + k2;
        int n = nums1.length;
        int[] diff = new int[n];

        for(int i = 0; i < n; i++){
            int temp = nums1[i] - nums2[i];
            if(temp < 0) temp = -temp;

            diff[i] = temp;
        }

        Arrays.sort(diff);

        int i;

        for(i = n - 1; i > 0; i--){
            long req = (long) (diff[i] - diff[i - 1]) * (n - i);

            if(req > k) break;
            k -= req;
        }

        if(i > 0 || k > 0){
            int val = diff[i];
            long reduce = k / (n - i);
            long remainder = k % (n - i);

            while(i < n){
                diff[i] = (int) (val - reduce);

                if(remainder > 0){
                    diff[i]--;
                    remainder--;
                }

                if(diff[i] < 0) diff[i] = 0;
                i++;
            }
        }

        long sum = 0;

        for(int d : diff){
            sum += (long) d * d;
        }

        return sum;
    }
}
