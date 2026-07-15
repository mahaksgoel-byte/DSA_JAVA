class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0, sumEven = 0;

        for(int i = 1; i < 2 * n; i += 2){
            sumOdd += i;
            sumEven += i + 1;
        }

        int a = sumOdd, b = sumEven;

        while(b != 0){
            int temp = a;
            a = b;
            b = temp % b;
        }

        return a;
    }
}
