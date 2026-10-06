class Solution {
    public int minAddToMakeValid(String s) {
       int len = s.length(), total = 0, min = 0;

       for(int i = 0; i < len; i++){
            char ch = s.charAt(i);

            if(ch == '(') total++;
            else {
                total--;

                if(total < 0){
                    min++;
                    total = 0;
                }
            }
        }

        min += total;
        return min;
    }
}
