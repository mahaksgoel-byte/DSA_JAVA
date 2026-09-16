class Solution {
    public boolean isValid(int[] dist, int speed, double hour){
        double hours = 0;

        for(int i = 0; i < dist.length - 1; i++){
            hours += (dist[i] + speed - 1) / speed; //integer ceil method

            if(hours > hour) return false; 
        }

        hours += (double) dist[dist.length - 1] / speed;

        return hours <= hour;
    }

    public int minSpeedOnTime(int[] dist, double hour) {
        int n = dist.length;
        if(hour <= n - 1) return -1; // atleast n - 1 hr required because n - 1 trains will take 1 hr each

        int max = 0;
        for(int i : dist){
            if(max < i) max = i;
        }

        int lastSpeed = (int) Math.ceil(dist[n - 1] / (hour - (n - 1))); //speed required for last train
        if(max < lastSpeed) max = lastSpeed;

        if(hour == n) return max; // use maximum speed if hours is equal to trains

        int left = 1, right = max;

        while(left < right){
            int mid = left + (right - left) / 2;

            if(isValid(dist, mid, hour)) right = mid;
            else left = mid + 1;
        }

        return left;
    }
}
