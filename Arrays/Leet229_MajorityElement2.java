class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int n = nums.length, candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == candidate1) count1++;
            else if(nums[i] == candidate2) count2++;

            else if(count1 == 0){
                candidate1 = nums[i];
                count1 = 1;
            }

            else if(count2 == 0){
                candidate2 = nums[i];
                count2 = 1;
            }

            else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == candidate1) count1++;
            if(nums[i] == candidate2) count2++;
        }

        if(count1 > n / 3) result.add(candidate1);
        if(count2 > n / 3 && candidate1 != candidate2) result.add(candidate2);

        return result;
    }
}
