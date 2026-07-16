// SOLUTION 1
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

// SOLUTION 2 - sum of first n odd nums is n * n and first even nums is n * (n + 1) hence GCD is n
class Solution {
    public int gcdOfOddEvenSums(int n) {
        return n; 
    }
}
