//Optimal SC approach
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n = nums1.length, m = nums2.length;

        int[] result = new int[Math.min(n, m)];
        int idx = -1;

        int i = 0, j = 0;

        while(i < n && j < m){
            if(nums1[i] == nums2[j]){
                if(idx == -1 || result[idx] != nums1[i]) 
                    result[++idx] = nums1[i];

                i++;
                j++;
            }

            else if(nums1[i] < nums2[j]) i++;

            else j++;
        }

        return Arrays.copyOf(result, idx + 1);
    }
}

//Optimal TC approach
class Solution {
    public int[] setOperation(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        int[] result = new int[nums1.length];
        int idx = -1;

        for(int i : nums1) set.add(i);

        for(int j : nums2) {
            if(set.contains(j)){
                result[++idx] = j;
                set.remove(j);
            }
        }

        return Arrays.copyOf(result, idx + 1);
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        
        return (n < m ? setOperation(nums1, nums2) : setOperation(nums2, nums1));
    }
}
