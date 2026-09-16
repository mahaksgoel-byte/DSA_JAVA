class Solution {
    public boolean countHours(int[] dist, int speed, double hour){
        double hours = 0;

        for(int i = 0; i < dist.length - 1; i++){
            hours += (dist[i] + speed - 1) / speed;

            if(hours > hour) return false;
        }

        hours += (double) dist[dist.length - 1] / speed;

        return hours <= hour;
    }

    public int minSpeedOnTime(int[] dist, double hour) {
        int n = dist.length;
        if(hour <= n - 1) return -1;

        int max = 0;
        for(int i : dist){
            if(max < i) max = i;
        } 

        int lastSpeed = (int) Math.ceil(dist[n - 1] / (hour - (n - 1)));
        if(max < lastSpeed) max = lastSpeed;
 
        int left = 1, right = max;

        while(left < right){
            int mid = left + (right - left) / 2;

            if(!countHours(dist, mid, hour)) left = mid + 1;
            else right = mid;
        }

        return left;
    }
}
