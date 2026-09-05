class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int minCap = Integer.MAX_VALUE, minIdx = -1;

        for(int i = 0; i < capacity.length; i++){
            if(capacity[i] == itemSize) return i;

            if(capacity[i] > itemSize){
                if(minCap > capacity[i]){
                    minCap = capacity[i];
                    minIdx = i;
                }
            }
        }

        return minIdx;
    }
}
