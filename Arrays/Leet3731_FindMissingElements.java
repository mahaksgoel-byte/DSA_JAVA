// APPROACH 1 - TC = O(nlogn) (Sorting), SC = O(1) (auxiliary)

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length, min = nums[0], max = nums[n - 1];
        List<Integer> result = new ArrayList<>();

        int k = 1;

        for(int i = min + 1; i < max; i++){
            if(nums[k] != i){
                result.add(i);
            }

            else k++;
        }

        return result;
    }
}

// APPROACH 2 - TC = O(n), SC = O(n) (HashSet)
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> hs = new HashSet<>(); 

        int minNum = Integer.MAX_VALUE, maxNum = Integer.MIN_VALUE; 

        ArrayList<Integer> ans = new ArrayList<>(); 

        for(int i = 0; i<nums.length; i++){
            maxNum = Math.max(maxNum, nums[i]); 
            minNum = Math.min(minNum, nums[i]); 

            hs.add(nums[i]); 
        }

        for(int i = minNum; i<maxNum; i++){
            if(!hs.contains(i))
                ans.add(i);
        }

        return ans; 
    }
}
