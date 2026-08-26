class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];

        for(int i = 0; i < ransomNote.length(); i++){
            int idx = ransomNote.charAt(i) - 'a';
            freq[idx]++;
        }

        for(int i = 0; i < magazine.length(); i++){
            int idx = magazine.charAt(i) - 'a';
            freq[idx]--;
        }

        for(int i = 0; i < 26; i++){
            if(freq[i] > 0) return false;
        }

        return true;
    }
}
