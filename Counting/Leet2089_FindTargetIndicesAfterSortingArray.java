class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        int count_less = 0, count_target = 0;

        for(int i : nums){
            if(i < target) count_less++;
            else if(i == target) count_target++;
        }

        for(int i = 0; i < count_target; i++){
            result.add(count_less++);
        }

        return result;
    }
}
