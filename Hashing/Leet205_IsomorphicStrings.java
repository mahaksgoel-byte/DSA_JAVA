// Two HashMap Approach
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> s_map = new HashMap<>();
        HashMap<Character, Character> t_map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char s_ch = s.charAt(i), t_ch = t.charAt(i);

            if(s_map.containsKey(s_ch) && s_map.get(s_ch) != t_ch) return false;

            if(t_map.containsKey(t_ch) && t_map.get(t_ch) != s_ch) return false;

            s_map.put(s_ch, t_ch);

            t_map.put(t_ch, s_ch);
        }

        return true;
    }
}

//One HashMap Approach
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            Character s_ch = s.charAt(i), t_ch = t.charAt(i);

            if(map.containsKey(s_ch) && map.get(s_ch) != t_ch) return false;

            else if(map.containsValue(t_ch) && map.get(s_ch) != t_ch) return false;

            map.put(s_ch, t_ch);
        }

        return true;
    }
}
//imp concept: Character vs char and unboxing
