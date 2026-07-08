// In - built
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        int i = 0, j = s.length() - 1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            
            i++;
            j--;
        }

        return true;
    }
}

//Without In - built
class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while(i < j){
            char start = s.charAt(i);
            char end = s.charAt(j);

            if(start >= 65 && start <= 90){ // 65 - 90 = A - Z
                start += (char) 32;
            }

            if(end >= 65 && end <= 90){
                end += (char) 32;
            }

            if((start < 97 || start > 122) && (start < 48 || start > 57)){ // all except for a-z and 0-9 skip
                i++;
                continue;
            }

            if((end < 97 || end > 122) && (end < 48 || end > 57)){
                j--;
                continue;
            }

            if(start != end) return false;

            i++;
            j--;
        }

        return true;
    }
}
