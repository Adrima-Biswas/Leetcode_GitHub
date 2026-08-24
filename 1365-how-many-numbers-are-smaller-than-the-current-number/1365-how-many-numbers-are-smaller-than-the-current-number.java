class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        int[] num = new int[nums.length];
        for(int i = 0; i < nums.length; i++){ 
           for(int j = 0; j < nums.length; j++){
            if(j != i && nums[i] > nums[j]){
                count++;
            }
           }
           num[i] = count;
           count = 0;
        }
        return num;
    }
}