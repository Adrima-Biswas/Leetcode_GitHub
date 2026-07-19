class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],i);
        }
        int x;
        for(int i = 0; i < nums.length; i++){
           x = target - nums[i];
           if(map.containsKey(x) && map.get(x) != i) return new int[] {i,map.get(x)};
        }
        return new int[] {};
        

    //     for(int i = 0; i < nums.length -1; i++){
    //         for(int j = 0; j < nums.length; j++){
    //             if(nums[i] + nums[j] == target && i != j){
    //                 return new int[]{i,j};
    //             }
    //         }
    //     }
    //     return new int[]{};
     }
}