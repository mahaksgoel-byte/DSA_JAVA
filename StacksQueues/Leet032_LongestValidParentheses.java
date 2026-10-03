class Solution {
    public int longestValidParentheses(String s) {
        int len = s.length(), maxLen = 0, top = 0;
        int[] stack = new int[len + 1];
        stack[0] = -1;

        for(int i = 0; i < len; i++){
            if(s.charAt(i) == '(') stack[++top] = i;
            else --top;

            if(top < 0) stack[++top] = i;
            else maxLen = Math.max(maxLen, i - stack[top]);
        }

        return maxLen;
    }
}
