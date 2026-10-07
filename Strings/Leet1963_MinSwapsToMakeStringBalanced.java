class Solution {
    public int minSwaps(String s) {
        int total = 0, swaps = 0;

        for(char ch : s.toCharArray()){
            if(ch == '[') total++;

            else{
                if(total == 0) swaps++;
                else total--;
            }
        }

        return (swaps + 1) / 2;
    }
}
