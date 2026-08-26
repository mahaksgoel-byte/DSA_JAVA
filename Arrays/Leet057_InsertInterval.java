class Solution {
    public int insertInResult(int start, int end, int[][] result, int idx){
        if(idx != -1 && start <= result[idx][1])
            result[idx][1] = Math.max(result[idx][1], end);
        else{
            result[++idx][0] = start;
            result[idx][1] = end;
        }

        return idx;
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int i = 0, n = intervals.length;

        int[][] result = new int[intervals.length + 1][2];
        int idx = -1;
        
        while(i < n && intervals[i][0] < newInterval[0]){
            idx = insertInResult(intervals[i][0], intervals[i][1], result, idx);
            i++;
        }

        idx = insertInResult(newInterval[0], newInterval[1], result, idx);

        while(i < n){
            idx = insertInResult(intervals[i][0], intervals[i][1], result, idx);
            i++;
        }

        return Arrays.copyOf(result, idx + 1);
    }
}
