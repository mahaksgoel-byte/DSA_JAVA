class Solution {
    public int resultIdx(int[][] copy, int target){
        int left = 0, right = copy.length - 1;

        while(left < right){
            int mid = left + (right - left) / 2;

            if(copy[mid][0] < target) left = mid + 1;
            else right = mid;
        }

        return (copy[right][0] >= target) ? copy[right][1] : -1;
    }

    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] result = new int[n];
        int[][] copy = new int[n][2];

        for(int i = 0; i < n; i++){
            copy[i][0] = intervals[i][0];
            copy[i][1] = i;
        }

        Arrays.sort(copy, (a, b) -> Integer.compare(a[0], b[0]));

        for(int i = 0; i < n; i++){
            result[i] = resultIdx(copy, intervals[i][1]);
        }

        return result;
    }
}
