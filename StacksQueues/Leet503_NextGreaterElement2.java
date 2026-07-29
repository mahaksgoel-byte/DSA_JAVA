class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;

        Stack<Integer> st = new Stack<>();
        int[] result = new int[n];

        for(int i = 0; i < n; i++) result[i] = -1;

        for(int i = 0; i < 2 * n; i++){
            while(!st.isEmpty() && nums[i % n] > nums[st.peek()]){
                result[st.peek()] = nums[i % n];
                st.pop();
            }

            if(i < n) st.push(i);
        }

        return result;
    }
}
