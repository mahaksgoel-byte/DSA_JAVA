//DFS Approach using recursion
class Solution {
    public boolean canReach(int[] arr, int start){
        if(arr[start] == 0) return true;

        int n = arr.length, temp = arr[start];
        arr[start] = -arr[start];

        return (start + temp < n && arr[start + temp] >= 0 && canReach(arr, start + temp)) 
            || (start - temp >= 0 && arr[start  - temp] >= 0 && canReach(arr, start - temp));
        
    }
}
