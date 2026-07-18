class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;

        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                pivot = i;
                break;
            }
        }

        int minIndex = -1;

        if(pivot != -1){
            int min = Integer.MAX_VALUE;
            for(int i = nums.length - 1; i > pivot; i--){
                if(nums[i] < min && nums[i] > nums[pivot]){ // Very Important Condition
                    min = nums[i];
                    minIndex = i;
                }
            }

            int temp = nums[pivot];
            nums[pivot] = nums[minIndex];
            nums[minIndex] = temp;
        }

        int i = pivot + 1, j = nums.length - 1;

        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }
}
