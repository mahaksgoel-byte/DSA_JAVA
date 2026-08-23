//Mapping array approach
//TC = O(n)
//SC = O(n) -> worst case

class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> result = new ArrayList<>();
        int[] fill = new int[upper + 1];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= lower && nums[i] <= upper){
                fill[nums[i]] = nums[i];
            }
        }

        int i = lower;

        while(i <= upper){
            if(fill[i] != 0){
                i++;
                continue;
            }

            int start = i;

            while(i <= upper && fill[i] == 0) i++;

            List<Integer> temp = new ArrayList<>();

            temp.add(start);
            temp.add(i - 1);

            result.add(temp);
        }

        return result;
    }
}
