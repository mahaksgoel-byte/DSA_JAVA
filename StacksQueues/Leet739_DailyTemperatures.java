class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length, idx = 0;
        Stack<Integer> st = new Stack<>();
        int[] result = new int[n];

        while(idx < n){
            if(st.isEmpty() || temperatures[idx] <= temperatures[st.peek()]){
                st.push(idx++);
            }

            else{
                result[st.peek()] = idx - st.pop();
            }
        }

        return result;
    }
}
