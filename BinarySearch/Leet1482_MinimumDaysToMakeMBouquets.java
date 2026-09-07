class Solution {
    public boolean count(int[] bloomDay, int m, int k, int day){
        int n = bloomDay.length, bouquet = 0, flowers = 0;

        for(int i = 0; i < n; i++){

            if(bloomDay[i] <= day){
                flowers++;

                if(flowers == k){
                    bouquet++;
                    flowers = 0;
                }
            }

            else{
                flowers = 0;
                if((long) (m - bouquet) * k > n - i - 1) break;
            }

            if(bouquet == m) return true; 
        }

        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if((long) m * k > n) return -1;
        
        int minDay = 0, maxDay = 0;

        for(int i = 0; i < bloomDay.length; i++){
            if(minDay > bloomDay[i]) minDay = bloomDay[i];
            if(maxDay < bloomDay[i]) maxDay = bloomDay[i];
        }

        int left = minDay, right = maxDay;

        while(left < right){
            int mid = left + (right - left) / 2;

            boolean bouquet = count(bloomDay, m, k, mid);

            if(bouquet == false) left = mid + 1;
            else right = mid;
        }

        return left;
    }
}
