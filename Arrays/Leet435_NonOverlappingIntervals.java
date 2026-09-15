class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int n = intervals.length, i = 0, j = 1, ans = 0;

        while(j < n){
            if(intervals[i][1] > intervals[j][0]) ans++;
            else i = j;

            j++;
        }

        return ans;
    }
}
