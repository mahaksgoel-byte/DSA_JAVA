class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int[] result = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++){
            map.put(nums1[i], i);
            result[i] = -1;
        }

        int idx = 0;

        while(idx < nums2.length){
            while(!st.isEmpty() && nums2[idx] > st.peek()){
                result[map.get(st.peek())] = nums2[idx];
                st.pop();
            }

            if(map.containsKey(nums2[idx])){
                st.push(nums2[idx]);
            }
            
            idx++;
        }

        return result;
    }
}
