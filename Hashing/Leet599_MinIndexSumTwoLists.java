class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> result = new ArrayList<>();

        for(int i = 0; i < list1.length; i++)
            map.put(list1[i], i);

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < list2.length; i++){
            Integer idx = map.get(list2[i]);

            if(idx != null){
                int sum = i + idx;
                if(min > sum){
                    min = sum;
                    result.clear();
                    result.add(list2[i]);
                }

                else if(min == sum) 
                    result.add(list2[i]);
            }
        }
        
        return result.toArray(new String[0]);
    }
}
