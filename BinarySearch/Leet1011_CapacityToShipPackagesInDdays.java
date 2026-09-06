class Solution {
    public int daysCount(int[] weights, int capacity){
        int totalDays = 1, weight = 0;

        for(int i = 0; i < weights.length; i++){
            int prev = weight;

            weight += weights[i];

            if(weight > capacity){
                totalDays++;
                weight -= prev;
            }
        }

        return totalDays;
    }

    public int shipWithinDays(int[] weights, int days) {
        int maxVal = 0, sum = 0;

        for(int i = 0; i < weights.length; i++){
            if(maxVal < weights[i]) maxVal = weights[i];
            sum += weights[i];
        }

        int left = maxVal, right = sum;

        while(left < right){
            int mid = left + (right - left) / 2;
            int totalDays = daysCount(weights, mid);

            if(totalDays > days) left = mid + 1;
            else right = mid;
        }

        return left;
    }
}
