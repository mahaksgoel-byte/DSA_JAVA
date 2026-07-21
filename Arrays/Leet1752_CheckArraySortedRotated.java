
// PIVOT APPROACH
class Solution {
    public boolean check(int[] nums) {
        int pivot = -1, n = nums.length;

        //find pivot (num is greater than next num -> pivot)
        for(int i = 0; i < n - 1; i++){
            if(nums[i] > nums[i + 1]){
                pivot = i;
                break;
            }
        }

        if(pivot != -1){
            //checking if sequence is non-decreasing after pivot
            for(int i = pivot + 1; i < n - 1; i++){
                if(nums[i] > nums[i + 1]) return false;
            }

            //COUNTER CHECK OF - first element of array (assuming rotation) is greater than last of sorted
            if(nums[n - 1] > nums[0]) return false;
        }

        return true;
    }
}

// COUNTING DROPS APPROACH
class Solution {
    public boolean check(int[] nums) {
        int count = 0;

        /* Note: An array A rotated by x positions results in an array B of the same
        length such that B[i] == A[(i+x) % A.length] for every valid index i. */


        //Basically counting points where descent occurs (max possible = 1 if there is rotation else 0)
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > nums[(i + 1) % nums.length])
                count++;
        }

        return count <= 1;
    }
}
