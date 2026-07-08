//HashMap Solution
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.isEmpty() || !map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }

            else return true;
        }

        return false;
    }
}

//HashSet Solution
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(); 

        for(int i = 0; i < nums.length; i++){
            if(set.isEmpty() || !set.contains(nums[i])) set.add(nums[i]);
            else return true;
        }

        return false;
    }
}
