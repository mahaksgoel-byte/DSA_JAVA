class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int max = 0, idx = 0;
        int min = nums1.length < nums2.length ? nums1.length : nums2.length;

        int[] freq = new int[1001];
        int[] result = new int[min];

        for(int i : nums1) freq[i]++;

        for(int i : nums2){
            if(freq[i] > 0){
                freq[i]--;
                result[idx++] = i;
            }
        }

        return Arrays.copyOf(result, idx);
    }
}
