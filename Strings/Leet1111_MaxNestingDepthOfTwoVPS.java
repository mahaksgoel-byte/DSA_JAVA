class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int len = seq.length();
        int[] result = new int[len];

        int depth = 0;

        for(int i = 0; i < len; i++){

            if(seq.charAt(i) == '('){
                result[i] = depth % 2;
                depth++;
            }

            else{
                depth--;
                result[i] = depth % 2;
            }
        }

        return result;
    }
}
