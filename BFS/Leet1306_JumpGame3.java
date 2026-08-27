//BFS Approach using Queue
class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        Queue<Integer> que = new ArrayDeque<>(); 
        que.offer(start); 

        while(!que.isEmpty()){
            int idx = que.poll();

            if(arr[idx] == 0) return true;
            int temp = Math.abs(arr[idx]);

            if(arr[idx] > 0) arr[idx] = -arr[idx];

            if(idx + temp < n && arr[idx + temp] >= 0){
                arr[idx + temp] = -arr[idx + temp];
                que.offer(idx + temp);
            }

            if(idx - temp >= 0 && arr[idx - temp] >= 0){
                arr[idx - temp] = -arr[idx - temp];
                que.offer(idx - temp);
            }
        }

        return false;
    }
}
