class Solution {
    public int scoreOfParentheses(String s) {
        int total = 0, score = 0;
        char prev = ' ';

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(') total++;
            else{
                total--;

                if(prev == '('){
                    score += 1 << total;
                }
            }

            prev = ch;
        }

        return score;
    }
}
