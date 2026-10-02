class Solution {
    public void generate(int n, int open, int close, String str, List<String> result){
        if(str.length() == 2 * n){
            result.add(str);
            return;
        }

        if(open < n)
            generate(n, open + 1, close, str + '(', result);
        
        if(close < open)
            generate(n, open, close + 1, str + ')', result);
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(n, 0, 0, "", result);

        return result;
    }
}
