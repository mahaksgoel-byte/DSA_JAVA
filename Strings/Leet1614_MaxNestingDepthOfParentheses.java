class Solution {
    public int maxDepth(String s) {
        int total = 0, depth = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(') total++;
            else if(ch == ')') total--;

            if(depth < total) depth = total;
        }

        return depth;
    }
}
