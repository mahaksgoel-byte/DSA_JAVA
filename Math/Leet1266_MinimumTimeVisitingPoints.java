class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n = points.length, time = 0;

        for(int i = 1; i < n; i++){
            int dis_x = Math.abs(points[i][0] - points[i - 1][0]);
            int dis_y = Math.abs(points[i][1] - points[i - 1][1]);

            time += Math.max(dis_x, dis_y);
        }

        return time;
    }
}
