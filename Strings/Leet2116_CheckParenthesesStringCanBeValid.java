class Solution {
    public boolean canBeValid(String s, String locked) {
        int len = s.length();
        if(len % 2 != 0) return false;

        int open = 0, close = 0;

        for(int i = 0; i < len; i++){
            if(s.charAt(i) == '(' || locked.charAt(i) == '0') open++;
            else close++;

            if(open < close) return false;
        }

        open = 0;
        close = 0;

        for(int i = len - 1; i >= 0; i--){
            if(s.charAt(i) == ')' || locked.charAt(i) == '0') close++;
            else open++;

            if(close < open) return false;
        }

        return true;
    }
}
