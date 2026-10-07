class Solution {
    Set<String> st;
    int n;
    int maxLen;

    public void generate(String s, String curr, int i, int count){
        if(count < 0) return;

        if(i == n){
            if(count == 0){
                if(curr.length() > maxLen){
                    maxLen = curr.length();
                    st.clear();
                }

                if(curr.length() == maxLen){
                    st.add(curr);
                }
            }

            return;
        }

        char ch = s.charAt(i);

        if(ch != '(' && ch != ')')
            generate(s, curr + ch, i + 1, count);

        else{
            generate(s, curr + ch, i + 1, (ch == '(') ? count + 1 : count - 1);
            generate(s, curr, i + 1, count);
        }
    }

    public List<String> removeInvalidParentheses(String s) {
        st = new HashSet<>();
        n = s.length();
        maxLen = 0;

        generate(s, "", 0, 0);
        List<String> result = new ArrayList<>(st);

        return result;
    }
}
