class Solution {
    public int sumCounts(List<Integer> nums) {
        int len = nums.size();
        long ans = 0;

        for(int i = 0; i < len; i++){
            int count = 0;
            Set<Integer> st = new HashSet<>();

            for(int j = i; j < len; j++){
                int val = nums.get(j);

                if(!st.contains(val)){
                    st.add(val);
                    count++;
                }

                ans = ans + (long) count * count;
            }
        }

        return (int) ans;
    }
}
