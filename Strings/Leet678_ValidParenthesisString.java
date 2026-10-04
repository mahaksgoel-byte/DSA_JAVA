class Solution {
    public boolean checkValidString(String s) {
        int len = s.length();

        int open = 0, close = 0;

        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '*') open++;
            else close++;

            if(open - close < 0) return false;
        }

        open = 0;
        close = 0;

        for(int i = len - 1; i >= 0; i--){
            char ch = s.charAt(i);
            if(ch == ')' || ch == '*') close++;
            else open++;

            if(close - open < 0) return false;
        }

        return true;
    }
}
