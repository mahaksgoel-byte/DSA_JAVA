class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(num * 9 < sum) return "";

        StringBuilder sb = new StringBuilder();

        int req = sum / 9;
        sum %= 9;

        for(int i = 0; i < req; i++)
            sb.append("9");

        if(sum > 0){
            sb.append(sum);
            req += 1;
        }

        for(int i = 0; i < num - req; i++)
            sb.append("0");

        return sb.toString();
    }
}
