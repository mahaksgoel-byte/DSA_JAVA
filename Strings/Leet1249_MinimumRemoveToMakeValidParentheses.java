class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length(), total = 0;

        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);

            if(ch == '(') total++;
            else if(ch == ')') total--;

            if(total >= 0) sb.append(ch);
            else total = 0;
        }

        int i = sb.length() - 1;

        while(i >= 0 && total > 0){
            if(sb.charAt(i) == '('){
                sb.deleteCharAt(i);
                total--;
            }

            i--;
        }

        return sb.toString();
    }
}
